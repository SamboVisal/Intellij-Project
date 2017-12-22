package file.DataoutputStreamMethod;

import java.io.*;

/**
 * Created by sambo visal on 01/08/2017.
 */
public class WriteIntMethod {

    public static void main(String[] args)throws IOException{
        FileOutputStream fos = new FileOutputStream("D:\\stream\\hello.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        int b[] = {65,66,67,68,69,70};
        for(int i:b){
            dos.writeInt(i);
        }
        FileInputStream fis = new FileInputStream("D:\\stream\\hello.txt");
        DataInputStream dis = new DataInputStream(fis);
        int k;
        while(dis.available()>0){
            k=dis.read();
            String n = new String(String.valueOf(k));
           // char ch = (char)k;
            System.out.println(n);
        }
        System.out.println("Success");
    }
}
