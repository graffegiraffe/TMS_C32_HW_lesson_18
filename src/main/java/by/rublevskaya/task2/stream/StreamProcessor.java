package main.java.by.rublevskaya.task2.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamProcessor {
    public List<String> selectName(List<String> names, char firstLetter) {
        return names.stream()
                .filter(name -> name.toLowerCase().startsWith(String.valueOf(firstLetter).toLowerCase()))
                .collect(Collectors.toList());
    }

    public String getFirstName(List<String> names) {
        return names.stream()
                .sorted()
                .findFirst()
                .orElse("No matches");
    }
}
