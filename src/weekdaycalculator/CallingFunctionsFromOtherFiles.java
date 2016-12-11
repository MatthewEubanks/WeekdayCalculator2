/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekdaycalculator;

import java.util.Scanner;


/**
 *
 * @author Matthew
 */
public class CallingFunctionsFromOtherFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to Mr. Mitchell's fantastic birth-o-meter!");
        System.out.println();
        System.out.println("All you have to do is enter your birth date, and it will");
        System.out.println("tell you the day of the week on which you were born.");
        System.out.println();
        System.out.println("Some automatic tests....");
        System.out.println("12 10 2003 => " + weekday(12, 10, 2003));
        System.out.println(" 2 13 1976 => " + weekday(2, 13, 1976));
        System.out.println(" 2 13 1977 => " + weekday(2, 13, 1977));
        System.out.println(" 7  2 1974 => " + weekday(7, 2, 1974));
        System.out.println(" 1 15 2003 => " + weekday(1, 15, 2003));
        System.out.println("10 13 2000 => " + weekday(10, 13, 2000));
        System.out.println();

        System.out.println("Now it's your turn!  What's your birthday?");
        System.out.print("Birth date (mm dd yyyy): ");
        int mm = keyboard.nextInt();
        int dd = keyboard.nextInt();
        int yyyy = keyboard.nextInt();

        // put a function call for weekday() here
        System.out.println("You were born on " + weekday(mm, dd, yyyy));
    }

    public static String weekday(int mm, int dd, int yyyy) {
        int yy, total;
        String date = "";

        // bunch of calculations go here
        yy = yyyy - 1900;
        total = (yy / 4);
        total = yy + total;
        total = dd + total;
        total = total + month_offset(mm);
        if (is_leap(yyyy) && mm == 1) {
            total = (total - 1) / 7;

        } else if (is_leap(yyyy) && mm == 2) {
            total = (total - 1) / 7;

        } else {
            total = total / 7;

        }

        date = weekday_name(total) + ", " + month_name(mm) + " " + dd + ", " + yyyy;

        return date;
    }

    // paste your functions from MonthName, WeekdayName, and MonthOffset here
    MonthName.month_name();
    }

