package me.splm.test;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        File file1=new File("");
        System.out.print("Has fixed the problems belong to Issue101.");
        boolean isRename = file1.renameTo(new File(""));
        System.out.print("This is my new function.");
    }
}
