package dao;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Account;
import utils.JDBCUtil;

public class AccountDAO implements DAO<Account> {

    public static AccountDAO getInstance() {
        return new AccountDAO();
    }

    @Override
    public int insert(Account t) {
        String sql = "INSERT INTO Account (fullName, userName, password, role, status, email) VALUES (?,?,?,?,?,?)";
        try (Connection con = JDBCUtil.getConnection(); PreparedStatement pst = con.prepareStatement(sql);) {
            pst.setString(1, t.getFullName());
            pst.setString(2, t.getUserName());
            pst.setString(3, t.getPassword());
            pst.setString(4, t.getRole());
            pst.setInt(5, t.getStatus());
            pst.setString(6, t.getEmail());
            return pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int update(Account t) {
        String sql = "UPDATE Account SET fullName=?, password=?, role=?, status=?, email=? WHERE userName=?";
        try (Connection con = JDBCUtil.getConnection(); PreparedStatement pst = con.prepareStatement(sql);) {
            pst.setString(1, t.getFullName());
            pst.setString(2, t.getPassword());
            pst.setString(3, t.getRole());
            pst.setInt(4, t.getStatus());
            pst.setString(5, t.getEmail());
            pst.setString(6, t.getUserName());
            return pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int delete(Account t) {
        String sql = "DELETE FROM Account WHERE userName=?";
        try (Connection con = JDBCUtil.getConnection(); PreparedStatement pst = con.prepareStatement(sql);) {
            pst.setString(1, t.getUserName());
            return pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public ArrayList<Account> selectAll() {
        ArrayList<Account> result = new ArrayList<>();
        String sql = "SELECT * FROM Account";

        try (Connection con = JDBCUtil.getConnection(); PreparedStatement pst = con.prepareStatement(sql); ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                String fullName = rs.getString("fullName");
                String userName = rs.getString("userName");
                String password = rs.getString("password");
                String role = rs.getString("role");
                int status = rs.getInt("status");
                String email = rs.getString("email");
                result.add(new Account(fullName, userName, password, role, status, email));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public Account selectById(String id) {
        String sql = "SELECT * FROM Account WHERE userName=?";
        Account acc = new Account();
        try (Connection con = JDBCUtil.getConnection(); PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String fullName = rs.getString("fullName");
                String userName = rs.getString("userName");
                String password = rs.getString("password");
                String role = rs.getString("role");
                int status = rs.getInt("status");
                String email = rs.getString("email");
                acc = new Account(fullName, userName, password, role, status, email);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return acc;
    }

    public int updatePassword(String password, String email) {
        String sql = "UPDATE Account SET password=? WHERE email=?";
        try (Connection con = JDBCUtil.getConnection(); PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, password);
            pst.setString(2, email);
            return pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

}
