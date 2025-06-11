import java.util.*;
class BinarySearch {
    public static void main(String[] args) {
        int[] arr={9,3,5,1,7,2,8,4,10};
        Arrays.sort(arr);
        int target=1;
        int left=0;
        int right=arr.length-1;
        while (left<=right) {
            int mid=left+right/2;
            if (arr[mid]==target)
            {
                System.out.println("Target found at index: " + mid);
            } else if (arr[mid]<target){
                left=mid+1;
            } else {
                right=mid-1;
            }
        }
        System.out.println("Target not found");
    }
}
