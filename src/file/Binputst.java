package file;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by sambo visal on 31/07/2017.
 */
public class Binputst {

    public static void main(String args[]){
        byte b[] = new byte[100];
        try
        {
            FileInputStream fis = new FileInputStream("D:\\stream\\hello1.txt");
            try {
                fis.read(b);
                ByteArrayInputStream bis = new ByteArrayInputStream(b);

                System.out.println("The ASCII value is " + b + " and special character is ");
            } catch (IOException e) {
                e.printStackTrace();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
