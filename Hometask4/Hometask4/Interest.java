package Epam.Hometask4.Hometask4;
import java.util.Scanner;
import java.io.*;
import java.math.*;
import java.io.PrintWriter;
import java.io.*;
public class Interest  {
	Interest()
    {
        Scanner scanner = new Scanner(System.in);
        PrintStream output = new PrintStream(new FileOutputStream(FileDescriptor.out));
        output.println("Enter principle : ");
        double principle=scanner.nextDouble();
        output.println("Enter rate : ");
        double rate=scanner.nextDouble();
        output.println("Enter time : ");
        double time=scanner.nextDouble();
        output.println("Simple Interest : "+SI(rate,principle,time));
        output.println("Compound Interest : "+CI(principle,rate,time));
    }
	double SI(double rate, double principle, double time)
	 {
	  return (principle*rate*time)/100;
	 }
	 double CI(double principle, double rate, double time)
	 {
	  return principle*(Math.pow((1+(rate/100)),(time)))-principle;
	 }
}