/**
 * 
 */
package com.ikea.lambda.streams;

/**
 * @author SINAD3
 *
 */
public class LamdaAndStreams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Thread t= new Thread(()->System.out.println("inside main"));
		t.start();
		
	
	}

}
