package lab01;

import java.util.Scanner;

public class NumberOfDayOfMonth {
    //check valid month
    private static boolean isValidMonth (String month) {
        return month.matches(
            "^(january|ran\\.|jan|1|"
            + "february|feb\\.|feb|2|"
            + "march|mar\\.|mar|3|"
            + "april|apr\\.|apr|4|"
            + "may|5|"
            + "june|jun\\.|jun|6|"
            + "july|jul\\.|jul|7|"
            + "august|aug\\.|aug|8|"
            + "september|sep\\.|sep|9|"
            + "october|oct\\.|oct|10|"
            + "november|nov\\.|nov|11|"
            + "december|dec\\.|dec|12|)$"
        );
    }

    //check valid year
    private static boolean isValidYear (String yearStr) {
        return yearStr.matches("^\\d{4}$");
    }

    //get days of month in year
    private static int getDayInMonth (String month, int year) {
        int days = 0;
        switch (month) {
            case "january":
            case "jan\\.":
            case "jan":
            case "1": 
            case "march":
            case "mar\\.":
            case "mar":
            case "3":
            case "may":
            case "5":
            case "july":
            case "jul\\.":
            case "jul":
            case "7":
            case "august":
            case "aug\\.":
            case "aug":
            case "8":
            case "october":
            case "oct\\.":
            case "oct":
            case "10":
            case "december":
            case "dec\\.":
            case "dec":
            case "12":
                days = 31;
                break;
        
            case "april":
            case "apr\\.":
            case "apr":
            case "4":
            case "june":
            case "jun\\.":
            case "jun":
            case "6":
            case "september":
            case "sep\\.":
            case "sep":
            case "9":
            case "november":
            case "nov\\.":
            case "nov":
            case "11":
                days = 30;
                break;

            case "february":
            case "feb\\.":
            case "feb":
            case "2":
                days = isLeapYear(year) ? 29 : 28;
                break;
        }
        return days;
    }

    private static boolean isLeapYear (int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sacnner = new Scanner(System.in);
        int year;
        String month;
        int daysInMonth;

        //check month
        while (true) {
            System.out.println("Enter a month (ex: January, Jan., Jan, 1): ");
            month = sacnner.nextLine().toLowerCase();
            if(isValidMonth(month)) {
                break;
            } else {
                System.out.println("Invalid month, please try again");
            }
        }

        //check year
        while (true) {
            System.out.println("Enter a year (must have 4 digits): ");
            String yearStr = sacnner.nextLine();
            if (isValidYear(yearStr)) {
                year = Integer.parseInt(yearStr);
                break;
            } else {
                System.out.println("Invalid year, please try again");
            }
        }

        daysInMonth = getDayInMonth(month, year);
        System.out.println("The number of days in " + month + "/" + year + " is: " + daysInMonth);

        sacnner.close();
    }
}


