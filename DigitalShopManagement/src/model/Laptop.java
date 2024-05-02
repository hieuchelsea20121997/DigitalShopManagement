package model;

import java.util.Objects;


public class Laptop extends Product {
    private double screenSize;
    private String PIN;

    public Laptop() {
    }

    public Laptop(double screenSize, String PIN) {
        this.screenSize = screenSize;
        this.PIN = PIN;
    }

    public Laptop(double screenSize, String PIN, String id, String name, int quantity, double price, String CPU, String RAM, String origin, String graphics, String ROM, int status) {
        super(id, name, quantity, price, CPU, RAM, origin, graphics, ROM, status);
        this.screenSize = screenSize;
        this.PIN = PIN;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getPIN() {
        return PIN;
    }

    public void setPIN(String PIN) {
        this.PIN = PIN;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.screenSize) ^ (Double.doubleToLongBits(this.screenSize) >>> 32));
        hash = 97 * hash + Objects.hashCode(this.PIN);
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
        final Laptop other = (Laptop) obj;
        if (Double.doubleToLongBits(this.screenSize) != Double.doubleToLongBits(other.screenSize)) {
            return false;
        }
        return Objects.equals(this.PIN, other.PIN);
    }
    
     @Override
    public String toString() {
        return "Laptop{" + super.toString() + "screenSize=" + screenSize + ", PIN=" + PIN + '}';
    }
}
