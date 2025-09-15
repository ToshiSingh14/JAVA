import java.util.Scanner;

public class EvenNumbersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int c = sc.nextInt();
        int[] arr = new int[c];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < c; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Even numbers in the array:");
        for ( int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}

