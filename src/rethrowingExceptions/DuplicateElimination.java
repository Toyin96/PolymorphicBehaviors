package rethrowingExceptions;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateElimination {

    private static String[] names = {"Silas", "ben", "John", "Kunle", "silas", "john", "Barnabas", "Ben", "John"};

    private ArrayList<String> removeDuplicates = new ArrayList<String>();

    public static void main(String[] args) {

        DuplicateElimination duplicate = new DuplicateElimination();
        duplicate.firstname(names);

    }

    public void firstname(String[] array) {

        for (String s : array) {

            String newS = s.toLowerCase();

            if (!removeDuplicates.contains(newS)) {
                removeDuplicates.add(newS);
            }
        }
        System.out.println(removeDuplicates.toString());
    }
}
