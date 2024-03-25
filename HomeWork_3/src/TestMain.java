import java.util.*;

public class TestMain {
    public static void main(String[] args)
    {
        int[] arr = new int[8];
        Scanner scan = new Scanner(System.in);
        int number;

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("Enter an integer for the array: ");
            number = scan.nextInt();

            arr[i] = number;
        }
        AlternateNums obj = new AlternateNums();
        obj.isAlternateFour(arr);
    }
}
