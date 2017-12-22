package file;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by sambo visal on 21/10/2017.
 */
public class ReadSpecial {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\stream\\hello.txt");
        int count=0;
        byte[] b = new byte[100];
        fis.read(b);
        String n = new String(b).toString();
        String name = "ASD";
        char c[] = n.toCharArray();
        int m=0;
        for (int i=0;i<name.length();i++){m=0;
            char ch = name.charAt(i);
            if(Character.isLetter(ch)==false){
                m=1;
                count++;
            }
        }
        if (m==0){
            System.out.println("No special character");
        }else{
            System.out.println(count);
        }



    }
}
