class Solution {
    public int maxArea(int[] height) {
        int maxarea=0, size = height.length, temparea;
        int left=0; int right=size-1;

        while(left < right){
            temparea = (right-left) * Math.min(height[right],height[left]);
            maxarea = Math.max(maxarea, temparea);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxarea;
    }
}
