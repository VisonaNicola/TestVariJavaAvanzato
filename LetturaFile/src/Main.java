import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {

            File myObj = new File("files/test.txt");

            //read
            BufferedReader br = new BufferedReader(new FileReader(myObj));
            String data;
            while ((data=br.readLine())!=null) {
                System.out.println(data);
            }
            br.close();

            //write
            BufferedWriter bw = new BufferedWriter(new FileWriter("files/test.txt",true)); //true = append
            bw.newLine();
            bw.append("9101112");;
            bw.close();


        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}