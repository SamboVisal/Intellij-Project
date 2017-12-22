package file;

import java.io.*;
import java.util.Scanner;

/**
 * Created by sambo visal on 01/08/2017.
 */
public class FilterOutputStreamDemo {

    public static void main(String[] args)throws IOException{
        File file = new File("D:\\stream\\hello.txt");
        FileOutputStream fos = new FileOutputStream(file);
        FilterOutputStream fios = new FilterOutputStream(fos);
        Scanner bu = new Scanner(System.in);
        System.out.println("Enter some text");
        String name = bu.next();
        byte[] b = name.getBytes();
        fios.write(b);
        fios.flush();
        fios.close();
        FileInputStream fis = new FileInputStream(file);
        FilterInputStream fiss = new BufferedInputStream(fis);
        while(fiss.available()>0){
            int ch = fiss.read();
            System.out.println((char)ch);
        }
    }
}
