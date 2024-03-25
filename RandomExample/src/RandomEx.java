import java.util.*;
public class RandomEx {
    void someRandoms()
    {
        Random robj = new Random();

        for (int i = 0; i < 10; i++)
        {
            System.out.println(robj.nextInt(1000) + " ");
        }
    }
}
