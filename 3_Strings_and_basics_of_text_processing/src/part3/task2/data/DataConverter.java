package part3.task2.data;

import java.io.FileReader;
import java.util.Scanner;

public class DataConverter {
    private StringBuilder str = new StringBuilder();

    public String getStringData (String address) throws Exception{
        FileReader fileName = new FileReader(address);
        Scanner scanner = new Scanner(fileName);
        while (scanner.hasNextLine()) {
            String temp = scanner.nextLine();
            if (temp.contains("<?")){
                continue;
            }
            str.append(temp);
            str.append("\n");
        }
        return str.toString();
    }
}
