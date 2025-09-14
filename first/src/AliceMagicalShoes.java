import java.util.Scanner;

public class AliceMagicalShoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int N = sc.nextInt();
        int[] A = new int[N];
        int count=0;
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Number of house whose stairs Alice can climb:");
        for ( int i = 0; i < A.length; i++) {
            if (A[i] % 3 == 0) {
                count+=1;
            }
            else {
                continue;
            }
           
        }
         System.out.println(count);
        sc.close();
    }
}
