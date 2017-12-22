package file;

import java.io.*;

/**
 * Created by sambo visal on 31/07/2017.
 */
public class SequenceInput1 {

    public static void main(String args[]){
        try {
            FileInputStream f1 = new FileInputStream("D:\\stream\\hello.txt");
            FileInputStream f2 = new FileInputStream("D:\\stream\\hello1.txt");
            FileOutputStream f3 = new FileOutputStream("D:\\stream\\hello2.txt");
            SequenceInputStream seq = new SequenceInputStream(f1,f2);
            int i;
            try {
                while((i=seq.read())!=-1){
                f3.write(i);
                }
                System.out.println("done dude!");
                f1.close();
                f2.close();
                f3.close();
                seq.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
