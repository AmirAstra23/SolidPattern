import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleForUser {
    protected double tempInt;
    protected String temp;
    protected String keyword;
    protected String manufacturer;
    protected double minPrice;
    protected double maxPrice;

    public void scan() {
        Scanner scanner = new Scanner(System.in);
        temp = scanner.nextLine();

    }

    public void scanInt() {
        Scanner scanner = new Scanner(System.in);
        tempInt = scanner.nextInt();

    }
}
