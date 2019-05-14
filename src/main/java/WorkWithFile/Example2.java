package WorkWithFile;
import java.io.FileWriter;

public class Example2 {
    public static void main(String[] args) throws Exception {

        FileWriter nFile = new FileWriter("file1.txt");

        nFile.write("Хокку \nПодобен лучу самурайский клинок \nИ тот затупился \nПроклятая килька в томате!!");

        nFile.close();
    }
}
