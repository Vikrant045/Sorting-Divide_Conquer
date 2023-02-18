public class CountOfSameElements{
    public static int name(int nums[]) {
        int a = nums.length/2;

        for(int i=0;i<nums.length;i++){

            int count =0;
            for(int j=0;j<nums.length;j++){

                if(nums[i]==nums[j]){
count++;
                }
            }
            if(count>a){
                return nums[i];
            }
        }  
        return -1;
    }
    public static void main(String args[]){

      
        int  nums[] = {3,2,3};
        System.out.println(name(nums));

       


    }

}