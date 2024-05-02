package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import model.ExportedInvoice;
import utils.JDBCUtil;

public class ExportedInvoiceDAO implements DAO<ExportedInvoice> {

    public static ExportedInvoiceDAO getInstance() {
        return new ExportedInvoiceDAO();
    }

    @Override
    public int insert(ExportedInvoice t) {
        int result = 0;
        String sql = "INSERT INTO ExportedInvoice (id, createdAt, createdBy, totalPrice) VALUES(?,?,?,?)";
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getId());
            pst.setTimestamp(2, t.getCreatedAt());
            pst.setString(3, t.getCreatedBy());
            pst.setDouble(4, t.getTotalPrice());

            result = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int update(ExportedInvoice t) {
        int result = 0;
        String sql = "UPDATE ExportedInvoice SET id=?, createdAt=?, createdBy=?, totalPrice=? WHERE id=?";
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getId());
            pst.setTimestamp(2, t.getCreatedAt());
            pst.setString(3, t.getCreatedBy());
            pst.setDouble(4, t.getTotalPrice());
            pst.setString(5, t.getId());

            result = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int delete(ExportedInvoice t) {
        int result = 0;
        String sql = "DELETE FROM ExportedInvoice WHERE id=?";
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
    public ArrayList<ExportedInvoice> selectAll() {
        ArrayList<ExportedInvoice> result = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM ExportedInvoice ORDER BY createdAt DESC";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String id = rs.getString("id");
                Timestamp createdAt = rs.getTimestamp("createdAt");
                String createdBy = rs.getString("createdBy");
                double totalPrice = rs.getDouble("totalPrice");
                result.add(new ExportedInvoice(id, createdAt, createdBy, ImportedDetailedInvoiceDAO.getInstance().selectAll(id), totalPrice));
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public ExportedInvoice selectById(String ID) {
        ExportedInvoice result = new ExportedInvoice();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM ExportedInvoice WHERE id=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, ID);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String id = rs.getString("id");
                Timestamp createdAt = rs.getTimestamp("createdAt");
                String createdBy = rs.getString("createdBy");
                double totalPrice = rs.getDouble("totalPrice");
                result = new ExportedInvoice(id, createdAt, createdBy, ImportedDetailedInvoiceDAO.getInstance().selectAll(id), totalPrice);
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
