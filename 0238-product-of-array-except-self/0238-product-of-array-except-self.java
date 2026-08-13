import java.util.Arrays;
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int fromBegin=1,fromLast=1, n=nums.length;
        int[] res=new int[n];
        Arrays.fill(res,1);
        for(int i=0;i<n;i++){
            res[i]*=fromBegin;
            fromBegin*=nums[i];
        }

        for(int i=n-1;i>=0;i--){
            res[i]*=fromLast;
            fromLast*=nums[i];
        }

        return res;

        
    }
}