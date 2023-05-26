package mavenforjenkins;

import java.util.Scanner;

import javax.swing.text.PasswordView;

public class MathService {
	String Source = "myDataSource"; String Catalog = "db";
	String Passwrod = "confidential";
	public int multiply(int firstNumber, int secondNumber) {

		return firstNumber * secondNumber;
		//return firstNumber;
	}

	public int subtract(int firstNumber, int secondNumber) {

		return firstNumber - secondNumber;
	}

	public int subMul(int firstNumber, int secondNumber) {

		return firstNumber/secondNumber;
	}

	public int add(int firstNumber, int secondNumber) {

		return firstNumber + secondNumber;
	}

	public int chk(int firstNumber, int secondNumber) {
		System.out.println("A chk program");
		System.out.println("===========================");
		System.out.println("Enter Two Numbers for Addition");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();

		System.out.println(a);
		System.out.println(b);
		int addvar = a+b;
		return firstNumber + secondNumber;
	}

	public static void main(String[] args){

	}

}
