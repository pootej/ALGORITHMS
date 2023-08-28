import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER ARRAY SIZE");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("ENTER ARRAY ELEMENTS");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        
        Arrays.sort(arr);
        System.out.println("ENTER ELEMENT TO BE SEARCHED");
        int search = s.nextInt();
        
        int left = 0;
        int right = arr.length - 1;
        int foundIndex = -1; 
        
        while (left <= right) {
            int mid = (left + right) / 2;
            
            if (arr[mid] == search) {
                foundIndex = mid;
                break;
            } else if (search > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        if (foundIndex != -1) {
            System.out.println("Element found at index " + foundIndex);
        } else {
            System.out.println("Element not found");
        }
        s.close();
    }
}
