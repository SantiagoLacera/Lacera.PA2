import java.util.Scanner;

public class Application {
	
	static Scanner in = new Scanner(System.in);
	public static int encryptOrDecrypt = 0;
	

	public static void main(String[] args) {

		
		Encrypter Encrypt = new Encrypter();

		// inputMethod(encryptOrDecrypt);		

		do {
			inputMethod(encryptOrDecrypt);

			switch (encryptOrDecrypt) {
			case 1:
				Encrypter.Encrypt();
				//User Output 
				System.out.print("Your Encrypted code is: " + Encrypter.CodeEncrypter1 + " ");
				System.out.print(Encrypter.CodeEncrypter2 + " ");
				System.out.print(Encrypter.CodeEncrypter3 + " ");
				System.out.println(Encrypter.CodeEncrypter4);
				break;
			case 2:
				Decrypter.Decrypt();
				// User Output
				System.out.print("Your Encrypted code is: " + Decrypter.CodeDecryter1 + " ");
				System.out.print(Decrypter.CodeDecryter2 + " ");
				System.out.print(Decrypter.CodeDecryter3 + " ");
				System.out.println(Decrypter.CodeDecryter4);
				break;
			case 3:
				System.out.print("Goodbye!");
				break;
			default:
				System.out.println("Sorry, your input was incorrect try again \n");
				break;
				// input method
			}
		} while (encryptOrDecrypt != 3);

	}

	
	public static int inputMethod(int encryptOrDecrypt2) {
		
		System.out.println("Would you like to: ");
		System.out.println("1. Encrypt");
		System.out.println("2. Decrypt");
		System.out.println("3. Exit");
		System.out.print("Choose: ");
		return encryptOrDecrypt = in.nextInt();
			
	}

}
