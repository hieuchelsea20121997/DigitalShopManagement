package model;

import java.util.Objects;


public class Account {
    private String fullName;
    private String userName;
    private String password;
    private String role;
    private int status;
    private String email;

    public Account() {
    }

    public Account(String fullName, String userName, String password, String role, int status, String email) {
        this.fullName = fullName;
        this.userName = userName;
        this.password = password;
        this.role = role;
        this.status = status;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.fullName);
        hash = 23 * hash + Objects.hashCode(this.userName);
        hash = 23 * hash + Objects.hashCode(this.password);
        hash = 23 * hash + Objects.hashCode(this.role);
        hash = 23 * hash + this.status;
        hash = 23 * hash + Objects.hashCode(this.email);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Account other = (Account) obj;
        if (this.status != other.status) {
            return false;
        }
        if (!Objects.equals(this.fullName, other.fullName)) {
            return false;
        }
        if (!Objects.equals(this.userName, other.userName)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.role, other.role)) {
            return false;
        }
        return Objects.equals(this.email, other.email);
    }
    
    
    @Override
    public String toString() {
        return "Account{" + "fullName=" + fullName + ", userName=" + userName + ", password=" + password + ", role=" + role + ", status=" + status + ", email=" + email + '}';
    }
}
