package JavaProgram.Searching;

public class CountOfPivot {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        System.out.println(countRotations(arr));
    }
    private static int countRotations(int[]arr){
       int pivot = findingPivot(arr);
       if (pivot == -1) {
        return 0;
       }
       return pivot+1;
    }
     static int findingPivot(int[]arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end) {
            int mid = start + (end - start)/2;
            if (mid<end && arr[mid]>arr[mid+1]) {
                return mid;
            }
             if (mid>start && arr[mid]<arr[mid-1]) {
                return mid-1;
            } 
            if (arr[start]>=arr[mid]) {
                end = mid-1;
            }else{
                start = mid +1;
            }

        }
        return-1;
    }
    static int findPivotWithDuplicates(int[]arr){
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start + (end - start)/2;

            // 4 cases 

            if (mid<end && arr[mid] > arr[mid+1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]) {
                return mid-1;
            } 
            if (arr[mid]==arr[start] && arr[mid] == arr[end]) {
                //skip the duplicates 
                // note: what if these elememts are at start and end were the pivot??
                //check if start is pivot
                if (arr[start] > arr[start+1]) {
                    return start;
                } 
                start++;
                 
                // check whether end is positive
                if (arr[end] < arr[end-1]) {
                    return end -1;
                }
                end--;
            }

            // left side is sorted so pivot is in right 
            else if (arr[start] < arr[mid ] || (arr[start] == arr[mid] && arr[mid] > arr[end] )) {
                start = mid + 1;
            } else {
                end = mid -1 ;
            }
        }
        return -1;
    } 
}
