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

public class CategoriesDao {

    //instanciar la conexion
    ConnectionMySQL cn = new ConnectionMySQL();
    Connection conn;
    PreparedStatement pst;//sirve para las consultas
    ResultSet rs;//para obtener datos de las consultas

    //registar Categorias
    public boolean registerCategoryQuery(Categories category) {
        String query = "INSERT INTO categories(name,created,updated)VALUES(?,?,?) ";
        Timestamp datetime = new Timestamp(new Date().getTime());
        try {
            conn=cn.getConnection();
            pst=conn.prepareStatement(query);
            pst.setString(1, category.getName());
            pst.setTimestamp(2, datetime);
            pst.setTimestamp(3, datetime);
            pst.execute();
            return true;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se inserto correcto la categoria");
            return false;
        }
        
    }
    //listar Categorias
    public List listCategoriesQuery(String value){
        List<Categories>list_categories=new ArrayList();
        String query="SELECT * FROM categories";
        String query_search_category="SELECT * FROM categories where name like '%"+value+"'%";
        try {
            conn = cn.getConnection();
            if (value.equalsIgnoreCase("")) {
                pst = conn.prepareStatement(query);
                rs = pst.executeQuery();

            } else {
                pst = conn.prepareStatement(query_search_category);
                rs = pst.executeQuery();
            }
            while(rs.next()){
                Categories category=new Categories();
                category.setId(rs.getInt("id"));
                category.setName(rs.getString("name"));
                list_categories.add(category);
            
            }
    }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
           
        }
         return list_categories;
    }
    //modificar categoria
      public boolean updateCategoriesQuery(Suppliers suppliers) {
        String query = "UPDATE SET categories name=?,description=?,address=?,telephone=?,email=?,city=?,updated=?"
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
       //Eliminar Category
            public boolean deleteCategoryQuery(int id) {
        String query = "DELETE FROM categories where id=" + id;
        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            pst.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se puede borrar categoria que tiene relacion con otra tabla");
        }
        return false;
    }
}
