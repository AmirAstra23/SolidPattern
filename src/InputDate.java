import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputDate {
    protected Integer tempInt;
    protected String temp;
    protected String keyword;
    protected String manufacturer;
    protected double minPrice;
    protected double maxPrice;

    BufferedReader bufferedReader =
            new BufferedReader(new InputStreamReader(System.in));

    public void setDate() throws IOException {
        temp = bufferedReader.readLine();
    }

    public void setDoubleDate() throws IOException {
        tempInt = Integer.parseInt(bufferedReader.readLine());
    }

}
