import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER ARRAY SIZE");
        int a=s.nextInt();
        int arr[]=new int[a];
        System.out.println("ENTER ARRAY ELEMETS");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }

    for(int i=0;i<arr.length;i++){
        int min=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[min]){
                min=j;
            }

        }

        int temp=arr[min];
        arr[min]=arr[i];
        arr[i]=temp;
    }
    s.nextLine();
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
    s.close();
    }
    
}
