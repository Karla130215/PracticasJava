package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    //instanciar la conexion

    ConnectionMySQL cn = new ConnectionMySQL();
    Connection conn;
    PreparedStatement pst;//sirve para las consultas
    ResultSet rs;//para obtener datos de las consultas

    //registar producto
    public boolean registrarProductoQuery(Products products) {
        String query = "INSERT INTO products(code,name,description,unit_price,created,updated,category_id)"
                + "VALUES(?,?,?,?,?,?,?)";
        Timestamp datetime = new Timestamp(new Date().getTime());

        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            pst.setInt(1, products.getCode());
            pst.setString(2, products.getName());
            pst.setString(3, products.getDescription());
            pst.setDouble(4, products.getUnit_price());
            pst.setTimestamp(5, datetime);
            pst.setTimestamp(6, datetime);
            pst.setInt(7, products.getCategory_id());
            pst.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se registro el producto correctamente");
            return false;
        }

    }

    //listar productos
    public List listProductQuery(String value) {
        List<Products> list_products = new ArrayList();
        String query = "select pro.*,ca.nombre AS category_name from products pro,categories ca WHERE pro.category_id=ca.id";
        String query_search_products = "SELECT pro.*,ca.nombre AS category_name From products pro INNER JOIN categories ca"
                + "ON pro.category_id=ca.id where pro.name like '%" + value + "'%";
        try {
            conn = cn.getConnection();
            if (value.equalsIgnoreCase("")) {
                pst = conn.prepareStatement(query);
                rs = pst.executeQuery();
            } else {
                pst = conn.prepareStatement(query_search_products);
                rs = pst.executeQuery();

            }

            while (rs.next()) {
                Products product = new Products();
                product.setId(rs.getInt("id"));
                product.setCode(rs.getInt("code"));
                product.setName(rs.getString("name"));
                product.setDescription(rs.getString("description"));
                product.setUnit_price(rs.getDouble("unit_price"));
                product.setProduct_quantity(rs.getInt("product_quantity"));
                product.setCategory_name(rs.getString("category_name"));
                list_products.add(product);

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());

        }
        return list_products;
    }

    //modificar productos
    public boolean updateProducts(Products products) {
        String query = "UPDATE products SET code=?,description=?,unit_price=?,"
                + "category_id=? where id=?";
        Timestamp datetime = new Timestamp(new Date().getTime());
        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);

            pst.setInt(1, products.getCode());
            pst.setString(2, products.getName());
            pst.setString(3, products.getDescription());
            pst.setDouble(4, products.getUnit_price());
            pst.setTimestamp(5, datetime);
            pst.setInt(6, products.getCategory_id());
            pst.setInt(7, products.getId());
            pst.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al Modificar los datos del Productos");
            return false;

        }

    }

    //Eliminar cliente
    public boolean deleteProductsQuery(int id) {
        String query = "delete from products where id=" + id;
        Timestamp datetime = new Timestamp(new Date().getTime());
        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            pst.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No puede eliminar un producto que tenga relacion con otra tabla");
            return false;

        }
    }
    //Buscar producto

    public Products searchProduct(int id) {
        String query = "SELECT pro.*,ca.name AS category_name FROM products pro"
                + "INNER JOIN categories cs ON pro.category_id=ca.id where pro.id=?";
        Products product = new Products();
        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            if (rs.next()) {
                product.setId(rs.getInt("id"));
                product.setCode(rs.getInt("code"));
                product.setName(rs.getString("name"));
                product.setDescription(rs.getString("description"));
                product.setUnit_price(rs.getDouble("unit_price"));
                product.setCategory_id(rs.getInt("category_id"));
                product.setCategory_name(rs.getString("category_name"));

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return product;
    }

    //buscar producto por codigo
    public Products searchCode(int code) {
        String query = "SELECT  pro.id,pro.name from products pro where code=?";
        Products product = new Products();
        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            pst.setInt(1, code);
            rs = pst.executeQuery();
            if (rs.next()) {
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return product;

    }

    //traer la cantidad de productos
    public Products searchId(int id) {
        String query = "SELECT pro.product_quantity FROM products pro where pro.id=?";
        Products product = new Products();
        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            if (rs.next()) {
                product.setProduct_quantity(rs.getInt("Product_quantity"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
        return product;

    }
    //Actualizar Stock

    public boolean updateStockQuery(int amaunt, int product_id) {
        String query = "UPDATE products SET products_quantity=? where id=?";
        try {
            conn=cn.getConnection();
            pst=conn.prepareStatement(query);
            pst.setInt(1, amaunt);
            pst.setInt(2, product_id);
            pst.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }
}
