package file.DataoutputStreamMethod;

import java.io.*;

/**
 * Created by sambo visal on 01/08/2017.
 */
public class CharsMethod {

    public static void main(String[] args)throws IOException{
        FileOutputStream fos = new FileOutputStream("D:\\stream\\hello.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        String s = "Hello World";
        dos.writeChars(s);
        FileInputStream fis = new FileInputStream("D:\\stream\\hello.txt");
        DataInputStream dis = new DataInputStream(fis);
        while (dis.available()>0){
            char k =dis.readChar();
            System.out.println(k);
        }

    }
}
