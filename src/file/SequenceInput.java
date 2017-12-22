package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

/**
 * Created by sambo visal on 31/07/2017.
 */
public class SequenceInput {

    public static void main(String [] args){

        try {
            FileInputStream fis = new FileInputStream("D:\\stream\\hello.txt");
            FileInputStream fis1 = new FileInputStream("D:\\stream\\hello1.txt");
            SequenceInputStream seq = new SequenceInputStream(fis,fis1);
            int i;
            try {
                while ((i=seq.read())!=-1){
                    System.out.println((char)i);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
