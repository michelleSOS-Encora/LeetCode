class Solution(object):
    def distinctDifferenceArray(self, nums):
 # Arrays to store the number of distinct elements in prefix and suffix
        n=len(nums)
        p=[0]*n
        s=[0]*n
        ps=set() #prefix set 
    # Set to track distinct elements in prefix
        for i in range(n):
            ps.add(nums[i])
            p[i]=len(ps)
    # Set to track distinct elements in suffix
        ss=set()
        for i in range(n-1,-1,-1):
            ss.add(nums[i])
            s[i]=len(ss)
        diff=[0]*n
#the distinct difference calculated by substractic the suffix from the prefix
        for i in range(n):
            se=s[i+1] if i +1<n else 0
            diff[i]=p[i]-se
        return diff
