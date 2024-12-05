package main.java.by.rublevskaya.model.task1.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamProcessor {

    public List<Integer> removeDuplicates(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public List<Integer> filterEvenNumber(List<Integer> numbers) {
        return numbers.stream()
                .filter(num -> num % 2 == 0 && num >= 7 && num <= 17)
                .collect(Collectors.toList());
    }

    public List<Integer> multiplication(List<Integer> numbers) {
        return numbers.stream()
                .map(num -> num * 2)
                .collect(Collectors.toList());
    }

    public List<Integer> firstFourSorted(List<Integer> numbers) {
        return numbers.stream()
                .sorted()
                .limit(4)
                .collect(Collectors.toList());
    }

    public long countElements(List<Integer> numbers) {
        return numbers.size();
    }

    public double average(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
    }
}
