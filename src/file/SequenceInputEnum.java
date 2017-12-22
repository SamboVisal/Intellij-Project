package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Enumeration;

import java.util.Vector;

/**
 * Created by sambo visal on 31/07/2017.
 */
public class SequenceInputEnum {

    public static void main(String[] args)throws IOException{
        try {
            FileInputStream f1 = new FileInputStream("D:\\stream\\hello.txt");
            FileInputStream f2 = new FileInputStream("D:\\stream\\hello1.txt");
            FileInputStream f3 = new FileInputStream("D:\\stream\\hello2.txt");
            Vector l = new Vector();
            l.add(f1);
            l.add(f2);
            l.add(f3);
            Enumeration e = l.elements();
            SequenceInputStream seq = new SequenceInputStream(e);
            int i;
            while((i=seq.read())!=-1){
                System.out.println((char)i);
            }
            f1.close();
            f2.close();
            f3.close();
            seq.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
