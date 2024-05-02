package model;

import java.util.Objects;

public class DetailedInvoice {

    private String invoiceId;
    private String productId;
    private int quantity;
    private double price;

    public DetailedInvoice() {
    }

    public DetailedInvoice(String invoiceId, String productId, int quantity, double price) {
        this.invoiceId = invoiceId;
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.invoiceId);
        hash = 89 * hash + Objects.hashCode(this.productId);
        hash = 89 * hash + this.quantity;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
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
        final DetailedInvoice other = (DetailedInvoice) obj;
        if (this.quantity != other.quantity) {
            return false;
        }
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (!Objects.equals(this.invoiceId, other.invoiceId)) {
            return false;
        }
        return Objects.equals(this.productId, other.productId);
    }
    
    @Override
    public String toString() {
        return "detailedInvoice{" + "invoiceId=" + invoiceId + ", productId=" + productId + ", quantity=" + quantity + ", price=" + price + '}';
    }
}
