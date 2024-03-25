import java.util.*;

public class TestMain {
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = scan.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter values for array: ");
        for (int i = 0; i < size; i++)
        {
            arr[i] = scan.nextInt();
        }
        Zeropocalypse zeropo1 = new Zeropocalypse(arr);
        int numberOfSolutions = zeropo1.Zeropocalypse_ways();

        System.out.println("Solutuion: " + numberOfSolutions);
    }
}

