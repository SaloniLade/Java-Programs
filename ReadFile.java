import java.io.FileReader;
import java.io.BufferedReader;

public class ReadFile {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("D:\\Java\\sample.txt"); 
            BufferedReader br = new BufferedReader(fr);

            String line;

            while((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            fr.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
