// https://leetcode.com/problems/trapping-rain-water //


class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int prefixarr [] = new int[n];// prefix arr
        int suffixarr [] = new int[n];//suffix arr

        int result= 0;
// get the prefix arr 
        prefixarr[0] = height[0];
        for(int i=1;i<n;i++){
            prefixarr [i] = Math.max(prefixarr [i-1],height[i]);// find the max of current index element of height and previous index element of prefix arr
        }
// get the suffix arr
        suffixarr[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            suffixarr[i]=Math.max(suffixarr[i+1],height[i]);// find the max of current index element of height and  next index element of suffix arr
        }

        for(int i=1;i<n-1;i++){
            int ans = Math.min(prefixarr[i-1],suffixarr[i+1]); // store the min value of suffix and prefix arr
            if(ans >height[i]){
            result += ans-height[i];// sum all the value
            }
        }

        return result;
    }
}
