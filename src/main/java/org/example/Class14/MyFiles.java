package org.example.Class14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyFiles {
    static void main(String[] args) throws IOException {
// File Creation:

        //        File file = new File("demo.txt");
        //
        //        if(file.createNewFile()) {
        //            System.out.println("File created");
        //        }else{
        //            System.out.println("File already exists");
        //        }

// File Writting:

//        FileWriter writer = new FileWriter("demo.txt");
//
//        writer.write("Hello World");
//        writer.write("\n");
//        writer.write("Goodbye World");
//
//        writer.close();
//
//        System.out.println("File Content writted");

// File Reader:

//        File file = new File("demo.txt");
//
//        Scanner scan = new Scanner(file);
//
//        while(scan.hasNextLine()){
//            System.out.println(scan.nextLine());
//        }
//
//        scan.close();

// File Delete:

        File file = new File("demo.txt");

        if(file.delete()){
            System.out.println("File deleted successfully");
        }else{
            System.out.println("File not deleted successfully");
        }
    }
}
