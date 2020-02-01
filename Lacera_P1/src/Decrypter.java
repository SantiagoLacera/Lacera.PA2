import java.util.Scanner;

public class Decrypter {
	
	static int mainDecrypter;
	static int CodeDecryter1;
	static int CodeDecryter2;     // Array of the digits collected by the user
	static int CodeDecryter3;
	static int CodeDecryter4;
	static int temp;
	
	
	public static void Decrypt() {

		Scanner Digits = new Scanner(System.in);

		System.out.println("Enter the code that you want to Decrypt: ");

		// Input from the User
		mainDecrypter = Digits.nextInt();
		
					
		//Separation of integers 
		if(mainDecrypter > 999) {
			CodeDecryter1 = mainDecrypter / 1000;
			CodeDecryter2 = (mainDecrypter / 100) % 10;
			CodeDecryter3 = (mainDecrypter / 10) % 10; 
			CodeDecryter4 = mainDecrypter % 10; 
		}else if(mainDecrypter > 99){
			CodeDecryter1 = 0;
			CodeDecryter2 = (mainDecrypter / 100) % 10;
			CodeDecryter3 = (mainDecrypter / 10) % 10; 
			CodeDecryter4 = mainDecrypter % 10;
		}else if(mainDecrypter > 9) {
			CodeDecryter1 = 0;
			CodeDecryter2 = 0;
			CodeDecryter3 = (mainDecrypter / 10) % 10; 
			CodeDecryter4 = mainDecrypter % 10;
		}else {
			CodeDecryter1 = 0;
			CodeDecryter2 = 0;
			CodeDecryter3 = 0;
			CodeDecryter4 = mainDecrypter;		
		}
		
		// Decrypt Swap

		 temp = CodeDecryter3; CodeDecryter3 = CodeDecryter1; CodeDecryter1 = temp ;
		 temp = CodeDecryter2; CodeDecryter2 = CodeDecryter4; CodeDecryter4 = temp;
		

		// Decrypt function

	if (CodeDecryter1 >= 7) {
			CodeDecryter1 = CodeDecryter1 - 7;
		} else {
			CodeDecryter1 = (CodeDecryter1 + 3);
		}
		if (CodeDecryter2 >= 7) {
			CodeDecryter2 = CodeDecryter2 - 7;
		} else {
			CodeDecryter2 = (CodeDecryter2 + 3);
		}
		if (CodeDecryter3 >= 7) {
			CodeDecryter3 = CodeDecryter3 - 7;
		} else {
			CodeDecryter3 = (CodeDecryter3 + 3);
		}
		if (CodeDecryter4 >= 7) {
			CodeDecryter4 = CodeDecryter4 - 7;
		} else {
			CodeDecryter4 = (CodeDecryter4 + 3);
		}

			}

}
