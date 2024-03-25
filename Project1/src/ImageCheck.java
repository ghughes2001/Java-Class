public class ImageCheck {
    private int l;
    private int w;
    private int h;
    private int n;

    ImageCheck(int length, int width, int height, int numOfImages)
    {
        this.l = length;
        this.w = width;
        this.h = height;
        this.n = numOfImages;
    }

    void checking()
    {
        if ((w < l) || (h < l))
        {
            System.out.println("UPLOAD ANOTHER");
        }
        else if (w == l && h == l)
        {
            System.out.println("ACCEPTED");
        }
        else if (w > l || h > l)
        {
            System.out.println("CROP IT");
        }
    }
}
