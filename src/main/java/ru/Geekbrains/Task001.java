/*2. Напишите функцию, для поиска наиболее длинного общего префикса, среди массива строк.
Если общего префикса нет, то возвращать пустую строку. Пример ["aabb", "aabbb", "aaabb"] - ответ "aa" */

package ru.Geekbrains;

import java.util.Arrays;

public class Task001 {
    public static void main(String[] args) {
        String[] arr = {"aaaaaavv", "aaaadd", "aarrr", "aabb", "aabbb", "aaabb"};
        String result = longestCommonPrefix(arr);
        if (result != "") {
            System.out.println("Наиболее длинный общий префикс в массиве " + Arrays.toString(arr) + " - " + result);
        }
        else {
            System.out.println("Одинаковых префиксов в массиве " + Arrays.toString(arr) + " нет!");
        }
    }

    static String longestCommonPrefix(String[] array) {
        int[] arrayPrefixLength = new int[array.length];
        int count = 0;
        char singlePrefix = array[0].charAt(0);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length(); j++) {
                count++;
                if (array[i].charAt(j) != array[i].charAt(j + 1)) {
                    arrayPrefixLength[i] = count;
                    count = 0;
                    break;
                }
            }
        }
        Arrays.sort(arrayPrefixLength);
        for (int i = arrayPrefixLength.length - 1; i > 0; i--) {
            if (arrayPrefixLength[i] == arrayPrefixLength[i - 1]) {
                StringBuilder sb = new StringBuilder();
                for(int j = 0; j < arrayPrefixLength[i]; j++) {
                    sb.append(singlePrefix);
                }
                return sb.toString();
            }
        }
        return "";
    }
}
