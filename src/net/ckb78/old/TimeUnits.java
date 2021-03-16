import java.util.Scanner;
public class TimeUnits {
    public static void main(String[] args) {
        System.out.println("How many seconds do you have available? ");
        Scanner scanner = new Scanner(System.in);
        long seconds = scanner.nextLong();
        long minutes = seconds / 60;
        short secondsRest = (short) (seconds % 60);
        System.out.println(minutes + " minutes and " + secondsRest + " seconds");
        long hours = minutes / 60;
        short minutesRest = (short) (minutes % 60);
        System.out.println(hours + " hours and " + minutesRest + " minutes and " +
                secondsRest + " seconds");
        long days = hours / 24;
        short hoursRest = (short) (hours % 24);
        System.out.println(days + " days and " + hoursRest + " hours and " + minutesRest +
                " minutes and " + secondsRest + " seconds");
        long years = days / 365;
        short daysRest = (short) (days % 365);
        System.out.println(years + " years and " + daysRest + " days and " + hoursRest + " hours and " + minutesRest + " minutes and " + secondsRest + " seconds");
    }
}