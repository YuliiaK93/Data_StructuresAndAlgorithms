
import java.util.Arrays;

public class FrequencyOfEachArray {
    public static void countFreq(int arr[], int n)
    {
        boolean exist[] = new boolean[n];

        Arrays.fill(exist, false);

        // Traverse through array elements and count frequencies
        for (int i = 0; i < n; i++) {

        // Skip this element if already processed
            if (exist[i] == true)
                continue;

        // Count frequency
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    exist[j] = true;
                    count++;
                }

            }
            System.out.println(arr[i] + " " + count);
        }
    }


    public static void main(String []args)
    {
        int arr[] = new int[]{ 1,2,3,4,3,2,1,3,2,2,2,4,2,2,2,2,2 };
        int n = arr.length;
        countFreq(arr, n);
    }
}

