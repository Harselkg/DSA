class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int num=0;
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                if(i!=0){
                    num=num+(i*(i+1)/2);
                    i=0;
                }
                
            }
            else{
                i=i+1;
            }
            
        }
        if(i!=0){
                num=num+(i*(i+1)/2);
            }
        return num;
    }
}