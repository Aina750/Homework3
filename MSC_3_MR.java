public class MSC_3_MR {
    public static void main(String[] args) {
        int [] mas = new  int[10];
        for (int i =0; i < mas.length; i++ ){
            mas[i] = (int) (Math.random()*9+1);
            System.out.println(mas[i]+"");
        }
        for (int i = 0; i < mas.length; i++) {
            if(i%2 == 1) mas[i] = 0;
            System.out.println(mas[i]+"");

        }
    }
}
