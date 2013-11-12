package com.gp.noname.model.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.gp.noname.model.FileContent;
import com.gp.noname.model.Generator;

public class TextFileReader implements FileContent{
	
	public String filename;
	private String ostype;
	
	public TextFileReader(){
	}
	
	
	@Override
	public String osType() {
		return ostype;
	}

	@Override
	public void fileName(String filename) {
		this.filename = filename;
	}
	
	//get file content and stored in arraylist
	@Override
	public ArrayList<String> readFileContent() {
		
		ArrayList<String> al = new ArrayList<String>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(filename)))
		{
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				al.add(sCurrentLine.trim());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return al; 
	}

	@Override
	public boolean writeFileContent() {
		return false;
	}

	@Override
	public void display() {
		for(int i=0;i<readFileContent().size();i++){
			System.out.println(readFileContent().get(i));
		}
	}


	@Override
	public void setObjectNewEmail(Generator myEmailGenObj) {
		// TODO Auto-generated method stub
		
	}
}
