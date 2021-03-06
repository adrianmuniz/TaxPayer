package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.legal;
import entities.physics;
import entities.taxpayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		List<taxpayer> list = new ArrayList<>();
		
		
		System.out.println("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i =1; i<=n; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();		
			System.out.print("Anual income: ");
			double annualIncome = sc.nextDouble();
				if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double expenditures = sc.nextDouble();
				list.add(new physics(name, annualIncome, expenditures));
				}
				else {
					System.out.print("Number of employees: ");
					int numbersEmployee = sc.nextInt();
					list.add(new legal(name, annualIncome, numbersEmployee));
				}
		}	
		
		double sum = 0.0;
		System.out.println();
		System.out.println("TAXES PAID:");
		for (taxpayer tp : list) {
			double tax = tp.tax();
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
			sum += tax;
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		sc.close();
	}
}
