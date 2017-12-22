package file;

import java.io.*;
import java.util.Scanner;

/**
 * Created by sambo visal on 31/07/2017.
 */
public class BufferOutput {
    public static void main(String[] args)throws IOException
    {
        Scanner sca = new Scanner(System.in);

        try
        {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\stream\\hello.txt"));
            try {
                System.out.println("Write something to change");
                String s = sca.nextLine();
                byte b[] = s.getBytes();
                bos.write(b);
                bos.flush();
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
