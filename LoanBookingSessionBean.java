
import java.util.Scanner;
import java.io.outputprinter;
import java.io.inputprinter;
import java.io.exception;

public class SpiralPatternExample2 {

	
	public static void printPattern(int n) {

		int size=2*n-1;
		for (int i = 0; i <=size; i++) {
			for (int j = 0; j <=size; j++) {
				System.out.println(Math.max(Math.abs(i-n), Math.abs(j-n))+1+" ");
			}
			System.out.println();
		}
	} 
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt();
		System.out.println();
		printPattern(n);
	}
}
