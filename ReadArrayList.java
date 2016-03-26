package com.acadglid.java.core.session8.assignment1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class ReadArrayList {
	private static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		System.out.println("enter the size of Array list");
		//s=new Scanner(System.in);
		int size= s.nextInt();
		addListElements(size, list);
		printArrayList(list);
		s.close();
		
	}
	/*-- Method to add elements in list --*/
	static ArrayList<String> addListElements(int size, ArrayList<String> list){
		for(int i=0;i<size;i++){
			System.out.println("enter the string value for "+i);
			list.add(s.next());
		}
		return list;
	}
	/*-- Method to print the elements of list --*/
	static void printArrayList(ArrayList<String> list){
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()){
			System.out.println("the value is : "+ itr.next());
		}
	}

}
