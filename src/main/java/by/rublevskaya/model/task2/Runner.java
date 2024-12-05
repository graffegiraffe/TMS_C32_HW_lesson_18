package main.java.by.rublevskaya.model.task2;

import main.java.by.rublevskaya.model.task2.stream.StreamProcessor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        List<String> studentName = new ArrayList<> (Arrays.asList(
                "Andryusha", "Katyusha", "Ilyusha", "Olezha", "Seryozha", "Dimochka",
                "Igoryusha", "Marinochka", "Ritochka", "Bogdanchik", "Danik", "Kiryusha",
                "Sultan", "Georgi", "Dmitry", "Vladusha"
        ));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first letter to filter names: ");
        char firstLetter = scanner.nextLine().charAt(0);
        StreamProcessor processor = new StreamProcessor();
        List<String> filteredNames = processor.selectName(studentName, firstLetter);
        System.out.println("Names starting with " + firstLetter + ": " + filteredNames);
        String firstSortedName = processor.getFirstName(filteredNames);
        System.out.println("First name after sorting: " + firstSortedName);
        scanner.close();
    }
}
