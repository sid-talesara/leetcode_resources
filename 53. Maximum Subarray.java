// Used Kadane's algo to solve this question
// Kadane's algo tutorial : https://www.youtube.com/watch?v=w4W6yya1PIc&ab_channel=CodeHelp-byBabbar
//  Approach:

// initially sum=0, max= a[0];
// for(i-> n){
//  sum= sum +a[i];
//  max=Math.max(max, sum);
//  if(sum<0) sum = 0;
// }

class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int sum = 0;
       for(int i =0; i<n; i++){
           sum+=nums[i];
           max=Math.max(max, sum);
           if(sum<0) sum = 0;
       }
        return max;
    }
}