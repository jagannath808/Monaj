package com.Collection;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This is a program.In this pragraph,there are sentences;the sentences.hi
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a Paragraph");
		String stringInput = sc.nextLine();
		System.out.println("Enter a Number");
		int intInput=sc.nextInt();
		String str[]=stringInput.replace(',',' ').replace('.',' ').replace(';',' ').toLowerCase().split("\\s+");
		
		Map<String ,Integer> map	= new TreeMap<String ,Integer>();
		
		for(String st:str){
			
			if(map.containsKey(st)){
				map.put(st, map.get(st)+1);
			}else{
				map.put(st, 1);
			}
			}
		
	System.out.println(map);
		String newString="";
		for(Map.Entry<String , Integer> emap:map.entrySet()	){
				String s1=emap.getKey();
				
				int n=emap.getValue();
				if(n>=intInput){
					
					newString+=s1+" ";
				}
			
		}
			System.out.println(newString.trim());
	}

}
