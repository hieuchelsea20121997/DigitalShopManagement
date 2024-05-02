package model;

import java.util.Objects;

public class ProductStat {

    private String id;
    private String name;
    private int imQuantity;
    private int exQuantity;

    public ProductStat() {
    }

    public ProductStat(String id, String name, int imQuantity, int exQuantity) {
        this.id = id;
        this.name = name;
        this.imQuantity = imQuantity;
        this.exQuantity = exQuantity;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.id);
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + this.imQuantity;
        hash = 89 * hash + this.exQuantity;
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
        final ProductStat other = (ProductStat) obj;
        if (this.imQuantity != other.imQuantity) {
            return false;
        }
        if (this.exQuantity != other.exQuantity) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
        return "ProductStat{" + "id=" + id + ", name=" + name + ", imQuantity=" + imQuantity + ", exQuantity=" + exQuantity + '}';
    }
}
