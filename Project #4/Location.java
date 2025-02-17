import java.util.*;
import java.io.*;

public class Location {
    private int x;
    private int y;

    public Location() {

    }

    public static void readCsvWithSplit(String filename) throws FileNotFoundException {
        Scanner filedata = new Scanner(new File(filename));
        while(filedata.hasNextLine()) {
           String line = filedata.nextLine(); 
           String[] stringArray = line.split(",");
           int[] row = new int[stringArray.length];
           for(int i = 0; i < row.length; i++) {
              row[i] = Integer.parseInt(stringArray[i]);
           }
           System.out.println(Arrays.toString(row));
        }
    }
}
