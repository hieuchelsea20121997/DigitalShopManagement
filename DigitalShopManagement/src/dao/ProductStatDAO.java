package dao;

import java.util.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import model.ProductStat;
import utils.JDBCUtil;

public class ProductStatDAO {

    public static ProductStatDAO getInstance() {
        return new ProductStatDAO();
    }

    public ArrayList<ProductStat> getProductStat(Date start, Date end) {
        System.out.println(start);
        System.out.println(end);
        ArrayList<ProductStat> result = new ArrayList();
        String sql = """
                     SELECT t1.productId, name, imQuantity, exQuantity FROM(
                     SELECT productId, SUM(quantity) AS imQuantity FROM ImportedDetailedInvoice
                     JOIN ImportedInvoice ON invoiceId = ImportedInvoice.id
                     WHERE createdAt BETWEEN ? AND ?
                     GROUP BY ProductId
                     )t1
                     JOIN(
                     SELECT productId, SUM(quantity) AS exQuantity FROM ExportedDetailedInvoice
                     JOIN ExportedInvoice ON invoiceId = ExportedInvoice.id
                     WHERE createdAt BETWEEN ? AND ?
                     GROUP BY ProductId
                     )t2
                     ON t1.productId = t2.productId
                     JOIN Product ON Product.id=t1.productId""";
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setTimestamp(1, new Timestamp(start.getTime()));
            pst.setTimestamp(2, new Timestamp(end.getTime()));
            pst.setTimestamp(3, new Timestamp(start.getTime()));
            pst.setTimestamp(4, new Timestamp(end.getTime()));
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String productId = rs.getString("ProductId");
                String name = rs.getString("name");
                int imQuantity = rs.getInt("imQuantity");
                int exQuantity = rs.getInt("exQuantity");

                result.add(new ProductStat(productId, name, imQuantity, exQuantity));
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public ArrayList<ProductStat> getProductStat() {
        ArrayList<ProductStat> result = new ArrayList();
        String sql = """
                     SELECT t1.productId, name, imQuantity, exQuantity FROM(
                     SELECT productId, SUM(quantity) AS imQuantity FROM ImportedDetailedInvoice       
                     GROUP BY ProductId
                     )t1
                     JOIN(
                     SELECT productId, SUM(quantity) AS exQuantity FROM ExportedDetailedInvoice      
                     GROUP BY ProductId
                     )t2
                     ON t1.productId = t2.productId
                     JOIN Product ON Product.id=t1.productId""";
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String productId = rs.getString("ProductId");
                String name = rs.getString("name");
                int imQuantity = rs.getInt("imQuantity");
                int exQuantity = rs.getInt("exQuantity");

                result.add(new ProductStat(productId, name, imQuantity, exQuantity));
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}
