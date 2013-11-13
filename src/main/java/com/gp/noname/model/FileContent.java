package com.gp.noname.model;

import java.util.ArrayList;

public interface FileContent {
	public String osType();
	public void fileName(String filename);
	public ArrayList<String> readFileContent();
	public boolean writeFileContent();
	public void display();
	public void setObjectNewEmail(Generator myEmailGenObj);
}
