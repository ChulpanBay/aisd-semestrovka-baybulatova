import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("TestData.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                String[] str = line.split(" ");
                int[] arr = new int[str.length];
                for (int i = 0; i < str.length; i++) {
                    arr[i] = Integer.parseInt(str[i]);
                }
                double start = System.currentTimeMillis();
                int k = StoogeSort.sort(arr, 0, arr.length-1);
                double end = System.currentTimeMillis();

                System.out.println(str.length + ": " + (end-start)  + " миллисекунд " + k + " операций");

                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
