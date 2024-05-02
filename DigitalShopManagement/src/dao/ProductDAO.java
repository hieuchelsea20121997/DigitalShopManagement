package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Product;
import utils.JDBCUtil;

public class ProductDAO implements DAO<Product> {

    public static ProductDAO getInstance() {
        return new ProductDAO();
    }

    @Override
    public int insert(Product p) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public int update(Product p) {
        int result = 0;
        String sql = "UPDATE Product SET name = ?, quantity=?, price=?, CPU=?, RAM=?, origin=?, graphics=?, ROM=?, status=? WHERE id=?";
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, p.getName());
            pst.setInt(2, p.getQuantity());
            pst.setDouble(3, p.getPrice());
            pst.setString(4, p.getCPU());
            pst.setString(5, p.getRAM());
            pst.setString(6, p.getOrigin());
            pst.setString(7, p.getGraphics());
            pst.setString(8, p.getROM());
            pst.setInt(9, p.getStatus());
            pst.setString(10, p.getId());
            result = pst.executeUpdate(sql);
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int delete(Product p) {
        int result = 0;
        String sql = "DELETE FROM Product WHERE id=? ";
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, p.getId());
            result = pst.executeUpdate(sql);
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public ArrayList<Product> selectAll() {
        ArrayList<Product> result = new ArrayList<>();
        String sql = "SELECT id, name, quantity, price, CPU, RAM, origin, graphics, ROM, status FROM Product";
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                int quantity = rs.getInt("quantity");
                double price = rs.getDouble("price");
                String CPU = rs.getString("CPU");
                String RAM = rs.getString("RAM");
                String origin = rs.getString("origin");
                String graphics = rs.getString("graphics");
                String ROM = rs.getString("ROM");
                int status = rs.getInt("status");

                result.add(new Product(id, name, quantity, price, CPU, RAM, origin, graphics, ROM, status));
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public Product selectById(String ID) {
        Product result = new Product();
        String sql = "SELECT id, name, quantity, price, CPU, RAM, origin, graphics, ROM, status FROM Product WHERE i=?";
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, ID);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                int quantity = rs.getInt("quantity");
                double price = rs.getDouble("price");
                String CPU = rs.getString("CPU");
                String RAM = rs.getString("RAM");
                String origin = rs.getString("origin");
                String graphics = rs.getString("graphics");
                String ROM = rs.getString("ROM");
                int status = rs.getInt("status");

                result = new Product(id, name, quantity, price, CPU, RAM, origin, graphics, ROM, status);
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public int updateQuantity(String id, int quantity) {
        int result = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE Product SET quantity=? WHERE id=? ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, quantity);
            pst.setString(2, id);
            result = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public int deleteStatus(String id) {
        int result = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE Product SET status=0 WHERE id=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, id);
            result = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public ArrayList<Product> selectAllStock() {
        ArrayList<Product> result = new ArrayList<>();

        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT id, name, quantity, price, CPU, RAM, origin, graphics, ROM, status FROM Product";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                if (rs.getInt("quantity") > 0) {
                    String id = rs.getString("id");
                    String name = rs.getString("name");
                    int quantity = rs.getInt("quantity");
                    double price = rs.getDouble("price");
                    String CPU = rs.getString("CPU");
                    String RAM = rs.getString("RAM");
                    String origin = rs.getString("origin");
                    String graphics = rs.getString("graphics");
                    String ROM = rs.getString("ROM");
                    int status = rs.getInt("status");
                    result.add(new Product(id, name, quantity, price, CPU, RAM, origin, graphics, ROM, status));
                }
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public ArrayList<Product> selectAllExist() {
        ArrayList<Product> result = new ArrayList<>();

        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT id, name, quantity, price, CPU, RAM, origin, graphics, ROM, status FROM Product WHERE status = 1";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                int quantity = rs.getInt("quantity");
                double price = rs.getDouble("price");
                String CPU = rs.getString("CPU");
                String RAM = rs.getString("RAM");
                String origin = rs.getString("origin");
                String graphics = rs.getString("graphics");
                String ROM = rs.getString("ROM");
                int status = rs.getInt("status");
                result.add(new Product(id, name, quantity, price, CPU, RAM, origin, graphics, ROM, status));
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public int getTotalQuantity() {
        int totalQuantity = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM Product WHERE Status = 1";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                totalQuantity++;
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return totalQuantity;
    }
}
