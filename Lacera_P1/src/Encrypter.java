import java.util.Scanner;

public class Encrypter {

	static int Code1;
	static int Code2;     // Array of the digits collected by the user
	static int Code3;
	static int Code4;
	static int temp;
	
	public static void Encrypt() {

		Scanner Digits = new Scanner(System.in);

		System.out.println("Enter the code that you want to Encrypt separate by a space: ");

		// Input from the User
		
			Code1 = Digits.nextInt();
			Code2 = Digits.nextInt();
			Code3 = Digits.nextInt();
			Code4 = Digits.nextInt();

			// Encrypt function
			Code1 = (Code1 + 7) % 10;
			Code2 = (Code2 + 7) % 10;
			Code3 = (Code3 + 7) % 10;
			Code4 = (Code4 + 7) % 10;
			
			//Encrypt Swap
			temp = Code3;
			Code3 = Code1;
			Code1 = temp;
			temp = Code4;
			Code4 = Code2;
			Code2 = temp;
			
			//User Output 
			System.out.print(Encrypter.Code1);
			System.out.print(Encrypter.Code2);
			System.out.print(Encrypter.Code3);
			System.out.print(Encrypter.Code4);
			
		}

		

	}

