public class MergeSort {

    public static void main(String[] args) {
        
        int arr[] = {6,5,3,8,2,9,4,11,236,1568,17,22,1};
        int size = arr.length;

        System.out.println("Before Sorting");
        for(int num: arr){
            System.out.print(num+" ");
        }

        mergeSort(arr, 0, arr.length-1);
        
        System.out.println();
        System.out.println("After Sorting");
        for(int num: arr){
            System.out.print(num+" ");
        }

        
    }

    private static void mergeSort(int[] arr, int left, int right) {
        
        if (left<right) {
            
            int mid = (left+right)/2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);

            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        
        int lArrLength = mid-left+1;
        int rArrLength = right-mid;

        int lArr[] = new int[lArrLength];
        int rArr[] = new int[rArrLength];

        for (int x = 0; x < lArrLength; x++) {
            lArr[x] = arr[left+x];
        }
        for (int x = 0; x < rArrLength; x++) {
            rArr[x] = arr[mid+1+x];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i<lArrLength && j<rArrLength) {
            if (lArr[i] <= rArr[j]) {
                arr[k] = lArr[i];
                i++;
            } else {
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }
        while (i<lArrLength) {
            arr[k]=lArr[i];
            i++;
            k++;
        }
        while (j<rArrLength) {
            arr[k]=rArr[j];
            j++;
            k++;
        }


    }
}
