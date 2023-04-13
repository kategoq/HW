package HW3.seasons;

public class CheckSeason {
    public void checkSeason (Month month) {
        switch (month) {
            case May:
            case April:
            case March:
            System.out.println("это весна");
            break;
            case June:
            case July:
            case August:
                System.out.println("это лето");
                break;
            case September:
            case October:
            case November:
                System.out.println("это осень");
                break;
            case January:
            case February:
            case December:
                System.out.println("это зима");
                break;
        }
    }
}
