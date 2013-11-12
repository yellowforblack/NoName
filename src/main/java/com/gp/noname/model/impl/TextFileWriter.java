package com.gp.noname.model.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.gp.noname.model.FileContent;
import com.gp.noname.model.Generator;

public class TextFileWriter implements FileContent{

	private String filename = "C:\\emailGen\\Generated_emails.txt";
	
	Generator newEmails;
	File file;
	
	public TextFileWriter(){
		// TODO Auto-generated method stub
	}

	@Override
	public void setObjectNewEmail(Generator newEmail) {
		this.newEmails = newEmail;
	}
	
	@Override
	public void fileName(String filename) {
		this.filename = filename;
	}

	@Override
	public boolean writeFileContent() {
		
		try{
			file = new File(filename);
			
			newEmails.getNewEmail();
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			for(int i=0;i<newEmails.getNewEmail().size();i++){
				bw.write(newEmails.getNewEmail().get(i).toString());
				bw.newLine();
			}
			bw.close();
 
			System.out.println("Done");
			return true;
		} catch (IOException e){
			e.printStackTrace();
			return false;
		}
		
	}
	
	@Override
	public ArrayList<String> readFileContent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String osType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
}
