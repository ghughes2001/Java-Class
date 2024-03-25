package P2;

public class C3 {
    void aMethod() {
        P1.C1 c1 = new P1.C1();
        // can access c1.x;
        // can access c1.y;
        // cannot access o.z;
        // can invike c1.m1();
        // can invoke c1.m2();
        // cannot invoke c1.m3();
    }
}
