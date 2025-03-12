package com.example.project.Selection_Sort;
import java.util.ArrayList;
import java.util.Arrays;
import com.example.project.Insertion_Sort.InsertionSort;

public class Test {
    public static void main(String[] args) {
        System.out.println("that".compareTo("and"));
        System.out.println("that".compareTo("about"));
        SelectionSort s = new SelectionSort();

        ArrayList<String> words = SelectionSort.loadWordsInto(new ArrayList<String>());
        System.out.println(SelectionSort.selectionSortWordList(words));
        int[]b=InsertionSort.insertionSort(new int[]{1, 3, 7, 0, 5});
        for (int a:b) {
            System.out.println(a+",");
        }

        int[] arrA = {81,4,47,92,91,10,12,25,37,54,21,51,93,22,84,57,5,18,63,100,26,98,93,64,22};
        int[] arrB = Arrays.copyOf(arrA, arrA.length);
        InsertionSort.selectionSort(arrA);
        System.out.println(Arrays.toString(arrA));
        System.out.println();

        InsertionSort.insertionSort(arrB);
        System.out.println(Arrays.toString(arrB));

    }
}