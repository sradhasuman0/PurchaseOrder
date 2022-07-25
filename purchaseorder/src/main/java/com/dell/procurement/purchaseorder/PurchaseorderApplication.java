package com.dell.procurement.purchaseorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dell.procurement.purchaseorder.repositiry.PurchaseOrderCustom;
import com.dell.procurement.purchaseorder.repositiry.PurchaseOrderRepo;

@SpringBootApplication
public class PurchaseorderApplication {//implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PurchaseorderApplication.class, args);
	}

	/*
	 * @Override public void run(String... args) throws Exception {
	 * PurchaseOrderCustom c1 = new PurchaseOrderCustom("1","sradha","sarangi");
	 * PurchaseOrderCustom c2 = new PurchaseOrderCustom("1","Sonali","sahoo");
	 * PurchaseOrderCustom c3 = new PurchaseOrderCustom("1","Toral","dash");
	 * PurchaseOrderCustom c4 = new PurchaseOrderCustom("4","swapna","swain");
	 * 
	 * purchaseOrderRepo.save(c1); purchaseOrderRepo.save(c2);
	 * purchaseOrderRepo.save(c3); purchaseOrderRepo.save(c4);
	 * 
	 * System.out.println("Data stored in db"); }
	 */
}
