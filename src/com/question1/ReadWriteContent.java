//Author:Gauri Chalak
//To read and write the content into the file based on the choice you enter.

package com.question1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteContent {

	
		static void readWrite() throws IOException
		{
			System.out.println("enter choice One for write and choice Two for read ");
			Scanner in=new Scanner(System.in);
			
			int a=in.nextInt();
			if(a==1) {
				try {
				FileOutputStream fout = new FileOutputStream("E:\\a.txt");
				String s="I am proud to be an Indian";
				byte b[]=s.getBytes();  // change byte into array
				fout.write(b); 
				fout.close();
				}
				catch(FileNotFoundException e)
				{
					e.printStackTrace();
				}
			}
			else if(a==2)
			{
				try
				{
				FileInputStream fin = new FileInputStream("E:\\b.txt");
				
				while(( a=fin.read())!=-1) {   //reading file till -1
					System.out.print((char)a);
				}
				fin.close();
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			else {
				System.out.println("Invalid Input please re-enter ");
			}
			System.out.println("Done");
		}
		public static void main(String[] args) throws IOException {
			ReadWriteContent rd =new ReadWriteContent() ;
				rd.readWrite();
			}
		}


