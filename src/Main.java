import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Weight:");
        double Weight = scanner.nextDouble();
        System.out.println("Enter Height:");
        double Height = scanner.nextDouble();
        double bmi = Weight/(Height*Height);
        if (bmi < 18.5){
            System.out.println("Underweight");
        }else if (bmi < 25.0){
            System.out.println("Normal");
        }else if (bmi < 30.0){
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }

    }
}
