/*2. Напишите функцию, для поиска наиболее длинного общего префикса, среди массива строк.
Если общего префикса нет, то возвращать пустую строку. Пример ["aabb", "aabbb", "aaabb"] - ответ "aa" */

package ru.Geekbrains;

import java.util.Arrays;

public class Task001 {
    public static void main(String[] args) {
        String[] arr = {"aaaaaavv", "aaaadd", "aaarrr", "aabb", "aaabbb", "aabb"};
        String result = longestCommonPrefix(arr);
        StringBuilder sb = new StringBuilder();
        if (!result.equals("")) {
            sb.append("Наиболее длинный общий префикс в массиве ");
            sb.append(Arrays.toString(arr));
            sb.append(" - ");
            sb.append(result);
        }
        else {
            sb.append("Одинаковых префиксов в массиве ");
            sb.append(Arrays.toString(arr));
            sb.append(" нет!");
        }
        System.out.println(sb);
    }

    static String longestCommonPrefix(String[] array) {
        String result = array[0];
        int index;
        int lastSymbol;
        for(int i = 1; i < array.length; i++) {
            index = 0;
            lastSymbol = 0;
            while(index < result.length() && index < array[i].length()) {
                if(result.charAt(index) == array[i].charAt(index)) {
                    lastSymbol++;
                } else {
                    break;
                }
                index++;
            }
            result = result.substring(0, lastSymbol);
        }
        return result;
    }
}
