package firstcode;

public class main {
    public static void main(String[] args) {
        int n = 5;
        int[] foo = {0, 1, 2, 3, 4};

        int m = 100;
        int[] notBar;
        notBar = new int[m];
        for (int i = 0; i < m; i++) {
            notBar[i] = i;
        }
        int fooCount = countEvenNum(foo);
        int barCount = countEvenNum(notBar);
        System.out.println("The total number of even numbers in foo are:" );
        System.out.println(fooCount);
        System.out.println("The total number of even numbers in notBar are:" );
        System.out.println(barCount);
    }

    public static int countEvenNum(int[] a){
        int count = 0;
        for (int j : a) {
            if (j % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
