public class Main {
    public static void main(String[] args){
        int[] nums = {3,3};
        int target = 6;

        int[] result = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=1; j<=nums.length-1; j++){
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        System.out.println(result[0] + " / " + result[1]);
    }
}
