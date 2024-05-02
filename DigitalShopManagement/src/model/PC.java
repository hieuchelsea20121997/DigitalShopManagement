package model;

import java.util.Objects;


public class PC extends Product {
    private String mainBoard;
    private int PSU;

    public PC() {
    }

    public PC(String mainBoard, int PSU) {
        this.mainBoard = mainBoard;
        this.PSU = PSU;
    }

    public PC(String mainBoard, int PSU, String id, String name, int quantity, double price, String CPU, String RAM, String origin, String graphics, String ROM, int status) {
        super(id, name, quantity, price, CPU, RAM, origin, graphics, ROM, status);
        this.mainBoard = mainBoard;
        this.PSU = PSU;
    }

    public String getMainBoard() {
        return mainBoard;
    }

    public void setMainBoard(String mainBoard) {
        this.mainBoard = mainBoard;
    }

    public int getPSU() {
        return PSU;
    }

    public void setPSU(int PSU) {
        this.PSU = PSU;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.mainBoard);
        hash = 71 * hash + this.PSU;
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
        final PC other = (PC) obj;
        if (this.PSU != other.PSU) {
            return false;
        }
        return Objects.equals(this.mainBoard, other.mainBoard);
    }
    
    @Override
    public String toString() {
        return "PC{" + super.toString() + "mainBoard=" + mainBoard + ", PSU=" + PSU + '}';
    }
}
