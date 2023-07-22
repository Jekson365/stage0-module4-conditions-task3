package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if (month < 1 || month > 12) {
            System.out.println("Wrong number! The month number should be between 1 and 12.");
        } else {
            int daysInMonth = getDaysInMonth(month);
            System.out.println("Number of days in month " + month + ": " + daysInMonth);
        }
    } private int getDaysInMonth(int monthNumber) {
        switch (monthNumber) {
            case 2: // February
                return 28; // For simplicity, we assume non-leap year.
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                return 30;
            default:
                return 31;
        }
    }
}
