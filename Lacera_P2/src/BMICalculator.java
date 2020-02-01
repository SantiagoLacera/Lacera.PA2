import java.util.Scanner;

public class BMICalculator {

	static Scanner in = new Scanner(System.in);
	private static String BmiCategory;

	private static float Weight;
	private static float Height;
	private static float tempInch;
	private static float userBMI;
	static int calculationOption = 0;
	static boolean calculationImperial = false;
	static boolean calculationMetric = false;

	public static void main(String[] args) {
		// Create the variables for the Weight & Height for Imperial and Metric system

		BMICalculator app = new BMICalculator();
		app.readUserData();
		app.calculateBmi();
		app.displayBmi();

	}
	// Create method to read the data from user
	public void readUserData() {
		readUnitType();
		readMeasurementData();
	}

	// Create a method that allow to chose between the different Measurements
	private static void readMeasurementData() {
		// Make a switch stamen that allows the user to choose formula 1 or 2
		switch (calculationOption) {
		
		case 1:
			calculationImperial = true;
			readImperialData();
			break;
		case 2:
			calculationMetric = true;
			readMetricData();
			break;
		default:	
			System.out.print("This is not an option try again!\n");
			break;
		}
				

	}

	// Make a private instance that will read the option of the User
	private static int readUnitType() {
		// Create a display showing the user for the Height and Weight
		System.out.println("1. Standard ");
		System.out.println("2. Metric ");
		System.out.print("What formula would you like to use: ");
		calculationOption = in.nextInt();
		return calculationOption;

	}

	private static void readImperialData() {

		// Take the input from the user for the Weight and the Height if they choose
		// Imperial
		System.out.print("Your Weight (Pounds): ");
		Weight = in.nextInt();
		System.out.print("Your Height (Feet): ");
		Height = in.nextInt();
		Height = Height * 12;
		System.out.print("Your Height (Inches): ");
		tempInch = in.nextInt();
		Height = tempInch + Height;
		

	}

	private static void readMetricData() {
		// Take the input from the user for the Weight and the Height
		System.out.print("Your Weight (Kilograms): ");
		Weight = in.nextInt();
		System.out.print("Your Height (centimeters): ");
		Height = in.nextInt();
		Height = Height / 100;
	}

	// Create a method that will display the users input and display the BMI
	// categories
	public void displayBmi() {
		System.out.printf("\nYour BMI: %.2f \n", userBMI);
		System.out.printf("\nYour BMI in under the category: " + BmiCategory); // String showing the type of category
		System.out.print("\nBMI Categories:\r\n" + "Underweight = <18.5\r\n" + "Normal weight = 18.5–24.9\r\n"
				+ "Overweight = 25–29.9\r\n" + "Obesity = BMI of 30 or greater");
		

	}

	// Create methods for the calculations
	public void calculateBmi() {
		// input the formulas in the methods
		// make the formulas evaluate the user input
		setWeight(Weight);
		setHeight(Height);
		setBmi(userBMI);
		calculateBmiCategory();
	}

	private void calculateBmiCategory() {
		// Will call calculateBmiCategory to show in what category the User is at
		setBmiCategory(BmiCategory);

	}

	public float getBmi() {
		return this.userBMI;
	}

	private void setBmi(float userBMI) {
		if (calculationImperial == true) {
			userBMI = (703 * Weight) / (Height * Height);
			this.userBMI = userBMI;
		} else if (calculationMetric == true) {
			userBMI = (Weight) / (Height * Height);
			this.userBMI = userBMI;
		}
	}

	public String getBmiCategory() {
		return this.BmiCategory;
	}

	private void setBmiCategory(String whatCategory) {
		if (userBMI < 18.5) {
			 whatCategory = "Underweight";
			 this.BmiCategory = whatCategory;
		} else if (userBMI > 18.5 && userBMI < 25) {
			whatCategory  = "Normal weight";
			this.BmiCategory = whatCategory;
		} else if (userBMI > 25 && userBMI < 30) {
			whatCategory = "Overweight";
			this.BmiCategory = whatCategory;
		} else if (userBMI > 30) {
			whatCategory = "Obesity";
			this.BmiCategory = whatCategory;
		}

	}

	public static float getWeight() {
		return Weight;
	}

	public void setWeight(float weight) {
		if(Weight <= 0) {
			Weight = 0;
			System.out.println("Sorry, negative numbers are not allowed, try again!");
			readMeasurementData();
		}else
		this.Weight = weight;
	}
	private void setHeight(float height) {
		if(Height <= 0 || tempInch <= 0) {
			Height = 0;
			tempInch = 0;
			System.out.println("Sorry, negative numbers are not allowed, try again!");
			readMeasurementData();
		}
		this.Height = height;
	}
	public static float getHeight() {
		return Height;
	}


}
