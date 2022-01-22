/*Aim : Create a class called Book to represent a book. A Book should include four pieces of 
information as instance variables‐ a book name, an ISBN number, an author name and a 
publisher. Your class should have a constructor that initializes the four instance variables. 
Provide a mutator method and accessor method (query method) for each instance variable. In 
addition, provide a method named getBookInfo that returns the description of the book as a 
String (the description should include all the information about the book). You should use this 
keyword in member methods and constructor. Write a test application named BookTest to 
create an array of object for 30 elements for class Book to demonstrate the class Book's 
capabilities. */

package lab4;

public class Book {
	
	String bookname; 
	String  ISBN; 
	String Author; 
	String bookinfo; 
	String publisher; 

	Book() 
	{ 
		this.bookname=""; 
		this.ISBN=""; 
		this.Author=""; 
		this.bookinfo=""; 
	} 

	void setbookname(String bookname) 
	{ 
		this.bookname=bookname; 
	} 

	String getbookname() 
	{ 
		return bookname; 
	} 

	void setisbn(String ISBN) 
	{ 
		this.ISBN=ISBN; 
	} 

	String getisbn() 
	{ 

		return ISBN; 
	} 

	String getbookinfo() 
	{ 
		bookinfo= getbookname()+"\n" + getisbn() +"\n" + getauthor() +"\n" +getpublisher(); 
		return this.bookinfo; 
	} 

	  
	void setauthor(String Author) 
	{ 
	   this.Author=Author; 
	} 

	String getauthor() 
	{ 
	    return this.Author; 
	} 

	void setpublisher(String publisher) 
	{ 
	    this.publisher=publisher; 
	} 

	String getpublisher() 
	{ 
	    return this.publisher; 
	}  
}
