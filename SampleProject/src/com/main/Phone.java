package com.main;

/* Immutable class Phone
 * Immutable classes are those which are defined by FINAL keyword and cannot be extended 
 * Also, the data members/variables of the class are also final
 */

public final class Phone {
	
	private final String model;
	private final String serialNo;
	private final String networkCarrier;

	
	private Phone(String model, String serialNo, String networkCarrier){
		
		this.model = model;
		this.serialNo = serialNo;
		this.networkCarrier = networkCarrier;
		
	}
	
	public static Phone createPhone(String model, String serialNo, String networkCarrier){
		
		return new Phone(model, serialNo, networkCarrier);
	}

	public String getModel() {
		return model;
	}
	

	public String getSerialNo() {
		return serialNo;
	}

	public String getNetworkCarrier() {
		return networkCarrier;
	}
	
	
	
	public static void main(String[] args) {
		
		Phone ph = Phone.createPhone("iOS", "vzr567", "verizon");
		String phName = ph.getModel();
		System.out.println(phName);
		
		ph.createPhone("Galaxy", "vzr567", "verizon");
		String chgPhName = ph.getModel();
		System.out.println(chgPhName);
	}

}
