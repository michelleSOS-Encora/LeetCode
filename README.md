# Week3_Leetcode
Solo work for week 3: SPARK TOGETHER
2475. Number of Unequal Triplets in Array 

 

OVERVIEW 

Given an array named ‘nums’, the valid triplets must be found, being the valid conditions that the index must be smaller than the second (this item is the only one that can be zero), and the second must be smaller than the third(but the third must be smaller than the nums’ array length), and every number in the array must be different.  

CONTEXT  

This problem was solved in Java, python and typescript languages.  

SOLUTION  

The implemented solution used nested loops, a counter and an if condition to increment the counter.  

Even though it's a brute force approach, I ended up using it. All possible triplets were iterate don by using three nested loops, the ‘i’ one, would go from 0 to n-3(n being the length of the array), the ‘j’ one, which would start from i+1(meaning it would always check and make sure j was greater than ‘i’, to  n-2, and the ‘k’ one, which would go from j+1 to n-1, making it possible for the iterators conditions, being i equal and smaller than j, j being smaller than k and k being smaller than the string length(for this was important to go on each i iteration from 1 to 3 less positions than ‘n’ in the nested cycle). Then, in the ‘k’ for, check if nums[i], nums[j] and nums[k] were different using an if condition, in which, if it was valid, would return the counter of the symbols, being 3 the standard output. This solution has an O(n^3) complexity, which is not very efficient as the string size goes up. 

ALTERNATIVE SOLUTIONS 

I had one different approach for this problem aside from the one I ended up using, the idea was to iterate through each unique element in the array and track its frequency, then calculating the number of valid triplets using combinations based on element frequency distributions, using two loops: in the first one, the middle element is picked and the second checks all the elements before and after the middle one. For each possible element that is in the middle, two sets are used to track the values. Then all the unique elements would be calculated before and after the middle, some sort of monticule approach solution, which was not applied because the programmer didn't get it right and never compiled for an unknown reason. 

 

2670. Find the Distinct Difference Array 

 

OVERVIEW 

This problem is to make a transformation of an input array ‘nums’ into a distinct difference array, which is defined by comparing the number of distinct elements in two subarrays at each index.  

CONTEXT  

This problem was solved in Java, python and typescript languages, and is essentially about dividing an array at each point i into two parts: a prefix and a suffix, comparing how many single items exist on each horizon of the array. Basically, an array is transformed in a way that shows at every position how the prefix compares with the suffix, being the criteria of them being different elements.  

SOLUTION (YOUR APPROACH)  

The array was iterated three times, each for a different purpose: the first one was to pass through it from left to right and keeping track of distinct elements in the prefix(and saving them in a set), then pass through the array from right to left to keep in track the suffix elements(and saving them in a suffix set), finally, combining the results from each index by subtracting the suffix count from the prefix count. 

This approach has an O(n) complexity since recalculation of multiple elements was avoided for overlapping subarrays(sets). 

ALTERNATIVE SOLUTIONS 

I considered using a loop to calculate each and every term on its own(one for both suffix and prefix), using a partition of the array in python(something like nums[0:i] or storing this values in java in another array, and count distinct elements using another set, but it'd be a really slow and the complexity, though was not calculated for this code, i decided very early would be very tricky, i can still figure would be an exponential one.  

 
