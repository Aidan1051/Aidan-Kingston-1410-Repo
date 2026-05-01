package week17examples;

public class TestPrep {
    public static void main(String[] args) {
        char data1 = 65;
        System.out.println(data1);

        long data2 = 65;
        System.out.println(data2);

        float data3 = new Float("-65");
        System.out.println(data3);

        short data4 = new Short("65.0");
        System.out.println(data4);

        q3();

    }

    public static void q3() {
        int[][] a = {{9,15}, {18, 20, 40}};
        for (int i = 2; i>= 0; i--) {
            for (int j = 2; j>=0; j--) {
                System.out.print(a[i][j] + " ");
            }
        }
    }
}
