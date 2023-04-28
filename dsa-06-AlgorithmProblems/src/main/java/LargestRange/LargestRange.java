package LargestRange;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LargestRange {
    public static void main(String[] args) {
        int[] myArray = new int[]{1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6};
        System.out.println(Arrays.toString(largestRange(myArray)));
    }

    public static int[] largestRange(int[] array) {

        int n = array.length;
        if (n == 0) {
            return new int[]{-1, -1}; // return [-1, -1] if input array is empty
        }
        Arrays.sort(array); // sort the array in ascending order
        int maxLength = 1;
        int start = 0;
        int end = 0;
        int currLength = 1;
        for (int i = 1; i < n; i++) {
            if (array[i] == array[i - 1] + 1) {
                currLength++;
            } else if (array[i] == array[i - 1]) {
                // do nothing, skip duplicates
            } else {
                if (currLength > maxLength) {
                    maxLength = currLength;
                    start = i - currLength;
                    end = i - 1;
                }
                currLength = 1;
            }
        }
        // check if the last sequence is the longest
        if (currLength > maxLength) {
            maxLength = currLength;
            start = n - currLength;
            end = n - 1;
        }
        return new int[]{array[start], array[end]};
    }
    public static int[] largestRange2(int[] array) {
        int[] bestRange=new int[2]; // first field is starting value, second is the end value of the range
        int longestRange=0;
        Map<Integer,Boolean> numsMap=new HashMap<>();
        // true means not visited yet
        for (int i : array) {
            numsMap.put(i,true);
        }
        for (int i : array) {
            if(!numsMap.get(i)) continue;
            // this part means that element is not visited yet
            int currentLength=1;
            int left=i-1;
            int right =i+1;
            // find the left edge of this current value i
            while(numsMap.containsKey(left)){
                numsMap.put(left,false);
                currentLength++;
                left--;
            }
            // find the right edge of this current value i
            while(numsMap.containsKey(right)){
                numsMap.put(right,false);
                currentLength++;
                right++;
            }
            //
            if(currentLength>longestRange){
                longestRange=currentLength;
                bestRange=new int[]{left+1,right-1};
            }
        }
        return bestRange;
    }
}