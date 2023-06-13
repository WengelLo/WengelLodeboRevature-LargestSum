
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                int num1 = nums.get(i);
                int num2 = nums.get(j);
                if (num1 != num2) {
                    int sum = num1 + num2;
                    if (sum > answer) {
                        answer = sum;
                    }
                } else {
                    int sum = num1 * 2;
                    if (sum > answer) {
                        answer = sum;
                    }
                }
            }
        }
        return answer;
        
    }
}