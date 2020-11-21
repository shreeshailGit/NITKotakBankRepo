package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	private Courier courier;
	private long regNo;
	
	
	
	/*public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier = courier;
	}*/

	public Flipkart(Courier courier) {
	System.out.println("Flipkart:: 1 - param constructor");
		this.courier = courier;
	}

	public void setRegNo(long regNo) {
	  System.out.println("Flipkart.setRegNo()");
		this.regNo = regNo;
	}

	public Flipkart() {
		System.out.println("Flipkart.Flipkart() 0 - param constrcutor");
	}
	
	//b.method
		public  String  shopping(String[] items,Float[] prices) {
			System.out.println("Flipkart.shopping()-->regNo::"+regNo);
			 float billAmt=0.0f;
			 int oid=0;
			 String msg=null;
			 Random rad=null;
			//calculate  bill Amount
			 
			 for(float p:prices) 
				// billAmt=billAmt+p;
				 billAmt+=p;
			 //generate  order id dynamically as random number
			 rad=new Random();
			 oid= rad.nextInt(10000);
			 // use courier service for delivering the  products
			 msg=courier.deliver(oid);
			 // retrun bill Amt and courier details to customer
			return  Arrays.toString(items)+" are purchased  having prices "+Arrays.toString(prices)+"  with bill amount"+billAmt+ "----"+ msg;
		}
	
	
}// class
