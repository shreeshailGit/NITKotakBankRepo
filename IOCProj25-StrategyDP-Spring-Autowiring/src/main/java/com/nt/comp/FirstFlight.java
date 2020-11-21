package com.nt.comp;

public class FirstFlight implements Courier {

	public FirstFlight() {
		System.out.println("FirstFlight:: 0-param constructor");
	}
	@Override
	public String deliver(int oid) {
		  System.out.println("FirstFlight.deliver()");
		  
		return "DTDC courier will deliver order id :: " +oid+ " order products";
	}//method

}//class
