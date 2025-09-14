
    import java.util.Scanner;
public class CheckTemperature{
    public static void main(String[] args){
        Scanner temp = new Scanner(System.in);
        System.out.println("Enter tempertaure in Celcius: ");
        int c = temp.nextInt();

        if(c>0)
            System.out.println("Safe For Outdoor Activity");
        else
            System.out.println("Too cold for outdoor activity");

    }
}

