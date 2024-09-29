import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int month;
        int year;
        while(true){
            System.out.print("Enter month (1-12): ");
            month = keyboard.nextInt();
            if (month <= 12 && month >= 1) break;
            else System.out.println("Invalid month, please try again!");
        }

        while(true){
            System.out.print("Enter year: ");
            year = keyboard.nextInt();
            if (year >= 0) break;
            else System.out.println("Invalid year, please try again!");
        }

        int day;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 ||  month == 10 || month == 12) day = 31;
        else if (month == 4 || month == 6 || month == 9 || month == 11) day = 30;
        else {
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) day = 29;
                else day = 28;

        }
        System.out.println("Number of days: " + day);
    }
}