package com.company;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class InputFileStreamGBK {
    public static void main(String[] args) throws IOException {
        String str = "E:\\算法(第四版)\\实验代码\\IO流输入输出\\ab.txt";
        BufferedReader buff = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(str)));
        try {
            String line;
            while((line = buff.readLine() )!= null) {
                System.out.println(line);
            }

        }catch (Exception e) {
            System.out.println(e);
        }
        finally {
            buff.close();
        }
    }
}
