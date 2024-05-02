package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import model.Laptop;
import utils.JDBCUtil;

public class LaptopDAO implements DAO<Laptop> {

    public static LaptopDAO getInstance() {
        return new LaptopDAO();
    }

    @Override
    public int insert(Laptop t) {
        int result = 0;
        String sql = "INSERT INTO Product (id, name, quantity, price,PIN, screenSize, CPU, RAM, origin, graphics, type, ROM, status) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getId());
            pst.setString(2, t.getName());
            pst.setInt(3, t.getQuantity());
            pst.setDouble(4, t.getPrice());
            pst.setString(5, t.getPIN());
            pst.setDouble(6, t.getScreenSize());
            pst.setString(7, t.getCPU());
            pst.setString(8, t.getRAM());
            pst.setString(9, t.getOrigin());
            pst.setString(10, t.getGraphics());
            pst.setString(11, "Laptop");
            pst.setString(12, t.getROM());
            pst.setInt(13, t.getStatus());

            result = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int update(Laptop t) {
        int result = 0;
        String sql = "UPDATE Product SET id=?, name=?, quantity=?, price=?, PIN=?, screenSize=?, CPU=?, RAM=?, origin=?, graphics=?,type=?, ROM=?, status=? WHERE id=?";
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getId());
            pst.setString(2, t.getName());
            pst.setInt(3, t.getQuantity());
            pst.setDouble(4, t.getPrice());
            pst.setString(5, t.getPIN());
            pst.setDouble(6, t.getScreenSize());
            pst.setString(7, t.getCPU());
            pst.setString(8, t.getRAM());
            pst.setString(9, t.getOrigin());
            pst.setString(10, t.getGraphics());
            pst.setString(11, "Laptop");
            pst.setString(12, t.getROM());
            pst.setInt(13, t.getStatus());
            pst.setString(14, t.getId());

            result = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int delete(Laptop t) {
        int result = 0;
        String sql = "DELETE FROM Product WHERE id=? ";
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getId());
            result = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public ArrayList<Laptop> selectAll() {
        ArrayList<Laptop> result = new ArrayList<>();
        String sql = "SELECT * FROM Product WHERE type=?";
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, "Laptop");
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
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
                double screenSize = rs.getDouble("screenSize");
                String PIN = rs.getString("PIN");
                
                result.add(new Laptop(screenSize, PIN, id, name, quantity, price, CPU, RAM, origin, graphics, ROM, status));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
         
        return result;
    }

    @Override
    public Laptop selectById(String ID) {
        Laptop result = new Laptop();
        String sql = "SELECT * FROM Product WHERE type=? AND id=?";
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, "Laptop");
            pst.setString(2, ID);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
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
                double screenSize = rs.getDouble("screenSize");
                String PIN = rs.getString("PIN");
                
                result = new Laptop(screenSize, PIN, id, name, quantity, price, CPU, RAM, origin, graphics, ROM, status);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
         
        return result;
    }
    
    public boolean isLaptop(String id) {
        String sql = "SELECT * FROM Product WHERE id= ?";
        String type = "";
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                type = rs.getString("type");
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return type.equals("Laptop");
    }

}
