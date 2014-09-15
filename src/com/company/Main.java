package com.company;


import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        FileOperations reader=new FileOperations("C:\\QuickSort.txt");
        int [] tall =new int[10000];
        /*New comment for Jenkins1*/
        int answer;
        tall=reader.readFromFile();
        QuickSort quick=new QuickSort();
        answer=quick.answer(tall);

        //test if all sorted correctly
        for (int i=0;i<tall.length;i++) {
            if (tall[i] != i + 1)
                System.out.println("ACHTUNG!!!");
            System.out.println(tall[i]);
        }
        System.out.println(answer);

    }
}
