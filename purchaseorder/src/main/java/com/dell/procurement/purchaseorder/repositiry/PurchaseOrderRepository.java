package com.dell.procurement.purchaseorder.repositiry;

import org.springframework.stereotype.Repository;

@Repository
public class PurchaseOrderRepository {
	

	public String getOrderId(String orderId,String loc)
	{
		if(orderId.equals("ord-123") && loc.equals("bbsr"))
			return "mouse";
			else if(orderId.equals("ord-321") && loc.equals("puri"))
				return "desktop";
			else if(orderId.equals("ord-456") && loc.equals("blr"))
			return "keyboard";
			else
				return "CPU";
	}
	
}
