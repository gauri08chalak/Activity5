//Author:Gauri Chalak
//To find the longest word in a text file

package com.question3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Textfile {
	static int lines=0,chars=0,words=0;
	static int content=0;
	
	public static void totalCount(FileInputStream fin) throws IOException 
	{
		while(fin.available()!=0)
		{
			int ch = fin.read();
			if(ch!=10)
				chars++;
			if(ch==32)
				words++;
			if(ch==13)
			{
				lines++;
				words++;
			}
			
		}
	}

	public static void main(String[] args) throws IOException {
		//FileInputStream c = null;
		try
		{
			FileInputStream f=new FileInputStream("E:\\textFile.txt");
			totalCount(f);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Cannot Find the specified file......");
		}
		catch(IOException i)
		{
			System.out.println("cannot read file");
		}
		System.out.println("no. of character="+chars);
		System.out.println("no of words="+(words+1));
		System.out.println("no of lines="+(lines+1));
		//f.close();

	}

}
