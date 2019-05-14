package WorkWithFile;
import java.io.FileReader;
import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) throws Exception {

        FileReader fr= new FileReader("file1.txt");
        Scanner scan = new Scanner(fr);

        int i = 1;

        while (scan.hasNextLine()) {
            System.out.println(i + " : " + scan.nextLine());
            i++;
        }

        fr.close();


    }
}