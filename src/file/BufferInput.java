package file;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by sambo visal on 31/07/2017.
 */
public class BufferInput {
    public static void main(String[] args){
        try {
            FileInputStream fis = new FileInputStream("D:\\stream\\hello.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            byte b[] = new byte[100];
            try {
//                int i=-1;
//                while ((i=bis.read())!=-1){
//                    System.out.println(i);
//                }
                bis.read(b);
                String s = new String(b);
                System.out.println(s);
//                int i = bis.available();
//                System.out.println(i);
//                bis.reset();

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
