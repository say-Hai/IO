package com.company;
import java.io.*;
import java.util.Scanner;

public class OutputFileStreamGBK {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileOutputStream out = null;
        DataOutputStream data = null;
        BufferedOutputStream buff = null;
        String str = "../../ab.txt";
        try {

            out = new FileOutputStream(str, true);
            data = new DataOutputStream(out);
            buff = new BufferedOutputStream(data);
            buff.write(sc.nextLine().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            buff.close();
        }
    }
}
