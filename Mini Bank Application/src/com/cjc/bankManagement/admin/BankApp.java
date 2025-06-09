package com.cjc.bankManagement.admin;
import java.util.Scanner; 
import com.cjc.bankManagement.service.*;
import com.cjc.bankManagement.serviceImpl.*;



import java.util.Scanner;

public class BankApp {
	static {
		System.out.println("^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("WELCOME TO AXIS BANK : ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RBI r = new Axis();
		boolean flag = true;
		
		while(flag)
		{
			System.out.println("press 1 to create Account : ");
			System.out.println("press 2 to view Account Details : ");
			System.out.println("press 3 to deposite Money : ");
			System.out.println("press 4 to withdrawl Money : ");
			System.out.println("press 5 to show balance : ");
			System.out.println("press 6 to update details : ");
			System.out.println("Press 7 to exit Application : ");
			int ch = sc.nextInt();
			
			switch (ch) {
			case 1: r.createAccount();
				break;
			case 2 : r.viewAccountDetails();
				break;
			case 3 : r.depositeMoney();
				break;
			case 4 : r.withdrawlMoney();
				break;
			case 5 : r.showBalance();
				break;
			case 6 : r.updateDetails();
				break;
			case 7 : 
				flag=false;
			default:
				break;
			}
			
		}	
	}

}
