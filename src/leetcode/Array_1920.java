package leetcode;

public class Array_1920 {

    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        //배열 nums의 길이만큼의 배열을 ans로 만든다

        for(int i = 0; i < nums.length; i++)
            ans[i] = nums[nums[i]];
        //for문을 이용해 문제에서 요청한 방식으로 각 ans[i]에 nums[nums[i]]의 값을 넣어준다
        return ans;
    }
}






