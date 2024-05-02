
package model;

import java.sql.Timestamp;
import java.util.ArrayList;

public class Test {

   
    public static void main(String[] args) {
        // Account
        // Account acc = new Account("John", "John123", "123456", "admin", 1, "john123@gmail.com");
        // Account acc_2 = new Account("John", "John12", "123456", "admin", 1, "john123@gmail.com");
        // System.out.println(acc.toString());
        // System.out.println(acc.hashCode());
        // System.out.println(acc.equals(acc_2));
        
        // Product
        // Laptop laptop = new Laptop(15.6,"4 Cell", "LP10", "Laptop Lenovo IdeaPad Gaming 3", 36,23490000,"Intel Core i5 12500H", "16 GB", "China", "NVIDIA GeForce RTX 3050","512 GB",0);
        // Laptop laptop_1 = new Laptop(15.6,"4 Cell", "LP10", "Laptop Lenovo IdeaPad Gaming 3", 36,23490000,"Intel Core i5 12500H", "16 GB", "China", "NVIDIA GeForce RTX 3050","512 GB",0);
        // PC PC = new PC("PC e-power office 04",16,"PC10", "Laptop Lenovo IdeaPad Gaming 3", 36,23490000,"Intel Core i5 12500H", "16 GB", "China", "NVIDIA GeForce RTX 3050","512 GB",0);
        // PC PC_1 = new PC("C e-power office 04",16,"PC10", "Laptop Lenovo IdeaPad Gaming 3", 36,23490000,"Intel Core i5 12500H", "16 GB", "China", "NVIDIA GeForce RTX 3050","512 GB",0);
        // System.out.println(laptop.toString());
        // System.out.println(PC.toString());
        // System.out.println(laptop.equals(laptop_1));
        // System.out.println(PC.equals(PC_1));
        
        // Supplier
        // Supplier supplier = new Supplier("s01", "FPT", "0123456789", "HCMC");
        // System.out.println(supplier.toString());
        
        // detailedInvoice
        // DetailedInvoice i = new DetailedInvoice("di01", "p01", 100, 10000000);
        // System.out.println(i.toString());
        
        // Invoice
        // long currentTimeMillis = System.currentTimeMillis();
        // Timestamp timestamp = new Timestamp(currentTimeMillis);
        // DetailedInvoice i = new DetailedInvoice("di01", "p01", 100, 10000000);
        // ArrayList<DetailedInvoice> dInvoice = new ArrayList<>();
        // dInvoice.add(i);
        // ImportedInvoice im = new ImportedInvoice("ABC", "i01", timestamp, "Admin",dInvoice,10000000);
        // ExportedInvoice ex = new ExportedInvoice("e01", timestamp, "Admin",dInvoice,10000000);
        // System.out.println(im.toString());
        // System.out.println(ex.toString());
        
        // ProductStat
        ProductStat ps = new ProductStat("PC01", "Dell", 1000, 100);
        System.out.println(ps.toString());
    }
    
}
