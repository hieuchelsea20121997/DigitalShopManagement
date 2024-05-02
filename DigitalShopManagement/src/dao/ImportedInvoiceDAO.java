package dao;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import model.ImportedInvoice;
import model.Invoice;
import utils.JDBCUtil;

public class ImportedInvoiceDAO implements DAO<ImportedInvoice> {

    public static ImportedInvoiceDAO getInstance() {
        return new ImportedInvoiceDAO();
    }

    @Override
    public int insert(ImportedInvoice t) {
        int result = 0;
        String sql = "INSERT INTO ImportedInvoice (id, createdAt, createdBy, supplier, totalPrice) VALUES(?,?,?,?,?)";
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getId());
            pst.setTimestamp(2, t.getCreatedAt());
            pst.setString(3, t.getCreatedBy());
            pst.setString(4, t.getSupplier());
            pst.setDouble(5, t.getTotalPrice());

            result = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int update(ImportedInvoice t) {
        int result = 0;
        String sql = "UPDATE ImportedInvoice SET id=?, createdAt=?, createdBy=?, supplier=?, totalPrice=? WHERE id=?";
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getId());
            pst.setTimestamp(2, t.getCreatedAt());
            pst.setString(3, t.getCreatedBy());
            pst.setString(4, t.getSupplier());
            pst.setDouble(5, t.getTotalPrice());
            pst.setString(6, t.getId());

            result = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int delete(ImportedInvoice t) {
        int result = 0;
        String sql = "DELETE FROM ImportedInvoice WHERE id=?";
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
    public ArrayList<ImportedInvoice> selectAll() {
        ArrayList<ImportedInvoice> result = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM ImportedInvoice ORDER BY createdAt DESC";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String id = rs.getString("id");
                Timestamp createdAt = rs.getTimestamp("createdAt");
                String createdBy = rs.getString("createdBy");
                String supplier = rs.getString("supplier");
                double totalPrice = rs.getDouble("totalPrice");
                result.add(new ImportedInvoice(supplier, id, createdAt, createdBy, ImportedDetailedInvoiceDAO.getInstance().selectAll(id), totalPrice));
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public ImportedInvoice selectById(String ID) {
        ImportedInvoice result = new ImportedInvoice();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM ImportedInvoice WHERE id=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, ID);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String id = rs.getString("id");
                Timestamp createdAt = rs.getTimestamp("createdAt");
                String createdBy = rs.getString("createdBy");
                String supplier = rs.getString("supplier");
                double totalPrice = rs.getDouble("totalPrice");
                result = new ImportedInvoice(supplier, id, createdAt, createdBy, ImportedDetailedInvoiceDAO.getInstance().selectAll(id), totalPrice);
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public ArrayList<Invoice> selectAllByCreatedBy(String acc) {
        ArrayList<Invoice> result = new ArrayList<>();
        String sql = "SELECT * FROM (SELECT id, createdAt, createdBy, totalPrice FROM importedInvoice UNION SELECT * FROM exportedInvoice) AS combinedInvoice WHERE createdBy=? ORDER BY createdAt DESC";
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, acc);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String id = rs.getString("id");
                Timestamp createdAt = rs.getTimestamp("createdAt");
                String createdBy = rs.getString("createdBy");
                double totalPrice = rs.getDouble("totalPrice");
                result.add(new Invoice(id, createdAt, createdBy, ImportedDetailedInvoiceDAO.getInstance().selectAll(id), totalPrice));
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public ArrayList<Invoice> selectAllInvoice() {
        ArrayList<Invoice> result = new ArrayList<>();
        String sql = "SELECT * FROM (SELECT id, createdAt, createdBy, totalPrice FROM importedInvoice UNION SELECT * FROM exportedInvoice) AS combinedInvoice ORDER BY createdAt DESC";
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String id = rs.getString("id");
                Timestamp createdAt = rs.getTimestamp("createdAt");
                String createdBy = rs.getString("createdBy");
                double totalPrice = rs.getDouble("totalPrice");
                result.add(new Invoice(id, createdAt, createdBy, ImportedDetailedInvoiceDAO.getInstance().selectAll(id), totalPrice));
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
