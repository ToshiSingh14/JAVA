import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int c = sc.nextInt();
        int[] arr = new int[c];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < c; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Reversed array:");
        for (int i = c-1; i >= 0; i--) {
           System.out.println( arr[i] );
        }
        
    }
}
