package lab4;

import java.util.Scanner;
public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		Scanner scan = new Scanner(System.in);
		Book b[] = new Book[30];
		System.out.println("Enter no of books(max=30) : ");
		size=scan.nextInt();
		scan.nextLine();
		
		for(int i=0;i<size;i++)
		{
			b[i] = new Book();
			System.out.println("Enter the book name: ");
			b[i].setbookname(scan.nextLine());
			System.out.println("Enter the book ISBN number: ");
			b[i].setisbn(scan.nextLine());
			System.out.println("Enter the book author : ");
			b[i].setauthor(scan.nextLine());
			System.out.println("Enter the book Publisher : ");
			b[i].setpublisher(scan.nextLine());
				
		}
		
		for(int i=0;i<size;i++)
		{
			System.out.println("\n"+b[i].getbookinfo());
		}
		
		scan.close();
	}

}
