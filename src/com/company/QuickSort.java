package com.company;

/**
 * Created by Nadya on 15.05.2014.
 */
public class QuickSort {
    int answer;
    public int answer(int[] tall){

        sort(tall, 0, tall.length);
        return answer;
    }
    private void swap(int[]tall, int i, int j){
        int temp;
        temp=tall[i];
        tall[i]=tall[j];
        tall[j]=temp;
    }
    private int median(int[] tall, int l, int r){
        int med;
        med = (r - l + 1) % 2 != 0 ? (l + r+1 ) / 2 : (l + r +1) / 2- 1;
        if((tall[l]>=tall[med]&&tall[l]<=tall[r])||(tall[l]<=tall[med]&&tall[l]>=tall[r]))
            return l;
        if((tall[med]>=tall[l]&&tall[med]<=tall[r])||(tall[med]<=tall[l]&&tall[med]>=tall[r]))
            return med;
        return r;
    }
    private void sort(int[]tall, int l, int r){
        int med;
        int i;
        int j;
        int p;

        if (r-l>1) {
            answer+=r-l-1;

//          med = median(tall, l, r-1);
//          swap(tall, l, r-1);
//          swap(tall, l, med);


            p=tall[l];

            i=l+1;
            for (j=l+1;j<r;j++){
                if (tall[j]<p) {
                    swap(tall, i, j);
                    i++;
                }
            }
            swap(tall, l, i-1);
            sort(tall, l, i-1);
            sort(tall, i, r);
        }

    }
}
