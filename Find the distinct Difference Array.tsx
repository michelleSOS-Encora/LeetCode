function distinctDifferenceArray(nums: number[]): number[] {
const n=nums.length;
const p:number[]=new Array(n).fill(0);//prefix
const s:number[]=new Array(n).fill(0);//suffix
//set distinct elements in prefix
const ps:Set<number>=new Set();
for(let i=0;i<n;i++){
    ps.add(nums[i]);
    p[i]=ps.size;
}
//set distinct elements in suffix
const ss:Set<number>=new Set();
for(let i=n-1;i>=0;i--){
    ss.add(nums[i]);
    s[i]=ss.size;
}
//set difference elements, substracting elements from suffix from  prefix
const d:number[]=new Array(n).fill(0);
for(let i=0;i<n;i++){
    const se=(i+1<n)?s[i+1]:0;
    d[i]=p[i]-se;
}
return d;
};
