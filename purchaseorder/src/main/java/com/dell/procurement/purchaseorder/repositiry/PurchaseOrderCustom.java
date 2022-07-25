package com.dell.procurement.purchaseorder.repositiry;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Purchaseorder")
public class PurchaseOrderCustom {
	public String ID;
	public String firstName;
	public String lastName;
	public PurchaseOrderCustom(String ID,String firstName, String lastName) {
		super();
		this.ID = ID;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "PurchaseOrderCustom [ID=" + ID + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	

}
