import java.util.Scanner;

public class Decrypter {
	
	static int CodeDecryter1;
	static int CodeDecryter2;     // Array of the digits collected by the user
	static int CodeDecryter3;
	static int CodeDecryter4;
	static int temp;
	
	
	public static void Decrypt() {

		Scanner Digits = new Scanner(System.in);

		System.out.println("Enter the code that you want to Decrypt separate by a space: ");

		// Input from the User
		CodeDecryter1 = Digits.nextInt();
		CodeDecryter2 = Digits.nextInt();
		CodeDecryter3 = Digits.nextInt();
		CodeDecryter4 = Digits.nextInt();
		// Decrypt Swap

		 temp = CodeDecryter1; CodeDecryter1 = CodeDecryter3; CodeDecryter3 = temp;
		 temp = CodeDecryter2; CodeDecryter2 = CodeDecryter4; CodeDecryter4 = temp;

		// Decrypt function

		if (CodeDecryter1 >= 7) {
			CodeDecryter1 = CodeDecryter1 - 7;
		} else {
			CodeDecryter1 = (CodeDecryter1 + 10) - 7;
		}
		if (CodeDecryter2 >= 7) {
			CodeDecryter2 = CodeDecryter2 - 7;
		} else {
			CodeDecryter2 = (CodeDecryter2 + 10) - 7;
		}
		if (CodeDecryter3 >= 7) {
			CodeDecryter3 = CodeDecryter3 - 7;
		} else {
			CodeDecryter3 = (CodeDecryter3 + 10) - 7;
		}
		if (CodeDecryter4 >= 7) {
			CodeDecryter4 = CodeDecryter4 - 7;
		} else {
			CodeDecryter4 = (CodeDecryter4 + 10) - 7;
		}


	}

}
