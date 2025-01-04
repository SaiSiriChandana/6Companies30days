/*Given an array of integers nums and an integer k. A continuous subarray is called nice if there are k odd numbers on it.

Return the number of nice sub-arrays.

 

Example 1:

Input: nums = [1,1,2,1,1], k = 3
Output: 2
Explanation: The only sub-arrays with 3 odd numbers are [1,1,2,1] and [1,2,1,1].*/
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return countAtMostK(nums, k) - countAtMostK(nums, k - 1);
    }

    private int countAtMostK(int[] nums, int k) {
        int l = 0, cnt = 0, oddCnt = 0;

        for (int r = 0; r < nums.length; r++) {
            // Increment oddCount if nums[right] is odd
            if (nums[r] % 2 != 0) {
                oddCnt++;
            }

            // Shrink the window if oddCount > k
            while (oddCnt > k) {
                if (nums[l] % 2 != 0) {
                    oddCnt--;
                }
                l++;
            }

            // Count subarrays with at most k odd numbers
            cnt += (r - l + 1);
        }

        return cnt;
    }
}
