package file.DataoutputStreamMethod;

import java.io.*;

/**
 * Created by sambo visal on 01/08/2017.
 */
public class BytesMethod {

    public static void main(String[] args)throws IOException{
        FileOutputStream fos = new FileOutputStream("D:\\stream\\hello.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        String s = "Hello World";
        dos.writeBytes(s);
        FileInputStream fis = new FileInputStream("D:\\stream\\hello.txt");
        DataInputStream dis = new DataInputStream(fis);
        while (dis.available()>0){
            byte b = dis.readByte();
            char ch=(char) b;
            System.out.println(ch);
        }
    }
}
