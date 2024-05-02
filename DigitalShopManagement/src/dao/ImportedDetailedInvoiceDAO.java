package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.DetailedInvoice;
import utils.JDBCUtil;


public class ImportedDetailedInvoiceDAO implements DAO<DetailedInvoice> {

    public static ImportedDetailedInvoiceDAO getInstance() {
        return new ImportedDetailedInvoiceDAO();
    }

    @Override
    public int insert(DetailedInvoice t) {
        int result = 0;
        String sql = "INSERT INTO ImportedDetailedInvoice (invoiceId, productId, quantity, price) VALUES(?,?,?,?)";
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getInvoiceId());
            pst.setString(2, t.getProductId());
            pst.setInt(3, t.getQuantity());
            pst.setDouble(4, t.getPrice());

            result = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int update(DetailedInvoice t) {
        int result = 0;
        String sql = "UPDATE ImportedDetailedInvoice SET invoiceId=?, productId=?, quantity=?, price=? WHERE invoiceId=? AND productId=?";
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getInvoiceId());
            pst.setString(2, t.getProductId());
            pst.setInt(3, t.getQuantity());
            pst.setDouble(4, t.getPrice());
            pst.setString(5, t.getInvoiceId());
            pst.setString(6, t.getProductId());

            result = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int delete(DetailedInvoice t) {
        int result = 0;
        String sql = "DELETE FROM ImportedDetailedInvoice WHERE invoiceId=?";
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getInvoiceId());

            result = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public ArrayList<DetailedInvoice> selectAll() {
        ArrayList<DetailedInvoice> result = new ArrayList<>();
        String sql = "SELECT * FROM ImportedDetailedInvoice";
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String invoiceId = rs.getString("invoiceId");
                String productId = rs.getString("productId");
                int quantity = rs.getInt("quantity");
                double price = rs.getDouble("price");
                result.add(new DetailedInvoice(invoiceId, productId, quantity, price));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public ArrayList<DetailedInvoice> selectAll(String ID) {
        ArrayList<DetailedInvoice> result = new ArrayList<>();
        String sql = "SELECT * FROM ImportedDetailedInvoice WHERE invoiceId=?";
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, ID);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String invoiceId = rs.getString("invoiceId");
                String productId = rs.getString("productId");
                int quantity = rs.getInt("quantity");
                double price = rs.getDouble("price");
                result.add(new DetailedInvoice(invoiceId, productId, quantity, price));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public DetailedInvoice selectById(String ID) {
        DetailedInvoice result = new DetailedInvoice();
        String sql = "SELECT * FROM ImportedDetailedInvoice WHERE invoiceId=?";
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, ID);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String invoiceId = rs.getString("invoiceId");
                String productId = rs.getString("productId");
                int quantity = rs.getInt("quantity");
                double price = rs.getDouble("price");
                result = new DetailedInvoice(invoiceId, productId, quantity, price);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
