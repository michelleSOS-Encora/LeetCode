class Solution(object):
    def unequalTriplets(self, nums):
        n=len(nums)
        c=0
        #Checks all triplets
        for i in range(n):
            for j in range(i+1, n):
                for k in range (j+1, n ):
                    if nums[i]!=nums[j] and nums[i]!=nums[k]and nums[j]!=nums[k]: #cheack each nomber in the array and thenumber of occurrences on each to avoid repetition
                        c+=1 #only adds one if the number in the array has not yet been passed and counted
        return c
