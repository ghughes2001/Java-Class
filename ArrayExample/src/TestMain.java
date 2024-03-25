import java.util.*;

public class TestMain {
    public static void main(String[] args)
    {
        ArrayEx obj = new ArrayEx();
        int[] d = new int[4];
        Scanner scoobj = new Scanner(System.in);

        for (int n = 0; n < 4; n++)
        {
            d[n] = scoobj.nextInt();
            System.out.println(d[n]);
        }
        for (int i: d)
        {
            System.out.println(d[i]);
        }
        obj.methodOne(d);
    }
}
