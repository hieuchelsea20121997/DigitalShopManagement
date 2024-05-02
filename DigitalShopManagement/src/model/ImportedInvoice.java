package model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Objects;


public class ImportedInvoice extends Invoice {
    private String supplier;

    public ImportedInvoice() {
    }

    public ImportedInvoice(String supplier) {
        this.supplier = supplier;
    }

    public ImportedInvoice(String supplier, String id, Timestamp createdAt, String createdBy, ArrayList<DetailedInvoice> dInvoices, double totalPrice) {
        super(id, createdAt, createdBy, dInvoices, totalPrice);
        this.supplier = supplier;
    }

    public ImportedInvoice(String supplier, String id, Timestamp createdAt, String createdBy, double totalPrice) {
        super(id, createdAt, createdBy, totalPrice);
        this.supplier = supplier;
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
        final ImportedInvoice other = (ImportedInvoice) obj;
        return Objects.equals(this.supplier, other.supplier)&& Objects.equals(this.getId(), other.getId()) && Double.doubleToLongBits(this.getTotalPrice()) != Double.doubleToLongBits(other.getTotalPrice()
        );
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }
    
    @Override
    public String toString() {
        return "ImportedInvoice{" + "supplier=" + supplier + " id="+ this.getId()+ '}';
    }
    
}
