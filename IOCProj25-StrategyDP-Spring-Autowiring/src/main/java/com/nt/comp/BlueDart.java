package com.nt.comp;

public class BlueDart implements Courier {

	public BlueDart() {
		System.out.println("BlueDart:: 0-param constructor");
	}
	@Override
	public String deliver(int oid) {
		  System.out.println("BlueDart.deliver()");
		  
		return "DTDC courier will deliver order id :: " +oid+ " order products";
	}//method

}//class
