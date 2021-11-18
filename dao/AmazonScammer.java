package com.xworkz.amazon.dao;

public class AmazonScammer {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			CartDTO cartDTOs1 = new CartDTO("iphone", "good", 50000.0f,4);
			ArrayAmazonCartDAO dto1 = new ArrayAmazonCartDAO();
			dto1.saveCart(cartDTOs1);

			dto1.saveCart(new CartDTO("realme","bad",10000.0f,3), 3);

			CartDTO ref = dto1.findByName("iphone");
			System.out.println(ref);
			
			ArrayAmazonCartDAO arrayAmazonCartDAO=new ArrayAmazonCartDAO();
			System.out.println(arrayAmazonCartDAO.save(cartDTOs1));
			System.out.println(arrayAmazonCartDAO.findByName("iphone"));
			arrayAmazonCartDAO.displayAllCartDetails();	

	}

}
