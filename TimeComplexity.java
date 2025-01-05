public class TimeComplexity {
    
    public static void main(String[] args) {
        
        //int nums[] = new int[1000];
        int nums[] = {1,2,3,15,15,17,18,23};
        int target = 23;

        int result = linearSearch(nums, target);
        int result2 = binarySearch(nums, target);
        int result3 = binarySearch(nums, target, 0, nums.length-1);

            if (result3 != -1) {
                System.out.println("Element found at iindex: " + result3);
            } else {
                System.out.println("Element not found");
            }
    }

    
   
    
    private static int linearSearch(int[] nums, int target) {
        int steps = 0;
        for(int i = 0; i < nums.length; i++){
            steps++;
            if (nums[i] == target) {
                System.out.println("Linear Steps taken: "+steps);
                return i;
            }
        }
        System.out.println("Linear Steps taken: "+steps);
        return -1;
    }
    //BINARY SEARCH
    private static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int steps = 0;

        while (left<=right) {
            steps++;
            int mid = (left + right)/2;

            if (nums[mid] == target) {
                    System.out.println("Binary Steps taken: "+steps);
                return mid;
            }
            else if (nums[mid]< target) {
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        System.out.println("Binary Steps taken: "+steps);
        return -1;
    }

     //BINARY SEARCH RECURSIVE       
     private static int binarySearch(int[] nums, int target, int left, int right) {
        if (left<=right) {
        
            int mid = (left + right)/2;

            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid]< target) {
                return binarySearch(nums, target, mid+1, right);
            }else {
                return binarySearch(nums, target, left, mid+1);
            }
        }
        return -1;
    }
}
