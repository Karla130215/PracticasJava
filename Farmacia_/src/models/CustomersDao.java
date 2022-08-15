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

public class CustomersDao {
    //todos los metodos de customers

    ConnectionMySQL cn = new ConnectionMySQL();
    Connection conn;
    PreparedStatement pst;//sirve para las consultas
    ResultSet rs;//para obtener datos de las consultas

//registrar cliente
    public boolean registerCustomer(Customers customer) {
        String query = "INSERT INTO customers(id,full_name,address,telephone,email,created,updated)"
                + "values(?,?,?,?,?,?,?)";
        Timestamp datetime = new Timestamp(new Date().getTime());
        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            pst.setInt(1, customer.getId());
            pst.setString(2, customer.getFull_name());
            pst.setString(3, customer.getAddress());
            pst.setString(4, customer.getTelephone());
            pst.setString(5, customer.getEmail());
            pst.setTimestamp(6, datetime);
            pst.setTimestamp(7, datetime);
            pst.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar al cliente");
            return false;

        }
    }

    //listar clientes el argumento que tiene nos sirve para hacer busquedas
    public List listCustomerQuery(String value) {
        //creacion d evariable tipo list del objeto customers
        List<Customers> list_customers = new ArrayList();
        String query = "SELECT * FROM customers";
        String query_search_customer = "SELECT * FROM customers WHERE id like='%" + value + "%'";
        try {
            conn = cn.getConnection();
            if (value.equalsIgnoreCase("")) {
                pst = conn.prepareStatement(query);
                rs = pst.executeQuery();
            } else {
                pst = conn.prepareStatement(query_search_customer);
                rs = pst.executeQuery();

            }
            while (rs.next()) {
                Customers customer = new Customers();
                customer.setId(rs.getInt("id"));
                customer.setFull_name(rs.getString("full_name"));
                customer.setAddress(rs.getString("address"));
                customer.setTelephone(rs.getString("telephone"));
                customer.setEmail(rs.getString("email"));
                //agregamos todo esto en la lista que creamos
                list_customers.add(customer);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());

        }
        return list_customers;
    }
    //Modifucar clientes
     public boolean updateCustomer(Customers customer) {
        String query = "UPDATE customers SET full_name=?,address=?,telephone=?,email=?,updated=?"
                + "where id=?";
        Timestamp datetime = new Timestamp(new Date().getTime());
        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);

            pst.setString(1, customer.getFull_name());
            pst.setString(2, customer.getAddress());
            pst.setString(3, customer.getTelephone());
            pst.setString(4, customer.getEmail());
            pst.setTimestamp(5, datetime);
            pst.setInt(6, customer.getId());
            pst.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al Modificar los datos del cliente");
            return false;

        }
        
    }
     //Eliminar cliente
      public boolean deleteCustomerQuery(int id) {
        String query = "delete from customers where id=" + id;
        Timestamp datetime = new Timestamp(new Date().getTime());
        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            pst.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No puede eliminar un cliente que tenga relacion con otra tabla");
            return false;

        }
    }
}
