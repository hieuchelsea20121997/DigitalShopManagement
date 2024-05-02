package dao;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import model.Account;
import model.DetailedInvoice;
import model.ExportedInvoice;
import model.ImportedInvoice;
import model.Invoice;
import model.Laptop;
import model.PC;
import model.Product;
import model.ProductStat;
import model.Supplier;

public class Test {

    public static void main(String[] args) {
        // AccountDAO
        // Account acc = new Account("John", "John123", "246810", "admin", 1, "john123@gmail.com");
        // System.out.println(AccountDAO.getInstance().insert(acc));
        // for (Account a : AccountDAO.getInstance().selectAll()) {
        // System.out.println(a.toString());
        // }
        // System.out.println(AccountDAO.getInstance().selectById("Johnian"));
        // System.out.println(AccountDAO.getInstance().updatePassword("246810", "john123@gmail.com")); 
        // System.out.println(AccountDAO.getInstance().delete(acc)); 

        // ProductDAO
        // for (Product p : ProductDAO.getInstance().selectAll()) {
        // System.out.println(p.toString());
        // }
        // for(Product p : ProductDAO.getInstance().selectAllStock()){
        // System.out.println(p.toString());
        // }
        // for (Product p : ProductDAO.getInstance().selectAllExist()) {
        // System.out.println(p.toString());
        // }
        // LaptopDAO
        // Laptop l = new Laptop(15.6, "4 Cell", "LP99", "Laptop Dell Vostro", 36, 23490000, "Intel Core i5 12500H", "16 GB", "China", "NVIDIA GeForce RTX 3050", "512 GB", 0);
        // System.out.println(LaptopDAO.getInstance().insert(l));
        // System.out.println(LaptopDAO.getInstance().update(l));
        // System.out.println(LaptopDAO.getInstance().delete(l));
        //for(Laptop l : LaptopDAO.getInstance().selectAll()){
        // System.out.println(l.toString());
        // }
        // System.out.println(LaptopDAO.getInstance().selectById("LP16").toString());
        // System.out.println(LaptopDAO.getInstance().isLaptop("PC03"));
        // PCDAO
        // PC pc = new PC("PC e-power office 04",16,"PC100", "Laptop Lenovo IdeaPad Gaming 3", 36,23490000,"Intel Core i5 12500H", "16 GB", "China", "NVIDIA GeForce RTX 3050","512 GB",0);
        // System.out.println(PCDAO.getInstance().insert(pc));
        // System.out.println(PCDAO.getInstance().update(pc));
        // System.out.println(PCDAO.getInstance().delete(pc));
        // for (PC p : PCDAO.getInstance().selectAll()) {
        // System.out.println(p.toString());
        // }
        // System.out.println(PCDAO.getInstance().selectById("PC06").toString());
        // SupplierDAO
        //Supplier supplier = new Supplier("s01", "FPT", "0123456789", "Hochiminh city");
        // System.out.println(SupplierDAO.getInstance().insert(supplier));
        // System.out.println(SupplierDAO.getInstance().update(supplier));
        // System.out.println(SupplierDAO.getInstance().delete(supplier));
        // for (Supplier s : SupplierDAO.getInstance().selectAll()) {
        // System.out.println(s.toString());
        // }
        // System.out.println(SupplierDAO.getInstance().selectById("FPT"));
        // ImportedDetailedInvoice
        // DetailedInvoice i = new DetailedInvoice("PN1", "LP6", 99, 999);
        // System.out.println(ImportedDetailedInvoiceDAO.getInstance().insert(i));
        // System.out.println(ImportedDetailedInvoiceDAO.getInstance().update(i));
        // System.out.println(ImportedDetailedInvoiceDAO.getInstance().delete(i));
        // for (DetailedInvoice d : ImportedDetailedInvoiceDAO.getInstance().selectAll()) {
        // System.out.println(d.toString());
        // }
        // for (DetailedInvoice d : ImportedDetailedInvoiceDAO.getInstance().selectAll("PN10")) {
        // System.out.println(d.toString());
        // }
        // System.out.println(ImportedDetailedInvoiceDAO.getInstance().selectById("PN10").toString());
        // ExportedDetailedInvoice
        // DetailedInvoice i = new DetailedInvoice("PX1", "LP6", 100, 999);
        // System.out.println(ExportedDetailedInvoiceDAO.getInstance().insert(i));
        // System.out.println(ExportedDetailedInvoiceDAO.getInstance().update(i));
        // System.out.println(ExportedDetailedInvoiceDAO.getInstance().delete(i));
        // for (DetailedInvoice d : ExportedDetailedInvoiceDAO.getInstance().selectAll()) {
        // System.out.println(d.toString());
        // }
        // for (DetailedInvoice d : ExportedDetailedInvoiceDAO.getInstance().selectAll("PX10")) {
        // System.out.println(d.toString());
        // }
        // System.out.println(ExportedDetailedInvoiceDAO.getInstance().selectById("PX10").toString());
        // ImportedInvoice
        // ImportedInvoice im = new ImportedInvoice("FPT", "PN99", new Timestamp((long)System.currentTimeMillis()) , "Admin", 99000000);
        // System.out.println(ImportedInvoiceDAO.getInstance().insert(im));
        // System.out.println(ImportedInvoiceDAO.getInstance().update(im));
        // System.out.println(ImportedInvoiceDAO.getInstance().delete(im));
        // for (ImportedInvoice i : ImportedInvoiceDAO.getInstance().selectAll()) {
        // System.out.println(i.toString());
        // }
        // System.out.println(ImportedInvoiceDAO.getInstance().selectById("PN6").toString());
        // for (Invoice i : ImportedInvoiceDAO.getInstance().selectAllByCreatedBy("admin")) {
        // System.out.println(i.toString());
        // }
        // for (Invoice i : ImportedInvoiceDAO.getInstance().selectAllInvoice()) {
        // System.out.println(i.toString());
        // }
        // ExportedInvoice
        // ExportedInvoice ex = new ExportedInvoice("PX99", new Timestamp((long) System.currentTimeMillis()), "Admin", 88000000);
        // System.out.println(ExportedInvoiceDAO.getInstance().insert(ex));
        // System.out.println(ExportedInvoiceDAO.getInstance().update(ex));
        // System.out.println(ExportedInvoiceDAO.getInstance().delete(ex));
        // for (ExportedInvoice e : ExportedInvoiceDAO.getInstance().selectAll()) {
        // System.out.println(e.toString());
        // }
        // System.out.println(ExportedInvoiceDAO.getInstance().selectById("PX6").toString());
        
        // ProductStatDAO
//        Calendar start = Calendar.getInstance();
//        start.set(2022, Calendar.DECEMBER, 3);
//        Date startDate = start.getTime();
//        
//        Calendar end = Calendar.getInstance();
//        end.set(2022, Calendar.DECEMBER, 7);
//        Date endDate = end.getTime();
        
//        for(ProductStat ps : ProductStatDAO.getInstance().getProductStat(startDate, endDate)){
//            System.out.println(ps.toString());
//        }
        
        for(ProductStat ps : ProductStatDAO.getInstance().getProductStat()){
            System.out.println(ps.toString());
        }
    }

}
