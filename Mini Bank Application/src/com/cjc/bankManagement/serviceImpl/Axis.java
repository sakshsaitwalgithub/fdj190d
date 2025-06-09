package com.cjc.bankManagement.serviceImpl;
import java.util.Scanner;

import com.cjc.bankManagement.model.*;
import com.cjc.bankManagement.service.*;


public class Axis implements RBI{
	Scanner sc = new Scanner(System.in);
	Account ac = null;
	
	public void createAccount() 
	{
		System.out.println("***********************");
		System.out.println("Welcome to Account Opening Section");
		System.out.println("***********************");
		ac = new Account();
		
		System.out.println("Enter Account Number to register");
		int acno = sc.nextInt();
		ac.setAcno(acno);
		
		System.out.println("Enter Your Name : ");
		String name=sc.next()+sc.nextLine();
		ac.setAcName(name);
		
		System.out.println("Enter Your Address : ");
		ac.setAddress(sc.next());
		
		System.out.println("Enter Your Aadhar NO : ");
		ac.setAadharNo(sc.nextLong());
		
		System.out.println("Enter your PANNO : ");
		ac.setPanNO(sc.next());
		
		System.out.println("Enter your Mobile NO : ");
		ac.setMobileNo(sc.nextLong());
		
		System.out.println("Enter Your gender : ");
		ac.setGender(sc.next());
		
		System.out.println("Enter Your Account opening balance : ");
		ac.setBalance(sc.nextDouble());
		
		System.out.println();
		System.out.println("************************");
		System.out.println("Account have Been Created SuccessFully.....!");
		System.out.println("**************************");
		System.out.println();
		
	}

	public void viewAccountDetails() {
		
		if(ac!=null)
		{
			System.out.println("");
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println("Account Number : "+ac.getAcno());
			System.out.println("Account Holder Name : "+ac.getAcName());
			System.out.println("Address : "+ac.getAddress());
			System.out.println("AddharNo : "+ac.getAadharNo());
			System.out.println("PANNO : "+ac.getPanNO());
			System.out.println("MobileNO : "+ac.getMobileNo());
			System.out.println("Gender : "+ac.getGender());
			System.out.println("Balance : "+ac.getBalance());
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println();
		}
		else {
			System.out.println();
			System.out.println("please create Account and Then Come Back");
			System.out.println();
		}
	}

	public void depositeMoney() {
		
		if(ac!=null)
		{
			double avbal = ac.getBalance();
			
			System.out.println("Enter Amount to Deposite : ");
			double damo = sc.nextDouble();
			
			if(damo>=100 && damo<=5000)
			{
				double newbalance=avbal+damo;
				ac.setBalance(newbalance);
				System.out.println("Amount have been Deposited SuccessFully...!");
				System.out.println();
			}
			else {
				System.out.println();
				System.out.println("Amount should be in between 100 to 5000 ");
				System.out.println();
			}
		}
		else {
			System.out.println();
			System.out.println("please create Account and Then Come Back");
			System.out.println();
		}
		

	}

	@Override
	public void withdrawlMoney() {
		
	}

	

	
	public void showBalance() {
		
		if(ac!=null)
		{
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println("Available Balance : "+ac.getBalance());
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println();
		}
		else {
			System.out.println();
			System.out.println("please create Account and Then Come Back");
			System.out.println();
		}
	}

	
	public void updateDetails() {
		
		
	}


}
