package model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Objects;

public class Invoice {

    private String id;
    private Timestamp createdAt;
    private String createdBy;
    private ArrayList<DetailedInvoice> dInvoices;
    private double totalPrice;

    public Invoice() {
    }

    public Invoice(String id, Timestamp createdAt, String createdBy, ArrayList<DetailedInvoice> dInvoices, double totalPrice) {
        this.id = id;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.dInvoices = dInvoices;
        this.totalPrice = totalPrice;
    }

    public Invoice(String id, Timestamp createdAt, String createdBy, double totalPrice) {
        this.id = id;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.totalPrice = totalPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public ArrayList<DetailedInvoice> getdInvoices() {
        return dInvoices;
    }

    public void setdInvoices(ArrayList<DetailedInvoice> dInvoices) {
        this.dInvoices = dInvoices;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Invoice other = (Invoice) obj;
        if (Double.doubleToLongBits(this.totalPrice) != Double.doubleToLongBits(other.totalPrice)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.createdBy, other.createdBy)) {
            return false;
        }
        if (!Objects.equals(this.createdAt, other.createdAt)) {
            return false;
        }
        return Objects.equals(this.dInvoices, other.dInvoices);
    }
    
    @Override
    public String toString() {
        return "Invoice{" + "id=" + id + ", createdAt=" + createdAt + ", createdBy=" + createdBy + ", dInvoice=" + dInvoices + ", totalPrice=" + totalPrice + '}';
    }
}
