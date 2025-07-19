public class bubble_sort {
    public static void main(String[] args){
        int nums[] = {6,5,3,2,5,6,7,5,3,2};
        int size = nums.length;
        int temp = 0;

        for(int i = 0; i < size-1; i++){
            for(int j = 0; j < size-1; j++){
                if (nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        for(int num: nums){
            System.out.println(num);
        }
    }
}
