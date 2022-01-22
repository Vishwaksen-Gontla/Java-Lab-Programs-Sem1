package lab15;

import java.io.*;
import java.util.*;

public class Filedemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the filename including the path : ");
		File f1 = new File(scan.next());
		System.out.println(f1.exists() ? "File exists" : "dosen't exist");
		System.out.println(f1.canWrite() ? "writable" : "not writable");
		System.out.println(f1.canRead() ? "readable" : "not readable");
		System.out.println(f1.isFile() ? "Normal file" : "Piped");
		System.out.println( "length is " + f1.length() + " dosen't exist");
		scan.close();
		
	}

}
