package ru.Geekbrains;/*
 * 1. Задан массив, например, nums = [1,7,3,6,5,6]. Написать программу,
 * которая найдет индекс i для этого массива такой,
 * что сумма элементов с индексами < i равна сумме элементов с индексами > i.
 */
import java.util.Arrays;

public class Task000 {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int left_values = nums[0];
        int right_values = 0;
        int result_index = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                right_values += nums[j];
            }
            if (left_values == right_values) {
                result_index = i;
                break;
            }
            else {
                right_values = 0;
            }
            left_values += nums[i];
        }
        String result_index_str = Integer.toString(result_index);
        System.out.println("Искомый индекс в массиве " + Arrays.toString(nums) + " = " + result_index_str);
    }
}
