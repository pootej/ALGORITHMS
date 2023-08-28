import java.util.Scanner;

class BubbleSort{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER ARRAY LENGTH");
        int a=s.nextInt();
        int arr[]=new int[a];
        System.out.println("ENTER ARRAY ELEMENTS");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {

            System.out.print(" "+arr[i]);
        }
        s.close();
    }
}