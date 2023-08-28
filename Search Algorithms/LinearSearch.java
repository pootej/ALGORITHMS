import java.util.Scanner;

class LinearSearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER ARRAY SIZE");
        int a = s.nextInt();
        int count = 0;
        int arr[] = new int[a];
        System.out.println("ENTER ARRAY ELEMENTS");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("ENTER ELEMENT YOU WANT TO SEARCH");
        int search = s.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (search == arr[i]) {
                count++;
                System.out.println("ELEMENT PRESENT IN " + i + " INDEX POSITION");
                break; 
            }
        }

        if (count == 0) {
            System.out.println("NOT FOUND");
        }

        s.close();
    }
}
