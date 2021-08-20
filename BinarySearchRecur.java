import java.util.*;

public class BinarySearchRecur{

    public static int binarySearchIter(int[] arr, int target, int start, int end) {

            int mid = (start + end) / 2;

            if (arr[mid]==target) return mid;
            else if (arr[mid]>target) {
                end = mid -1 ;
            } else{
                start = mid + 1;
            }
        return -1;
    }

    public static void main(String[] args){

        int[] arr = {-3, 0 , 1, 3, 7, 8, 9, 13 ,46 ,87 ,100000};
        int target = 0;
        int targetIndex = binarySearchIter(arr, target, 0, arr.length-1);
        System.out.println(targetIndex==-1 ? "값이 없습니다.": "값은 " + targetIndex +"번째에 위치합니다.");
        System.out.println(targetIndex);
    }
}