package org.example.Class19;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    static void main(String[] args) {
        HashMap<Integer, String> student = new HashMap<Integer, String>();

        student.put(1001, "John");
        student.put(1002, "Jane");
        student.put(1003, "Vicky");
        student.put(1004, "Kavi");

        System.out.println(student);
        System.out.println(student.get(1001));
    }
}
