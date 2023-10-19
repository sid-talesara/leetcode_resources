// 31. Next Permutation
class Solution {
    public void nextPermutation(int[] nums) {

        int n = nums.length;
        if(n<=1) return;
        int idx1=-1;
        for(int i=n-2; i>=0;i--){
           if(nums[i]<nums[i+1]){
               idx1=i;
               break;
           }
        }
        if(idx1<0){
            Arrays.sort(nums);
            return ;
        } else{
        int idx2=-1;
        for(int i=n-1; i>=0;i--){
            if(nums[idx1]<nums[i]){
                idx2=i;
                break;
            }
        }
        swap(nums, idx1, idx2);
        Arrays.sort(nums, idx1+1, n);
        }
        

    }
    public void swap(int[] nums, int index1, int index2){
        //  Swap
        int temp = nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=temp;
    }
}