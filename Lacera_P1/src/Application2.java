import java.util.Scanner;

public class Application2 {
	
	

	public static void main(String[] args) {

		int encryptOrDecrypt;
		Encrypter Encrypt = new Encrypter();

		Scanner in = new Scanner(System.in);

		System.out.println("Would you like to: ");
		System.out.println("1. Encrypt");
		System.out.println("2. Decrypt");
		System.out.print("Choose: ");
		encryptOrDecrypt = in.nextInt();

		switch (encryptOrDecrypt) {
		case 1:
			Encrypter.Encrypt();		

			break;
		case 2: // Decrypt method
			break;
		default:
			System.out.println("Sorry, your input was incorrect try again");
			// input method
		}

	}

}
