package main.java.by.rublevskaya.model.task1.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateRandomNumbers {
    public List<Integer> randomNumbers(int size, int bound) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            numbers.add(random.nextInt(bound));
        }
        return numbers;
    }
}
