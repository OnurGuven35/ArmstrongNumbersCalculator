import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        System.out.print("Lutfen Istediginiz Sayiyi Giriniz : ");
        a = input.nextInt();
        int b = 0;
        int c = a;
        int d;
        int e;
        int total = 0;

        while (c != 0) {
            c /= 10;
            b++;
        }

        c = a;

        while (c != 0) {
            d = c % 10;
            e = 1;
            for (int i = 1; i <= b; i++) {
                e *= d;
            }
            total += e;
            c /= 10;
        }

        if (total == a) {
            System.out.print(a + " " + "Sayisi Bir Armstrong Sayisidir ! ");
        } else {
            System.out.print(a + " " + "Sayisi Bir Armstrong Sayisi Degildir ! ");
        }
    }
}
