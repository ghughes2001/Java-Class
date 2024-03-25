public class TestMain {
    public static void main(String[] agrs)
    {
        int a = 2;
        int b = 3;

        ObjMethodEx objOne = new ObjMethodEx(a, b);
        PastToClass objTwo = new PastToClass();

        objTwo.methodOne(objOne);
    }
}
