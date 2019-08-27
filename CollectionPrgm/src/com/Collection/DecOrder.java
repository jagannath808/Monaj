package com.Collection;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class DecOrder  implements Comparator<Character>{
			public static void main(String[] args) {
				char[] str="jagannath kundu".replaceAll(" ","").toCharArray();
				
				Map<Character, Integer> mp	= new TreeMap<>(new DecOrder());
				for(Character s:str){
					
				if(mp.containsKey(s)){
					mp.put(s, mp.get(s)+1);
				}else{
					mp.put(s, 1);
				}
					
					
				}
				System.out.println(mp);
			}

			@Override
			public int compare(Character arg0, Character arg1) {
				// TODO Auto-generated method stub
				return -arg0.compareTo(arg1);
			}
}
