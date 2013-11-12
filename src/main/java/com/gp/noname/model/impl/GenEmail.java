package com.gp.noname.model.impl;

import java.util.ArrayList;

import com.gp.noname.model.FileContent;
import com.gp.noname.model.Generator;

public class GenEmail implements Generator{
	
	String domain;
	String keyword;
	FileContent file1;
	FileContent file2;
	
	public GenEmail(){}
	
	public void setRequired(FileContent file1, FileContent file2, String domain){
		this.file1 = file1;
		this.file2 = file2;
		this.domain = domain;
	}
	
	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public ArrayList<String> getNewEmail(){
		
		ArrayList<String> uname = new ArrayList<String>();
		for(int i=0; i < file1.readFileContent().size(); i++){
        	for(int j=0; j < file2.readFileContent().size(); j++){
        		uname.add(file1.readFileContent().get(i)+file2.readFileContent().get(j)+domain);
        	}
        }
		
		return uname;
		
	}
	
	@Override
	public void display() {
		for(int i=0;i<getNewEmail().size();i++){
		System.out.println(getNewEmail().get(i));
		}
	}


}
