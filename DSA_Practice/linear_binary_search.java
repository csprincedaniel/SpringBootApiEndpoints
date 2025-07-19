public class linear_binary_search {
    public static void main(String[] args) {
        int nums[] = new int[100000];
        int target = 500;

        int result = binarySearch(nums, target);
        int result2 = linearSearch(nums, target);

        if(result != -1)
            System.out.println("Element found at index: "+result);
        else
            System.out.println("Element not found");        
    }


    public static int linearSearch(int[] nums, int target){
        int steps = 0;
        for(int i=0; i < nums.length; i++){
            steps++;
            if (nums[i] == target){
                System.out.println("Steps taken by linear: "+steps);
                return i;
            }

        }
        System.out.println("Steps taken by linear: "+steps);

        return -1;
    }

    public static int binarySearch(int[] nums, int target){
        int left = 0;
        int right = nums.length -1;
        int steps = 0;

        while (left <= right){
            steps++;
            int mid = (left + right)/2;

            if(nums[mid] == target) {
                System.out.println("Steps taken by Binary:"+steps);
                return mid;
            }

            else if (nums[mid] < target){
                left = mid+1;
            }

            else {
                right = mid - 1;
            }
        }

        System.out.println("Steps taken by Binary:"+steps);
        return -1;
    }
}
