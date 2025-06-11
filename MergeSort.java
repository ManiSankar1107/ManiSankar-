import java.util.*;
class MergeSort {
    public static void merge(int arr[], int l, int m, int r) {
        int a = m-l+1;
        int b= r-m;
        int L[]=new int[a];
        int R[]=new int[b];
        for (int i=0;i<a;i++){
            L[i]=arr[l+i];
        }
        for (int j=0;j<b;j++){
            R[j]=arr[m+1+j];
        }
        int i=0,j=0,k=l;
        while(i<a&&j<b) {
            if(L[i]<=R[j]) {
                arr[k]=L[i];
                i++;
            } else {
                arr[k]=R[j];
                j++;
            }
            k++;
        }
        while (i<a) {
            arr[k]=L[i];
            i++;
            k++;
        }
        while(j<b) {
            arr[k]=R[j];
            j++;
            k++;
        }
    }
    public static void sort(int arr[], int l, int r) {
        if (l < r) {
            int m =(l+ r)/2;
            sort(arr,l,m);
            sort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }
    public static void main(String[] args) {
        int arr[]={12, 23, 22, 9, 7, 18, 11};
        sort(arr,0, arr.length-1);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}