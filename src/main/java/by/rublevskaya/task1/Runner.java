package main.java.by.rublevskaya.task1;

import main.java.by.rublevskaya.task1.service.GenerateRandomNumbers;
import main.java.by.rublevskaya.task1.stream.StreamProcessor;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        GenerateRandomNumbers randomNumberService = new GenerateRandomNumbers();
        StreamProcessor streamProcessor = new StreamProcessor();

        List<Integer> numbers = randomNumberService.randomNumbers(20, 50);
        System.out.println("Generated numbers: " + numbers);

        numbers = streamProcessor.removeDuplicates(numbers);
        System.out.println("After removing duplicates: " + numbers);

        numbers = streamProcessor.filterEvenNumber(numbers);
        System.out.println("Even numbers in the range 7-17: " + numbers);

        numbers = streamProcessor.multiplication(numbers);
        System.out.println("After multiplying by 2: " + numbers);

        List<Integer> firstFourElements = streamProcessor.firstFourSorted(numbers);
        System.out.println("The first four elements after sorting: " + firstFourElements);

        long count = streamProcessor.countElements(numbers);
        System.out.println("Number of elements: " + count);

        double average = streamProcessor.average(numbers);
        System.out.println("Arithmetic mean: " + average);
    }
}