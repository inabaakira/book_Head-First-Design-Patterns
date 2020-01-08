// -*- mode: java; coding: utf-8 -*-
// file: InputTest.java
//     Created:       <2019/11/20 17:30:02>
//     Last Modified: <2019/11/20 18:04:16>

import java.io.*;

public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;

        try {
            InputStream in =
                new LowerCaseInputStream(
                    new BufferedInputStream(
                        new FileInputStream("test.txt")));

            while ( (c = in.read()) >= 0 ) {
                System.out.print((char)c);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
