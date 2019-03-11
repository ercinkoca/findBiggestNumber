package com.genel.ariza;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Trial {
	
	public static void main(String args[]) {
		
		List<Integer> list=new ArrayList<Integer>();
		Random rnd=new Random();
		
		for(int i=0; i<100; i++) {
			int a=rnd.nextInt(101);
			list.add(a);
		}
		findSecondBig(list);
	}
	
	 public static void findSecondBig(List<Integer> list) {
		 int biggest=0;
		 int secondBig=0;
		 
		 for(int i=0; i<list.size();i++) {
			 if(list.get(i)>biggest) {
				 secondBig=biggest;
				 biggest=list.get(i);
			 }
		 }
		 System.out.println(list);
		 System.out.println(biggest);
		 System.out.println(secondBig);
	 }

}
