import java.util.Scanner;

public class Encrypter {
	
    static int mainEncrypter;
	static int CodeEncrypter1;
	static int CodeEncrypter2;     // Array of the digits collected by the user
	static int CodeEncrypter3;
	static int CodeEncrypter4;
	static int temp;
	
	public static void Encrypt() {

		Scanner Digits = new Scanner(System.in);

		System.out.println("Enter the code that you want to Encrypt: ");

		// Input from the User
		
			mainEncrypter = Digits.nextInt(); 
			
			
			//Separation of integers 
			if(mainEncrypter > 999) {
				CodeEncrypter1 = mainEncrypter / 1000;
				CodeEncrypter2 = (mainEncrypter / 100) % 10;
				CodeEncrypter3 = (mainEncrypter / 10) % 10; 
				CodeEncrypter4 = mainEncrypter % 10; 
			}else if(mainEncrypter > 99){
				CodeEncrypter1 = 0;
				CodeEncrypter2 = (mainEncrypter / 100) % 10;
				CodeEncrypter3 = (mainEncrypter / 10) % 10; 
				CodeEncrypter4 = mainEncrypter % 10; 
			}else if(mainEncrypter > 9) {
				CodeEncrypter1 = 0;
				CodeEncrypter2 = 0;
				CodeEncrypter3 = (mainEncrypter / 10) % 10; 
				CodeEncrypter4 = mainEncrypter % 10; 
			}else {
				CodeEncrypter1 = 0;
				CodeEncrypter2 = 0;
				CodeEncrypter3 = 0;
				CodeEncrypter4 = mainEncrypter;		
			}
				
		
			// Encrypt function
			CodeEncrypter1 = (CodeEncrypter1 + 7) % 10;
			CodeEncrypter2 = (CodeEncrypter2 + 7) % 10;
			CodeEncrypter3 = (CodeEncrypter3 + 7) % 10;
			CodeEncrypter4 = (CodeEncrypter4 + 7) % 10;
			
			
			//Encrypt Swap
			temp = CodeEncrypter3;
			CodeEncrypter3 = CodeEncrypter1;
			CodeEncrypter1 = temp;
			temp = CodeEncrypter4;
			CodeEncrypter4 = CodeEncrypter2;
			CodeEncrypter2 = temp;
			
			
		}

		

	}

