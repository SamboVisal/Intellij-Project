package file.DataoutputStreamMethod;

import java.io.*;

/**
 * Created by sambo visal on 01/08/2017.
 * This method writes out a byte to the underlying output stream as a 1-byte value.
 */
public class ByteMethod {

    public static void main(String args[])throws IOException{
        FileOutputStream fis = new FileOutputStream("D:\\stream\\hello.txt");
        DataOutputStream dis = new DataOutputStream(fis);
        int[] b = {64,66,67,68,58};
        for (int c : b){
            dis.writeByte(c);

        }
    }
}
