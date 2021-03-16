/* 
Crossing the road blindly

The pedestrian traffic light is programmed as follows: 
at the beginning of each hour, the green signal is on for three minutes,
then the signal is yellow for one minute, 
and then it is red for one minute.
Then the light is green again for three minutes, etc.
Use the keyboard to enter a real number t that represents the number of minutes that have elapsed since the beginning of the hour.
Determine what color the traffic light is at the specified time.
Display the result as follows:
"green" if the light is green,
"yellow" if the light is yellow, and 
"red" if the light is red.

Requirements:
1. The program should read a real number from the keyboard.
2. The program should display text on the screen.
3. If the light is green, display: "green"
4. If the light is yellow, display: "yellow"
5. If the light is red, display: "red"

*/

import java.util.Scanner;

public class TrafficLights {
    public static void main(String[] args) throws Exception {
        double seconds;
        Scanner scanner = new Scanner(System.in);
        seconds = scanner.nextDouble();
        double s = seconds % 5;

        /* Five minute cycles:
        0-59 seconds    = 0.0 - 0.9     = green
        60-119          = 1   - 1.9     = green
        120-179         = 2.0 - 2.9     = green
        180-239         = 3.0 - 3.9     = yellow
        240-300         = 4.0 - 4.9     = red

        Every green light will start with a number divisible by 5,
        and end with a number that, when divided by 5, has a remainder of 3.

         */
        if (s >= 0.0 && s < 3.0){
            System.out.println("green");
        } else if (s >= 3.0 && s < 4.0) {
            System.out.println("yellow");
        } else if (s >= 4.0 && s < 5.0) {
            System.out.println("red");
        }

    }
}