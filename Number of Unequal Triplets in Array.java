class Solution {
    public int unequalTriplets(int[] nums) {
        int n=nums.length;//number to iterate 
        int c=0; //counter inicialization
        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]!=nums[j]&&nums[i]!=nums[k]&&nums[j]!=nums[k]){//checks if the number on each position of the array is equal to the other, 
                        c++;//adds to the couter the number of times a symbol does not repeat in the other positions of the array
                    }
                }
            }
        }
     return c;

    }
}
