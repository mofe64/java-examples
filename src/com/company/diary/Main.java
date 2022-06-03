package com.company.diary;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Diary diary;

    public static void main(String[] args) {
        System.out.println("Enter diary name");
        String name = scanner.next();
        diary = new Diary(name);
        String prompt = """
                Welcome to your diary
                Press 1 to create an Entry
                Press 2 to view an Entry
                Press 3 to edit an Entry's body
                Press 4 to delete an Entry
                press 5 to view all entries
                Press 6 to exit
                """;
        int sentinel = 0;

        while (sentinel != -1) {
            System.out.println(prompt);
            int userInput = scanner.nextInt();
            if (userInput == 6) {
                sentinel = -1;
            } else {
                switch (userInput) {
                    case 1 -> {
                        createEntry();
                    }
                    case 2 -> {
                        viewEntry();
                    }
                    case 3 -> {
                        editEntry();

                    }
                    case 4 -> {
                        deleteEntry();
                    }
                    case 5 -> {
                        viewAllEntries();
                    }
                }
            }

        }

    }

    private static void createEntry() {
        System.out.println("Enter the entry title");
        String title = scanner.next();
        System.out.println("Enter the entry body");
        String body = scanner.next();
        System.out.println("Press 1 to manually provide an id " +
                "or 2 to auto generate");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Enter id");
            String id = scanner.next();
            Entry entry = new Entry(id, title, body);
            diary.createEntry(entry);
        } else {
            Entry entry = new Entry(title, body);
            diary.createEntry(entry);
        }
        System.out.println("Entry created");
    }

    private static void viewEntry() {
        System.out.println("Enter entry id");
        String id = scanner.next();
        try {
            Entry entry = diary.getIndividualEntry(id);
            System.out.println("Found entry");
            System.out.println(entry);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void editEntry() {
        System.out.println("Enter entry id");
        String id = scanner.next();
        System.out.println("Enter new entry body");
        String body = scanner.next();
        try {
            diary.editEntry(id, body);
            System.out.println("Edited successfully");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void deleteEntry() {
        System.out.println("Enter entry id");
        String id = scanner.next();
        try {
            diary.deleteEntry(id);
            System.out.println("Deleted successfully");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void viewAllEntries() {
        ArrayList<Entry> entries = diary.getEntries();
        for (Entry entry : entries) {
            System.out.println(entry);
        }
    }

}
