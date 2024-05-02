package model;

import java.util.Objects;

public class Product {
    private String id;
    private String name;
    private int quantity;
    private double price;
    private String CPU;
    private String RAM;
    private String origin;
    private String graphics;
    private String ROM;
    private int status;

    public Product() {
    }

    public Product(String id, String name, int quantity, double price, String CPU, String RAM, String origin, String graphics, String ROM, int status) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.CPU = CPU;
        this.RAM = RAM;
        this.origin = origin;
        this.graphics = graphics;
        this.ROM = ROM;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getGraphics() {
        return graphics;
    }

    public void setGraphics(String graphics) {
        this.graphics = graphics;
    }

    public String getROM() {
        return ROM;
    }

    public void setROM(String ROM) {
        this.ROM = ROM;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.id);
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + this.quantity;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
        hash = 89 * hash + Objects.hashCode(this.CPU);
        hash = 89 * hash + Objects.hashCode(this.RAM);
        hash = 89 * hash + Objects.hashCode(this.origin);
        hash = 89 * hash + Objects.hashCode(this.graphics);
        hash = 89 * hash + Objects.hashCode(this.ROM);
        hash = 89 * hash + this.status;
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
        final Product other = (Product) obj;
        if (this.quantity != other.quantity) {
            return false;
        }
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (this.status != other.status) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.CPU, other.CPU)) {
            return false;
        }
        if (!Objects.equals(this.RAM, other.RAM)) {
            return false;
        }
        if (!Objects.equals(this.origin, other.origin)) {
            return false;
        }
        if (!Objects.equals(this.graphics, other.graphics)) {
            return false;
        }
        return Objects.equals(this.ROM, other.ROM);
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + ", CPU=" + CPU + ", RAM=" + RAM + ", origin=" + origin + ", graphics=" + graphics + ", ROM=" + ROM + ", status=" + status + '}';
    }
    
    
}
