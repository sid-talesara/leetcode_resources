
// Approach 
// 1-> red
// 2-> blue
// 3-> green
// All the left side will be 0 or red
// All the right side will be 2 or green 
// then all the pieces in between are 1 or blue  

// Tutorial:https://www.youtube.com/watch?v=HuS-ZsnEdbc&pp=ygULc29ydCBjb2xvcnM%3D

class Solution {
    public int[] swapNumbers(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return nums;
    }

    public void sortColors(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return;
        int l = 0;
        int r = n - 1;
        int i = 0;
        while (i <= r) {
            if (nums[i] == 0) {
                swapNumbers(nums, l++, i++);
            } else if (nums[i] == 2) {
                swapNumbers(nums, r--, i);
            } else
                i++;

        }

    }
}