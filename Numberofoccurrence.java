/*
Number of occurrence : GFG problem

Given a sorted array, arr[] and a number target, you need to find the number of occurrences of target in arr[]. 

Examples :

Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 2
Output: 4
Explanation: target = 2 occurs 4 times in the given array so the output is 4.
Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 4
Output: 0
Explanation: target = 4 is not present in the given array so the output is 0.
Input: arr[] = [8, 9, 10, 12, 12, 12], target = 12
Output: 3
Explanation: target = 12 occurs 3 times in the given array so the output is 3.
*/

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.countFreq(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends

// main code starts 

class Solution {
    int countFreq(int[] nums, int target) {
        // code here
        int ans[] = new int[]{-1,-1};
        ans[0] = findFirst(nums,target);
       ans[1] = findLast(nums,target);
       if(ans[0]==-1){
           return 0;
       }
       return ans[1]-ans[0]+1;
    }
    
    private int findFirst(int[] nums,int target ){
        int low=0;
        int high=nums.length-1;
         
          while(low<=high){
            int mid=(low+high)/2;
            
            if(nums[mid]==target){
                high = mid-1 ;
                
            }
            else if(nums[mid]<target){
                    low=mid+1;
                }
                else {
                    high=mid-1;
                }
            }
             if (low < nums.length && nums[low] == target) {
            return low;
        }
        return -1;
    }
    
    private int findLast(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        
         while (low <= high) {
             int mid=(low+high)/2;
            if (nums[mid] == target) {
                low = mid + 1; 
                
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (high >= 0 && nums[high] == target) {
            return high;
        }
        return -1;
    }
}
