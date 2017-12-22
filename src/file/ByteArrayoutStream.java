package file;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by sambo visal on 31/07/2017.
 */
public class ByteArrayoutStream {

    public static void main(String args[])throws IOException{
        FileOutputStream f1 = new FileOutputStream("D:\\stream\\hello.txt");
        FileOutputStream f2 = new FileOutputStream("D:\\stream\\hello1.txt");
        FileOutputStream f3 = new FileOutputStream("D:\\stream\\hello2.txt");
        ByteArrayOutputStream bou = new ByteArrayOutputStream();
        bou.write(65);
        bou.writeTo(f1);
        bou.writeTo(f2);
        bou.writeTo(f3);
        bou.flush();
        bou.close();
    }
}
