package file.DataoutputStreamMethod;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by sambo visal on 01/08/2017.
 * The source byte as integer.
 */
public class WriteMethod {

    public static void main(String args[])throws IOException{
        FileOutputStream fos = new FileOutputStream("D:\\stream\\hello.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        int[] b = {65,66,67,68};
        for(int i:b){
            dos.write(i);
        }


        String name = " Visal";
        dos.writeBytes(name);
        FileInputStream fis = new FileInputStream("D:\\stream\\hello.txt");
        int k;

        while((k=fis.read())!=-1){
            System.out.println((char)k);
        }
    }
}
