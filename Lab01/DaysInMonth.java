import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = -1;
        int month = -1;

        
        while (true) {
            System.out.print("Enter month (e.g. January, Jan., Jan, 1): ");
            String monthInput = scanner.nextLine().trim();
            month = parseMonth(monthInput);

            System.out.print("Enter year (non-negative integer): ");
            String yearInput = scanner.nextLine().trim();

            try {
                year = Integer.parseInt(yearInput);
                if (year >= 0 && month != -1) {
                    break; 
                }
            } catch (NumberFormatException e) {
               
            }
            System.out.println("Invalid month or year. Please try again!\n");
        }

       
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int days = 0;

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                days = isLeapYear ? 29 : 28;
                break;
        }

        System.out.println("Number of days: " + days);
        scanner.close();
    }

    
    private static int parseMonth(String input) {
        input = input.toLowerCase().replace(".", "");
        switch (input) {
            case "january": case "jan": case "1": return 1;
            case "february": case "feb": case "2": return 2;
            case "march": case "mar": case "3": return 3;
            case "april": case "apr": case "4": return 4;
            case "may": case "5": return 5;
            case "june": case "jun": case "6": return 6;
            case "july": case "jul": case "7": return 7;
            case "august": case "aug": case "8": return 8;
            case "september": case "sep": case "sept": case "9": return 9;
            case "october": case "oct": case "10": return 10;
            case "november": case "nov": case "11": return 11;
            case "december": case "dec": case "12": return 12;
            default: return -1;
        }
    }
}