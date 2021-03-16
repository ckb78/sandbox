import java.io.*;

/* 
Controlling body weight

The program should read a weight entered by the user in kilograms and a height in meters. Then it should display a message about the user's body mass index.
Implement a static method in the Body class. The method should calculate the body mass index and display the following message:
"Underweight: BMI < 18.5" - if the body mass index is less than 18.5,
"Normal: 18.5 <= BMI < 25" - if the body mass index is between 18.5 and 25 (not inclusive),
"Overweight: 25 <= BMI < 30" - if the body mass index is between 25 and 30 (not inclusive),
"Obese: BMI >= 30" - if the body mass index is 30 or more.

Hint:
Body mass index (BMI) = weight in kg / (height in meters * height in meters)

Example output for 68.4 and 1.77:
Normal: 18.5 <= BMI < 25

*/

public class BodyMassIndexCalc {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateBMI(weight, height);
    }

    public static class Body {
        public static void calculateBMI(double weight, double height) {
            // write your code here
            double bmi = weight / (height * height);
            if (bmi < 18.5) {
                System.out.println("Underweight: BMI < 18.5");
            } else if (bmi >= 18.5 && bmi < 25) {
                System.out.println("Normal: 18.5 <= BMI < 25");
            } else if (bmi >= 25 && bmi < 30) {
                System.out.println("Overweight: 25 <= BMI < 30");
            } else {
                System.out.println("Obese: BMI >= 30");
            }
        }
    }
}