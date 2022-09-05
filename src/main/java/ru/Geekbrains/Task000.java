/*
 * 1. Задан массив, например, nums = [1,7,3,6,5,6]. Написать программу,
 * которая найдет индекс i для этого массива такой,
 * что сумма элементов с индексами < i равна сумме элементов с индексами > i.
 */

package ru.Geekbrains;

import java.util.Arrays;

public class Task000 {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int left_values = 0;
        int right_values;
        int result_index = 0;
        int summ_elements = 0;
        for (int num : nums) {
            summ_elements += num;
        }
        for (int i = 1; i < nums.length - 1; i++) {
            left_values += nums[i - 1];
            right_values = summ_elements - left_values - nums[i];
            if (left_values == right_values) {
                result_index = i;
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Искомый индекс в массиве ");
        sb.append(Arrays.toString(nums));
        sb.append(" = ");
        sb.append(result_index);
        System.out.println(sb);
    }
}
