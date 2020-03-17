package arraysmethodexercise;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
			Scanner myObj = new Scanner(System.in);
			myutilities m = new myutilities();
			System.out.println("what question do you want to solve?: ");
			int answer2 = myObj.nextInt();
			if(answer2 == 1 || answer2 == 2) {
				System.out.println("input array size: ");
				int answer = myObj.nextInt();
				int arr[] = new int[answer];
				m.inputValues(arr, answer);
				if(answer2 == 1) {
					m.splitHighestValue(arr, answer);}
				else if(answer2 == 2) {
					m.shiftArray(arr, answer);}}
			else if(answer2 == 3) {
				m.matrixSymmetric();}
			//odd magic square
			else if(answer2 == 4) {
				 System.out.println("Enter matrix size: ");        
			     int a = myObj.nextInt();
				m.printmagicSquare(m.magicSquare(a), a);}
			//doubly even magic square
			else if(answer2 == 5) {
				 System.out.println("Enter matrix size: ");        
			     int a = myObj.nextInt();
				 m.printmagicSquare(m.magicSquare2(a), a);}
		}
			
}

