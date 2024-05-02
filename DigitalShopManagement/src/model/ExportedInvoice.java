package model;

import java.sql.Timestamp;
import java.util.ArrayList;

public class ExportedInvoice extends Invoice {

    public ExportedInvoice() {
    }
    
    public ExportedInvoice(String id, Timestamp createdAt, String createdBy, ArrayList<DetailedInvoice> dInvoices, double totalPrice) {
        super(id, createdAt, createdBy, dInvoices, totalPrice);
    }

    public ExportedInvoice(String id, Timestamp createdAt, String createdBy, double totalPrice) {
        super(id, createdAt, createdBy, totalPrice);
    }
    

    @Override
    public String toString() {
        return "ExportedInvoice{" + "id=" + this.getId() + '}';
    }  
}
