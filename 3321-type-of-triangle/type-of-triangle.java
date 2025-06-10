class Solution {
    public String triangleType(int[] nums) {
        String a="equilateral";
        String b="isosceles";
        String c="scalene";
        String d="none";
        if(!(nums[1] + nums[2]>nums[0] && nums[2] + nums[0]>nums[1] &&  nums[0] + nums[1]>nums[2]))
        return d;
        else if(nums[0]==nums[1] &&nums[1]==nums[2] && nums[2]==nums[0])
        {
           return a;
        }
        else if(nums[0]==nums[1] || nums[1]==nums[2] ||  nums[0]==nums[2])
        {
           return b;
        }
    //    else if( nums[1] + nums[2]>nums[0] && nums[2] + nums[0]>nums[1])
    //    {
    //     return c;
    //    }
    //    else
       return c;
    }
}