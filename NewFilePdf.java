package com.ot9.streamio;
import java.io.*;

class NewFilePdf
{
public static void main(String args[]) throws IOException
{

	/*File f=new File("Book1.xlsx");	
	f.createNewFile();
	System.out.println(f);*/

	FileWriter bw=new FileWriter("success.xlsx");
	PrintWriter out=new PrintWriter(bw);
	out.println("welcome to xml file");
	System.out.println("inserted");
	bw.flush();	
	bw.close();
}	
}