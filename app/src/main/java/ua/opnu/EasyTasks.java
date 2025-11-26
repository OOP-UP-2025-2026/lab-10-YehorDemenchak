package ua.opnu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EasyTasks {

    public static void main(String[] args) {
        // Для виконання лабораторної роботи необхідно написати вміст методів згідно умовам завдання,
        // після чого протестувати метод за допомогою тестів, які знаходяться в папці
        // src\test\TaskTest.java
    }

    public List<Integer> doubling(List<Integer> nums) {
        List<Integer> numsNew = new ArrayList<>(nums);
        numsNew.replaceAll(integer -> integer * 2);
        return numsNew;
    }

    public List<Integer> square(List<Integer> nums) {
        List<Integer> numsNew = new ArrayList<>(nums);
        numsNew.replaceAll(integer -> integer * integer);
        return numsNew;
    }

    public List<String> moreY(List<String> strings) {
        List<String> stringsNew = new ArrayList<>(strings);
        stringsNew.replaceAll(String -> "y" + String + "y");
        return stringsNew;
    }

    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n >= 0)
                .collect(Collectors.toList());
    }

    public List<Integer> no9(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n % 10 != 9)
                .collect(Collectors.toList());
    }

    public List<String> noZ(List<String> strings) {
        return strings.stream()
                .filter(String -> !String.contains("z"))
                .collect(Collectors.toList());
    }

    public List<String> refinedStrings(List<String> strings) {
        return strings.stream()
                .distinct()
                .sorted((a, b) -> b.length() - a.length())
                .collect(Collectors.toList());
    }

    public List<String> flatten(List<String> strings) {
        return strings.stream()
                .flatMap(name -> Arrays.stream(name.split(" ")))
                .collect(Collectors.toList());
    }

}