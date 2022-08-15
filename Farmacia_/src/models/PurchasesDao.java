package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Date;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

public class PurchasesDao {

    ConnectionMySQL cn = new ConnectionMySQL();
    Connection conn;
    PreparedStatement pst;//sirve para las consultas
    ResultSet rs;//para obtener datos de las consultas

    //registrar compra
    public boolean registerPurchaseQuery(int supplier_id, int employe_id, double total) {
        String query = "INSERT INTO purchases (supplier_id,employe_id,total,created)"
                + "VALUES(?,?,?,?)";
        Timestamp datetime = new Timestamp(new Date().getTime());
        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            pst.setInt(1, supplier_id);
            pst.setInt(2, employe_id);
            pst.setDouble(3, total);
            pst.setTimestamp(4, datetime);
            pst.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al insertar la compra");
            return false;
        }

    }

    //registrar detalles de la compra
    public boolean registerPurchaseDetailQuery(int pruchase_id, double purchase_price, int pruchase_amount,
            double purchase_subtotal, int product_id) {

        String query = "INSERT INTO purchase_detail(purchase_id,purchase_price,purchase_amaunt,puchase_subtotal,product_id)"
                + "VALUES(?,?,?,?,?)";
        Timestamp datetime = new Timestamp(new Date().getTime());
        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            pst.setInt(1, pruchase_id);
            pst.setDouble(2, purchase_price);
            pst.setInt(3, pruchase_amount);
            pst.setDouble(4, purchase_subtotal);
            pst.setTimestamp(5, datetime);
            pst.setInt(6, product_id);
            pst.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al insertar los detalles de compra");
            return false;
        }

    }

    //obtener id de la compra
    public int purchaseId() {
        int id=0;
        String query = "SELECT MAX(id) as id from purchases";
        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            rs=pst.executeQuery();
            if (rs.next()) {
                id=rs.getInt("id");
                
            }
            
          
           
        } catch (SQLException e) {
           System.err.println(e.getMessage());
        }
        return id;
    }
    //listar todas las compras realizadas
    public List listAllPurchaseQuery(){
        List<Purchases>
    }


}
