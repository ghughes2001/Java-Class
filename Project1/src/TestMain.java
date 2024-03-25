import java.util.*;

public class TestMain {
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int length = reader.nextInt();
        int numOfImgs = reader.nextInt();

        for (int i = 0; i < numOfImgs; i++)
        {
            int width = reader.nextInt();
            int height = reader.nextInt();

            ImageCheck img = new ImageCheck(length, width, height, numOfImgs);
            img.checking();
        }
    }
}
