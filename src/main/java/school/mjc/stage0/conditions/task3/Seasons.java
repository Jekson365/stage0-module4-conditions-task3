package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if (month <= 3 && month >= 1) {
            System.out.println("Spring");
        }
        if (month <= 6 && month >= 3) {
            System.out.println("Summer");
        }
        if (month <= 9 && month >= 6) {
            System.out.println("Autumn");
        }
        if (month <= 12 && month >= 9) {
            System.out.println("Winter");
        }
    }
}
