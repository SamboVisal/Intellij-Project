package file.DataoutputStreamMethod;

import java.io.*;

/**
 * Created by sambo visal on 01/08/2017.
 * This method writes a char to the underlying output stream as a 2-byte value, high byte first.
 */
public class CharMethod {

    public static void main(String[] args)throws IOException{
        FileOutputStream fos = new FileOutputStream("D:\\stream\\hello.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        byte[] b= {34,35,36,37,38,39};
        for(byte c:b){
            dos.writeChar(c);
        }
        dos.close();
        fos.close();
        FileInputStream fis = new FileInputStream("D:\\stream\\hello.txt");
        DataInputStream dis = new DataInputStream(fis);
        while (dis.available()>0){
            int k = dis.readChar();
            System.out.println(k);
        }

    }
}
