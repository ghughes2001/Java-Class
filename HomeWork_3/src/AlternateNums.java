public class AlternateNums {
    void isAlternateFour(int[] arr)
    {
        boolean pattern = false;
        int count = 0;
        int start = 0;
        int end = arr.length;

        try {
            while (start < end) {
                if (arr[start] == arr[start + 2]) {
                    count++;
                    pattern = true;
                } else {
                    pattern = false;
                }
                if (count == 4) {
                    break;
                }
                start++;
            }
            System.out.println(pattern);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(pattern);
        }
    }
}
