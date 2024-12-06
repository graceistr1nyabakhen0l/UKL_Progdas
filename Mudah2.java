import java.util.Scanner;

public class Mudah2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan sebuah bilangan: ");
        int angka = input.nextInt();

        if (angka <= 1) {
            System.out.println(angka + " bukan bilangan prima.");
        } else if (isPrima(angka)) {
            System.out.println(angka + " adalah bilangan prima.");
        } else {
            System.out.println(angka + " bukan bilangan prima.");
        }

        input.close();
    }

        public static boolean isPrima(int angka) {
            for (int i = 2; i < angka; i++) {
                if (angka % i == 0) {
                    return false;
                }
        }
        return true;
    }
}