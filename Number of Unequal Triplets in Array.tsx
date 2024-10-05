function unequalTriplets(nums: number[]): number {
    let n=nums.length;
    let c=0;
    for(let i=0;i<n;i++){
        for(let j=i+1;j<n;j++){
            for(let k=j+1;k<n;k++){
                if(nums[i]!==nums[j]&&nums[i]!==nums[k]&&nums[j]!==nums[k]){
                    c++;
                }
            }
        }
    }
return c;
};
