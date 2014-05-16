package com.company;


import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        FileOperation reader=new FileOperation();
        int [] tall =new int[10000];
        int answer;
        tall=reader.readFromFile();
        QuickSort quick=new QuickSort();
        answer=quick.answer(tall);

        for (int i=0;i<tall.length;i++) {
            if (tall[i] != i + 1)
                System.out.println("ACHTUNG!!!");
            System.out.println(tall[i]);
        }
        System.out.println(answer);

    }
}
