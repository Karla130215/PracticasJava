package models;

import java.sql.Timestamp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

public class EmployeesDao {
//Todos los metodos que permitiran interactuar con mysql

    //instanciar la conexion
    ConnectionMySQL cn = new ConnectionMySQL();
    Connection conn;
    PreparedStatement pst;//sirve para las consultas
    ResultSet rs;//para obtener datos de las consultas

    //variables para enviar interfaces
    public static int id_user = 0;
    public static String full_name_user = "";
    public static String username_user = "";
    public static String telephone_user = "";
    public static String address_user = "";
    public static String email_user = "";

    public static String roll_user = "";

    //metodo del login
    public Employees LoginQuery(String user, String password) {
        String query = "select * from employees WHERE username =? and password=?";

        Employees employe = new Employees();
        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            pst.setString(1, user);
            pst.setString(2, password);
            rs = pst.executeQuery();
            if (rs.next()) {
                employe.setId(rs.getInt("id"));
                id_user = employe.getId();
                employe.setFull_name(rs.getString("full_name"));
                full_name_user = employe.getFull_name();
                employe.setUserName(rs.getString("username"));
                username_user = employe.getUserName();
                employe.setAddress(rs.getString("address"));
                address_user = employe.getAddress();
                employe.setTelephone(rs.getString("telephone"));
                telephone_user = employe.getTelephone();
                employe.setEmail(rs.getString("email"));
                email_user = employe.getEmail();
                employe.setRoll(rs.getString("roll"));
                roll_user = employe.getRoll();

            }
        } catch (SQLException e) {
            //null para que aparezca al centro
            JOptionPane.showMessageDialog(null, "Error al obtener el empleado" + e);
        }
        return employe;
    }

    //registra empleado
    public boolean registerEmployeQuery(Employees employee) {
        String query = "Insert into employees(id,full_name,username,address,telephone,email,password,rol,created,updated)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?)";
        Timestamp datetime = new Timestamp(new Date().getTime());
        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            pst.setInt(1, employee.getId());
            pst.setString(2, employee.getFull_name());
            pst.setString(3, employee.getUserName());
            pst.setString(4, employee.getAddress());
            pst.setString(5, employee.getTelephone());
            pst.setString(6, employee.getEmail());
            pst.setString(7, employee.getPassword());
            pst.setString(8, employee.getRoll());
            pst.setTimestamp(9, datetime);
            pst.setTimestamp(10, datetime);
            pst.executeQuery();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registar al usuario" + e);
            return false;
        }
    }

    //listar empleados
    public List listEmployeesQuery(String value) {
        List<Employees> list_employees = new ArrayList();
        String query = "SELECT*FROM employees ORDER BY roll ASC";
        String query_search_employee = "select * from employees where id LIKE '%" + value + "&";
        try {
            conn = cn.getConnection();
            if (value.equalsIgnoreCase("")) {
                pst = conn.prepareStatement(query);
                rs = pst.executeQuery();
            } else {
                pst = conn.prepareStatement(query_search_employee);
                rs = pst.executeQuery();

            }
            while (rs.next()) {
                Employees employee = new Employees();
                employee.setId(rs.getInt("id"));
                employee.setFull_name(rs.getString("full_name"));
                employee.setUserName(rs.getString("username"));
                employee.setAddress(rs.getString("address"));
                employee.setTelephone(rs.getString("telephone"));
                employee.setEmail(rs.getString("email"));
                employee.setRoll(rs.getString("roll"));
                list_employees.add(employee);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());

        }
        return list_employees;
    }
    //modificar empleado

    public boolean updateEmployeQuery(Employees employee) {
        String query = "UPDATE SET employees full_name=?,username=?,address=?,telephone=?,email=?,rol=?,updated=?)"
                + "where id=?";
        Timestamp datetime = new Timestamp(new Date().getTime());
        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);

            pst.setString(1, employee.getFull_name());
            pst.setString(2, employee.getUserName());
            pst.setString(3, employee.getAddress());
            pst.setString(4, employee.getTelephone());
            pst.setString(5, employee.getEmail());
            pst.setString(6, employee.getRoll());
            pst.setTimestamp(7, datetime);
            pst.setInt(8, employee.getId());
            pst.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al Modificar los datos del usuario" + e);
            return false;
        }
    }

    //eliminar empleado
    public boolean deleteEmployeQuery(int id) {
        String query = "delete from employees where id=" + id;
        Timestamp datetime = new Timestamp(new Date().getTime());
        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            pst.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No puede eliminar un empleado que tenga relacion con otra tabla");
            return false;

        }
    }

    //metodo para cambiar a contraseña
    public boolean updateEmployeePassword(Employees employee) {
        String query = "UPDATE employees set password=? WHERE username='" + username_user + "'";
        try {
            conn=cn.getConnection();
            pst=conn.prepareStatement(query);
            pst.setString(1, employee.getPassword());
            pst.executeUpdate();
            return true;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ha ocurrido un error al modificar la contraseña");
            return false;
        }
    }
}
