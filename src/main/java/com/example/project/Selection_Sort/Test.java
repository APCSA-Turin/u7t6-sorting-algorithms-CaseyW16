package com.example.project.Selection_Sort;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        System.out.println("that".compareTo("and"));
        System.out.println("that".compareTo("about"));
        SelectionSort s = new SelectionSort();

        ArrayList<String> words = SelectionSort.loadWordsInto(new ArrayList<String>());
        System.out.println(SelectionSort.selectionSortWordList(words));
    }
}