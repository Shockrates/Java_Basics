public class InsertionSort {
    
    public static void main(String[] args) {
        int arr[] = {6,5,3,8,2,9,4};
        int size = arr.length;

        System.out.println("Before Sorting");
        for(int num: arr){
            System.out.print(num+" ");
        }

        for (int i = 1; i < arr.length; i++) {
            
            int key = arr[i];
            int j = i-1;

            while (j>=0 && arr[j] > key) {
                arr[j+1] =arr[j];
                j--;
            }
            arr[j+1]=key;
        }

        System.out.println("After Sorting");
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}
