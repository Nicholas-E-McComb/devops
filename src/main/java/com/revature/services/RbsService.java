package com.revature.services;

import java.util.ArrayList;

import com.revature.model.Bank;

public class RbsService {
	
	public static String getBalance(Bank b, String s) {
		return s + " has a balance of $" + b.getBalance();
	}
	
	public static ArrayList<String> returnArrayList(){
		ArrayList<String> list = new ArrayList<>();
		list.add("hi");
		list.add("Thing");
		list.add("empty");
		return list;
	}
}
