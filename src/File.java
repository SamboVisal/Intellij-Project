/**
 * Created by sambo visal on 31/07/2017.
 */
import java.io.*;
import java.util.Scanner;

public class File {

    public static void main(String[] args){
    //    System.out.println("Hello world");
        Scanner bu = new Scanner(System.in);
        byte b[] = new byte[100];
        try {
            FileInputStream f = new FileInputStream("D:\\stream\\hello.txt");
            try
            {
                f.read(b);
                String s = new String(b);
                System.out.println(s);

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
