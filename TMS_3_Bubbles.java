import java.util.Arrays;

public class TMS_3_Bubbles {
    public static void main(String[] args) {
        int[] Array = {9, 23, 6, 32, 98};

        System.out.println("Before");
        System.out.println(Arrays.toString(Array));

        for (int i = Array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (Array[j] > Array[j + 1]) {
                    int tmp = Array[j];
                    Array[j] = Array[j + 1];
                    Array[j + 1] = tmp;

                }
            }
        }
        System.out.println("After");
        System.out.println(Arrays.toString(Array));
    }
}
