package com.company;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        FileOperation reader=new FileOperation();
        int [] tall =new int[100000];
        double inversions=0;
        tall=reader.readFromFile();

    }
}
