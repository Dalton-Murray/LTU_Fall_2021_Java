/*
8.6 LAB: Parsing dates
Complete main() to read dates from input, one date per line. Each date's format must be as follows: March 1, 1990. Any date not following that format is incorrect and should be ignored. Use the substring() method to parse the string and extract the date. The input ends with -1 on a line alone. Output each correct date as: 3/1/1990.

Ex: If the input is:

March 1, 1990
April 2 1995
7/15/20
December 13, 2003
-1
then the output is:

3/1/1990
12/13/2003

Dalton Murray
*/

import java.util.Scanner;

public class DateParser {
    public static int getMonthAsInt(String monthString) {
        int monthInt;

        switch (monthString) {
        case "January":
            monthInt = 1;
            break;
        case "February":
            monthInt = 2;
            break;
        case "March":
            monthInt = 3;
            break;
        case "April":
            monthInt = 4;
            break;
        case "May":
            monthInt = 5;
            break;
        case "June":
            monthInt = 6;
            break;
        case "July":
            monthInt = 7;
            break;
        case "August":
            monthInt = 8;
            break;
        case "September":
            monthInt = 9;
            break;
        case "October":
            monthInt = 10;
            break;
        case "November":
            monthInt = 11;
            break;
        case "December":
            monthInt = 12;
            break;
        default:
            monthInt = 00;
        }

        return monthInt;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String date;
        int index, month_int;
        String month, day, year;

        while (true) {
            date = scnr.nextLine();

            if (date.equals("-1") == true) {
                break;
            }

            index = date.indexOf(",");
            if (index == -1) {
                continue;
            }

            String month_date = date.substring(0, index);
            month = month_date.split(" ")[0];
            day = month_date.split(" ")[1];
            year = date.substring(index + 2);

            month_int = getMonthAsInt(month);

            System.out.println(month_int + "/" + day + "/" + year);

        }

    }
}