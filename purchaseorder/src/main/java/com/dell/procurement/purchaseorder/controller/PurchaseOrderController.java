package com.dell.procurement.purchaseorder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dell.procurement.purchaseorder.service.PurchaseOrderService;

@RestController
public class PurchaseOrderController {

	@Autowired
	private PurchaseOrderService purchaseOrderService;
	
	@GetMapping("/getOrderDetails")
	public void getOrderId()
	{
		purchaseOrderService.savePo();
		
	}
	
}
