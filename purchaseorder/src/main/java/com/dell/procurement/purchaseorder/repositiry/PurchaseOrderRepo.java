package com.dell.procurement.purchaseorder.repositiry;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface PurchaseOrderRepo extends MongoRepository<PurchaseOrderCustom,String> {
	
	

}
