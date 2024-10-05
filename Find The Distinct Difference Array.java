import java.util.HashSet;
import java.util.Set;
class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;//to iterate
        int[] p=new int[n];//prefix
        int[] s=new int[n];//suffix
        Set<Integer> ps=new HashSet<>();//set to pull prefix elements
        for(int i=0;i<n;i++){
            ps.add(nums[i]);
            p[i]=ps.size();
        }
        Set<Integer> ss=new HashSet<>();//set to pull suffix elements
        for(int i=n-1;i>=0;i--){
            ss.add(nums[i]);
            s[i]=ss.size();
        }
        //difference by extracting suffix from prefix
        int[] d=new int[n];
        for(int i=0;i<n;i++){
            int se=(i+1<n)?s[i+1]:0;
            d[i]=p[i]-se;
        }
        return d;
    }
}
