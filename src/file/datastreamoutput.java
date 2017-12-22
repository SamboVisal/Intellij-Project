package file;

import java.io.*;
import java.util.Scanner;

/**
 * Created by sambo visal on 01/08/2017.
 */
public class datastreamoutput {

    public static void main(String[] args)throws IOException{

//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        FileOutputStream fos = new FileOutputStream("D:\\stream\\hello1.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        //int k = bu.nextInt();
        //writeInt is used to write as ASCII value
        //dos.writeInt(k);
//        String s = "Hello world";
//        dos.writeBytes(s);
//        dos.flush();
//        dos.close();
//        baos.close();
//        System.out.println("Done");
//        for(byte b: baos.toByteArray()){
//            System.out.println(b);
//        }
        //writeByteMethod
//        byte[] b ={12,14,23,43,33};
//        for(byte c: b ){
//            dos.writeByte(c);
//        }
        System.out.println("done");
        //WriteCharMethod
//        byte[] c = {64,65,66,67,68};
//        for(byte b1:c){
//            dos.writeChar(b1);
//        }
        //WriteCharsMethod
//        String s1 = "Hello World";
//        dos.writeChars(s1);
        //WriteBytes
//       dos.writeBytes(s1);
       /*
       write() the source byte as integer
        */
//       int w[] ={65,66,67,68};
//       for(int i:w){
//           dos.write(i);
//       }
        //writeInt()
        int i[] ={65,66,67,68,69,70};
        for(int j:i){
            dos.writeInt(j);
        }
        FileInputStream fis = new FileInputStream("D:\\stream\\hello1.txt");
        DataInputStream dis = new DataInputStream(fis);
        while(dis.available()>0){
            int k = dis.readInt();
            System.out.println(k);
        }
    }
}
