package com.company;
import java.io.*;

public class    ReadFromFile {
    public static void main()throws Exception {
        String src = "C:\\Users\\Alexandr\\IdeaProjects\\PR_JAVA\\PR_24\\src\\text.txt";
        File file = new File(src);
        BufferedReader br = new BufferedReader(new java.io.FileReader(file));
        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);
    }
}