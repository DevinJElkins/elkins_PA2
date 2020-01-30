package elkins_p2;
import java.util.*;
public class BMICalculator {
	public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("How tall are you (feet)? ");
        double feet = console.nextInt();
        System.out.print("And how many inches? ");
        double height = console.nextDouble();
        height = feet*12 + height;
        System.out.print("How much do you weigh (in pounds)? ");
        double weight = console.nextDouble();
        double bmi = (weight * 703 / height / height);
        System.out.printf("BMI = %.1f\n",bmi);
        if (bmi < 18.5) {
            System.out.println("You are underweight");
        } else if (bmi < 25) {
            System.out.println("You are normal");
        } else if (bmi < 30) {
            System.out.println("You are overweight");
        } else {
            System.out.println("You are obese");
        }
    }
}

