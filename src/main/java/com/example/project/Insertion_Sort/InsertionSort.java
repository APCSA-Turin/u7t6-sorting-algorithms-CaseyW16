package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) {
        int it = 0;
        for (int i = 1; i < elements.length; i++) {
            int iIndexAt = i;
            for (int j = i - 1; j >= 0; j--) {
                if (elements[iIndexAt] < elements[j]) {
                    int temp = elements[iIndexAt];
                    elements[iIndexAt] = elements[j];
                    elements[j] = temp;
                    iIndexAt--;
                    it++;
                } else {
                   
                    break;
                }
            }
        }
        System.out.println("Insertion sort: " + it + " iterations");

        return elements;
    }

   
    public static int[] selectionSort(int[] elements) {
        int it = 0;
        for (int i = 0; i < elements.length; i++) {
            int minimum = elements[i];
            int minIdx = i;
            for (int j = i + 1; j < elements.length; j++) {
                it++;
                if (elements[j] < minimum) {
                    minimum = elements[j];
                    minIdx = j;
                }
            }
            int temp = elements[i];
            elements[i] = elements[minIdx];
            elements[minIdx] = temp;
        }
        System.out.println("Selection sort: " + it + " iterations");
        return elements;
    }

    // PART B. sorting a 1000-word list
    public static ArrayList<String> insertionSortWordList(ArrayList<String> words) {
        int it = 0;
        for (int i = 1; i < words.size(); i++) {
            int iIndexAt = i;
            for (int j = i - 1; j >= 0; j--) {
                if (words.get(iIndexAt).compareTo(words.get(j)) < 0) {
                    String temp = words.get(iIndexAt);
                    words.set(iIndexAt, words.get(j));
                    words.set(j, temp);
                    iIndexAt--;
                    it++;
                } else {
                    break;
                }
            }
        }
        System.out.println("Insertion sort: " + it + " iterations");

        return words;
    }

    public static ArrayList<String> selectionSortWordList(ArrayList<String> words) {
        int it = 0;
        for (int i = 0; i < words.size(); i++) {
            int minIdx = i;
            for (int j = i + 1; j < words.size(); j++) {
                it++;
                if (words.get(j).compareTo(words.get(minIdx)) < 0) {
                    minIdx = j;
                }
            }
            String temp = words.get(i);
            words.set(i, words.get(minIdx));
            words.set(minIdx, temp);
        }
        System.out.println("Selection sort: " + it + " iterations");

        return words;
    }

    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }

   
}