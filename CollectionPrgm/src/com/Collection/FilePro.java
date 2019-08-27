package com.Collection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FilePro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s="C:\\JavaWorkSpace\\HackerrankProblem\\java.text";
			File f1= new File(s);
//				if(f1.isDirectory()){
//					
//				}
			
			String s1=f1.getAbsolutePath();
			String[] name=s.split("\\\\");
			for(int i=name.length-1;i>=0;i--){
				
				if(checkFile(name[i])){
					System.out.println(name[i] +" File");
					continue;
					
				}
				System.out.println(name[i] +" Folder");
			}
	}
	
	 public static boolean checkFile(String s){
		 for(int j=0;j<=s.length()-1;j++){
				if(s.charAt(j)=='.'){
				
					return true;
				}
							
			}
		 return false;

	 }

}
