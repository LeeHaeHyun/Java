import java.util.Arrays;

public class Mission01
{
    public static void main(String[] args)
    {
        int[] arr = { 1, 3, 6 };
        yourMission2(arr);
    }

    public static void yourMission2(int[] arr) {
       int[] temp = new int[arr.length];
       int LIMIT = (1 << arr.length);
       for (int com = 0, k = -1; com < LIMIT; com++, k = -1) {
           for (int d = 1;d < LIMIT ; d = d << 1) {
                temp[++k]= ((com & d) != 0) ? arr[k] : 0;
            }
           System.out.println(Arrays.toString(temp));
        }
    }
}