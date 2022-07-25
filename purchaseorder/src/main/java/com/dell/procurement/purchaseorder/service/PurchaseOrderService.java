package com.dell.procurement.purchaseorder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dell.procurement.purchaseorder.repositiry.PurchaseOrderCustom;
import com.dell.procurement.purchaseorder.repositiry.PurchaseOrderRepo;
import com.dell.procurement.purchaseorder.repositiry.PurchaseOrderRepository;
@Service
public class PurchaseOrderService {
	
	
	@Autowired
	private PurchaseOrderRepository purchaseOrderRepository;
	
	@Autowired
	private PurchaseOrderRepo purchaseOrderRepo;

	public void savePo()
	{
		PurchaseOrderCustom c1 = new PurchaseOrderCustom("1","sradha","sarangi");
		PurchaseOrderCustom c2 = new PurchaseOrderCustom("1","Sonali","sahoo");
		PurchaseOrderCustom c3 = new PurchaseOrderCustom("1","Toral","dash");
		PurchaseOrderCustom c4 = new PurchaseOrderCustom("4","swapna","swain");
		
		purchaseOrderRepo.save(c1);
		purchaseOrderRepo.save(c2);
		purchaseOrderRepo.save(c3);
		purchaseOrderRepo.save(c4);
		
		System.out.println("Data stored in db");
	}

}
