package com.gp.noname.model;

import java.util.ArrayList;

public interface Generator {
	public ArrayList<String> getNewEmail();
	public void display();
	public void setRequired(FileContent myFnameObj, FileContent myLnameObj, String domain);
}
