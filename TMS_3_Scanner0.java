
    import java.util.Arrays;
    import java.util.Scanner;
    public class TMS_3_Scanner0 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myArray = {1, 4, 7, 11, 75};
        int index = Arrays.binarySearch(myArray, 7);
        System.out.println(index);
    }

}
