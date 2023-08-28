import java.util.Scanner;

public class InserctionSort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER ARRAY LENGTH");
        int a=s.nextInt();
        int arr[]=new int[a];
             for (int i = 0; i <arr.length ; i++) {
                arr[i]=s.nextInt();
             }

        
        for (int i = 1; i < arr.length; i++) {
            int min = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > min) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = min;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        s.close();
    }
    }

