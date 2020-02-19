package Epam.Hometask4.Hometask4;
import java.io.FileDescriptor;


import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class House {
	House()
	{
		Scanner sc = new Scanner(System.in);
		PrintStream out = new PrintStream(new FileOutputStream(FileDescriptor.out));
		out.println("Enter the length breadth in psf : ");
		double length = sc.nextDouble();
		double breadth = sc.nextDouble();
		out.println("Enter your choice : ");
		int ch = sc.nextInt();
		out.println("1.1200INR Standard Materials");
		out.println("2.1500INR Above Standard Materials");
		out.println("3.1800INR High Standard Material");
		out.println("4.2500INR High Standard Material and Fully Automated Home");
		switch(ch)
		{
		case 1:out.println("Cost : "+(1200*length*breadth) );
				break;
		case 2:	out.println("Cost : "+(1500*length*breadth) );
				break;
		case 3:out.println("Cost : "+(1800*length*breadth) );
				break;
		case 4:out.println("Cost : "+(2500*length*breadth) );
				break;
		default :out.println("Enter the valid choice");		
		}
	}
}
