import java.util.Arrays;

public class TwoSum {

    // ---------- Two Pointer Technique--------------//
    // ---------- Time complexity: O(n)
    // ----------- Space complexity: O(1)
    public static int[] twoSum(int[] numbers, int target) {

        Arrays.sort(numbers);
        int[] result = new int[2];

        int i = 0; // represent first pointer

        int j = numbers.length - 1; // represent second pointer

        while (i < j) {
            int sum = numbers[i] + numbers[j];

            if (sum < target) {
                i++;
            } else if (sum > target) {
                j--;
            } else if (sum == target) {
                result[0] = numbers[i];
                result[1] = numbers[j];
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSum(new int[]{16, 3, 11, 5, 15}, 8)));

    }


}

