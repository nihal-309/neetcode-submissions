class Solution {
    public int[] productExceptSelf(int[] nums) {
        long prod = 1;
        int len = nums.length;
        int[] nums1 = new int[len]; int zeros=0;
        for(int num : nums){
            if(num == 0) zeros++;
            prod*=num;
        }

        if(prod == 0 && zeros < 2){
            prod=1;
            for(int i=0; i<len; i++){
                if(nums[i] != 0) prod*=nums[i];
            }
            for(int i=0; i<len; i++){
                if(nums[i] == 0) nums1[i] = (int) prod;
            }
            return nums1;
        }
        else if(zeros >= 2){
            return new int[len];
        }
        for(int i=0; i<len; i++){
            nums1[i] = (int) prod/nums[i];
        }

        return nums1;
    }
}  
