package models;

import java.sql.Timestamp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SuppliersDao {

    //instanciar la conexion
    ConnectionMySQL cn = new ConnectionMySQL();
    Connection conn;
    PreparedStatement pst;//sirve para las consultas
    ResultSet rs;//para obtener datos de las consultas
    //metodo de registrar proveedor

    public boolean registerSupplierQuery(Suppliers suppliers) {
        String query = "INSERT INTO suppliers(name,description,address,telephone,email,city,created,updated)"
                + "VALUES(?,?,?,?,?,?,?,?) ";
        Timestamp datetime = new Timestamp(new Date().getTime());
        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            pst.setString(1, suppliers.getName());
            pst.setString(2, suppliers.getDescription());
            pst.setString(3, suppliers.getAddress());
            pst.setString(4, suppliers.getTelephone());
            pst.setString(5, suppliers.getEmail());
            pst.setString(6, suppliers.getCity());
            pst.setTimestamp(7, datetime);
            pst.setTimestamp(8, datetime);
            pst.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar el proveedor");
            return false;
        }
    }

    //Enlistar proveedores
    public List listSuppliersQuery(String value) {
        List<Suppliers> list_suppliers = new ArrayList();
        String query = "SELECT * FROM suppliers";
        String query_search_suppliers = "SELECT * FROM suppliers where name like '%" + value + "%'";
        try {
            conn = cn.getConnection();
            if (value.equalsIgnoreCase("")) {
                pst = conn.prepareStatement(query);
                rs = pst.executeQuery();

            } else {
                pst = conn.prepareStatement(query_search_suppliers);
                rs = pst.executeQuery();
            }
            while (rs.next()) {
                Suppliers suppliers = new Suppliers();
                suppliers.setId(rs.getInt("id"));
                suppliers.setName(rs.getString("name"));
                suppliers.setDescription(rs.getString("description"));
                suppliers.setAddress(rs.getString("address"));
                suppliers.setTelephone(rs.getString("telephone"));
                suppliers.setEmail(rs.getString("email"));
                suppliers.setCity(rs.getString("city"));

                list_suppliers.add(suppliers);

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
        return list_suppliers;
    }

    //modificar proveedor
    public boolean updateSuppliersQuery(Suppliers suppliers) {
        String query = "UPDATE SET suppliers name=?,description=?,address=?,telephone=?,email=?,city=?,updated=?"
                + "WHERE id=?";
        Timestamp datetime = new Timestamp(new Date().getTime());
        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);

            pst.setString(1, suppliers.getName());
            pst.setString(2, suppliers.getDescription());
            pst.setString(3, suppliers.getAddress());
            pst.setString(4, suppliers.getTelephone());
            pst.setString(5, suppliers.getEmail());
            pst.setString(6, suppliers.getCity());
            pst.setTimestamp(7, datetime);
            pst.setInt(8, suppliers.getId());
            pst.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al Modificar los datos del Proveedor" + e);
            return false;
        }
    }
    //eliminar proveedor

    public boolean deleteSuppliersQuery(int id) {
        String query = "DELETE FROM suppliers where id=" + id;
        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            pst.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se puede borrar proveedor que tiene relacion con otra tabla");
        }
        return false;
    }
}
