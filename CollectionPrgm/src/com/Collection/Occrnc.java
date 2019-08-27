package com.Collection;

import java.util.*;

public class Occrnc  implements Comparator<Object>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="jagannath iam mn";
		String s2=s.replaceAll(" ","");
		System.out.println(s2);
		
		Map<Object,Integer> mp = new TreeMap<Object,Integer>(new Occrnc());
		for(int i=0;i<=s2.length()-1;i++){
			if(mp.containsKey(s2.charAt(i))){
				mp.put(s2.charAt(i), mp.get(s2.charAt(i))+1);
				
			}else{
				mp.put(s2.charAt(i), 1);
			}
		}
		
		System.out.println(mp);

	}

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return -((String) arg0).compareTo((String) arg1);
	}

	

}
