package com.gp.noname;

import com.gp.noname.model.FileContent;
import com.gp.noname.model.Generator;
import com.gp.noname.model.impl.GenEmail;
import com.gp.noname.model.impl.TextFileReader;
import com.gp.noname.model.impl.TextFileWriter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String dName = "@yahoo.com";
    	String f1 = "C:\\emailGen\\fname-phil.txt";
    	String f2 = "C:\\emailGen\\lname-phil.txt";
    	
        FileContent myFnameObj = new TextFileReader();
        FileContent myLnameObj = new TextFileReader();
        FileContent myNewEmail = new TextFileWriter();
        Generator myEmailGenObj = new GenEmail();
        
        myFnameObj.fileName(f1);
        myLnameObj.fileName(f2);
        
        myEmailGenObj.setRequired(myFnameObj, myLnameObj, dName);
        
        myNewEmail.setObjectNewEmail(myEmailGenObj);
        myNewEmail.writeFileContent();
        
        

    }
}
