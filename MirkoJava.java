import java.util.Scanner;

public class MirkoJava {
	public static void main(String[] args) {
		MirkoJava obj = new MirkoJava();
		//obj.zadanie3();
		//obj.zadanie4();
		//obj.zadanie5();
		//obj.zadanie6();
	}
	
	private void zadanie3() {
		Scanner reader = new Scanner(System.in);
		float total = 0;
		float discount = 0;
		float fullPrice = 0;
		for (int i = 0 ; i < 3; i++) {
			float price = reader.nextFloat();
			fullPrice = price * 100 / 80;
			total += fullPrice;
			discount += fullPrice - price;
			System.out.println("Gross: " + fullPrice);
		}
		System.out.println("Discount: " + discount);
		System.out.println("Total cost: " + total);
	}
	
	private void zadanie4() {
		System.out.println("Enter minutes: ");
		Scanner reader = new Scanner(System.in);
		int minutes = reader.nextInt();
		System.out.println(minutes + " minutes is " + minutes/60 + " hour(s) and " + minutes%60 + " minutes");
	}
	
	private void zadanie5() {
		System.out.println("Enter number: ");
		Scanner reader = new Scanner(System.in);
		int number = reader.nextInt();
		if (number >= 0) {
			System.out.println("It's positive");
		} else {
			System.out.println("It's negative");
		}
	}
	
	private void zadanie6() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter miles: ");
		float miles = reader.nextFloat();
		System.out.println("Enter allowance: ");
		float allowance = reader.nextFloat();
		
		float expenses = allowance * miles;
		if (miles > 150) expenses+= 100;
		System.out.println("Expenses: " + expenses);
	}
}
