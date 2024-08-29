/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import entity.Account;
import entity.Category;
import entity.Order;
import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class DAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<Product> getAllProduct() {
        List<Product> list = new ArrayList<>();
        String sql = "select * from products";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(
                        new Product(
                                rs.getInt(1),
                                rs.getString(2),
                                rs.getDouble(3),
                                rs.getString(4),
                                rs.getString(5)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> getTop6() {
        List<Product> list = new ArrayList<>();
        String sql = "select top 6 * from products";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(
                        new Product(
                                rs.getInt(1),
                                rs.getString(2),
                                rs.getDouble(3),
                                rs.getString(4),
                                rs.getString(5)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Category> getAllCategory() {
        List<Category> list = new ArrayList<>();
        String query = "select * from Category";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Category(rs.getInt(1),
                        rs.getString(2)));
            }
        } catch (Exception e) {

        }
        return list;
    }
    
    
    public List<Product> getLast() {
        List<Product> list = new ArrayList<>();
        String query = "select top 5 * from products\n"
                + "order by product_id desc";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getString(4),
                        rs.getString(5)));
            }
        } catch (Exception e) {
        }

        return null;
    }

    public List<Product> getProByCate(String category_id) {
        List<Product> list = new ArrayList<>();
        String query = "select * from products\n"
                + "where category_id = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, category_id);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getString(4),
                        rs.getString(5)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public Product getProById(String product_id) {

        String query = "select * from products\n"
                + "where product_id = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, product_id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getString(4),
                        rs.getString(5));
            }
        } catch (Exception e) {
        }
        return null;

    }
    
    public Category getCateById(int category_id) {
        
        String query = "select * from category\n"
                + "where category_id = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, category_id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Category(category_id, rs.getString("category_name"));
            }
        } catch (Exception e) {
        }
        return null;

    }

    public List<Product> getSearchByName(String txtSearch) {
        List<Product> list = new ArrayList<>();
        String query = "select  * from products\n"
                + "where product_name like ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txtSearch + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getString(4),
                        rs.getString(5)));
            }
        } catch (Exception e) {
        }
        return null;

    }

    public Account login(String username, String password) {
        String query = "select  * from accounts\n"
                + "where username = ?\n"
                + "and password = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public Account checkAccExist(String username) {
        String query = "select  * from accounts\n"
                + "where username = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, username);

            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public void register(String username, String password) {
        String query = "insert into accounts\n"
                + "values (?,?,0,0)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void deleteProduct(String product_id) {
        String query = "delete from products\n"
                + "where product_id = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, product_id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void insertProduct(String product_name, String list_price, String category_name,
            String img, int category_id) {
        String query = "INSERT [dbo]. [products] \n"
                + "([product_name], [list_price], [category_name], [img], [category_id])\n"
                + "VALUES (?, ?, ?, ?, ?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, product_name);
            ps.setString(2, list_price);
            ps.setString(3, category_name);
            ps.setString(4, img);
            ps.setInt(5, category_id);

            ps.executeUpdate();

        } catch (Exception e) {
        }
    }

    public void editProduct(String product_name, String list_price, String category_name,
            String img, String product_id) {
        String query = "update products\n"
                + "set product_name = ?, \n"               
                + "list_price = ?, \n"
                + "category_name = ?, \n"
                + "img = ? \n"
                + "where product_id = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, product_name);
            ps.setString(2, list_price);
            ps.setString(3, category_name);
            ps.setString(4, img);
            ps.setString(5, product_id);

            ps.executeUpdate();

        } catch (Exception e) {
        }
    }

    public int getTotalProduct() {
        String query = "select count(*) from products";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                return rs.getInt(1);
            }

        } catch (Exception e) {
        }

        return 0;
    }

    public List<Product> pageProduct(int index) {
        List<Product> list = new ArrayList<>();
        String query = "select * from products\n"
                + "order by product_id\n"
                + "offset ? rows fetch next 12 rows only";

        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, (index - 1) * 12);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(
                        new Product(
                                rs.getInt(1),
                                rs.getString(2),
                                rs.getDouble(3),
                                rs.getString(4),
                                rs.getString(5)));
            }
        } catch (Exception e) {
        }
        return list;

    }
    
    public List<Order> getOrder(int order_id){
        List<Order> list = new ArrayList<>();
        String query = "select * from [order]";
        try{
           conn = new DBContext().getConnection();
           ps= conn.prepareStatement(query);
           rs = ps.executeQuery();
           while (rs.next()) {
               list.add( new Order ( rs.getInt(1),
                       rs.getString(2),
                       rs.getInt(3),
                       rs.getString(4),
                       rs.getString(5),
                       rs.getString(6)));
           }
           }catch( Exception e){
        } 
        return null;
    }
    
    
    
    
    public int removeOrder(int id) {
        int n = 0;
        String sql = "delete from Order where order_id=" + id;
        try {
            Statement state = conn.createStatement();
            n = state.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }
    
      


    public static void main(String[] args) {
          DAO dao = new DAO();
          
//        List<Product> list = dao.getAllProduct();
//        List<Category> listC = dao.getAllCategory();
//        
//        for (Product o : list) {
//            System.out.println(o);
//        }

//        int count = dao.getTotalProduct();
//        System.out.println(count);
        List<Product> listL = dao.getLast();
        for (Product o : listL) {
            System.out.println(o);
        }
    }
}
