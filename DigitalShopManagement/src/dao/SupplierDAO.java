package dao;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Supplier;
import utils.JDBCUtil;

public class SupplierDAO implements DAO<Supplier> {

    public static SupplierDAO getInstance() {
        return new SupplierDAO();
    }

    @Override
    public int insert(Supplier t) {
        int result = 0;
        String sql = "INSERT INTO Supplier (id, name, phone, address) VALUES(?,?,?,?) ";
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getId());
            pst.setString(2, t.getName());
            pst.setString(3, t.getPhone());
            pst.setString(4, t.getAddress());

            result = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public int update(Supplier t) {
        int result = 0;
        String sql = "UPDATE Supplier SET id=?, name=?, phone=?, address=? WHERE id=?";
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getId());
            pst.setString(2, t.getName());
            pst.setString(3, t.getPhone());
            pst.setString(4, t.getAddress());
            pst.setString(5, t.getId());

            result = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public int delete(Supplier t) {
        int result = 0;
        String sql = "DELETE FROM Supplier WHERE id=?";
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getId());

            result = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public ArrayList<Supplier> selectAll() {
        ArrayList<Supplier> result = new ArrayList<>();
        String sql = "SELECT * FROM Supplier";
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                String phone = rs.getString("phone");
                String address = rs.getString("address");

                result.add(new Supplier(id, name, phone, address));
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public Supplier selectById(String ID) {
        Supplier result = new Supplier();
        String sql = "SELECT * FROM Supplier WHERE id=?";
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, ID);

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                String phone = rs.getString("phone");
                String address = rs.getString("address");

                result = new Supplier(id, name, phone, address);
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

}
