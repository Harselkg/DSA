class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int i=0;
        int size=0;
        for(int j=0;j<n;j++){
            if(nums[j]==0){
                if(size<i){
                    size=i;
                }
                i=0;
                continue;
            }
            i=i+1;
        }
        if(size<i){
            size=i;
        }
        return size;
        
    }
    public static void main(String[] args) {
        MaxConsecutiveOnes obj=new MaxConsecutiveOnes();
        int []arr={1,1,1,0,0,0,1,}
        
    }
}