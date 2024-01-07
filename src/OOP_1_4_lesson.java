import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class OOP_1_4_lesson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        var ppb = Arrays.stream(new Person[3]).map(p -> {
            p = new Person(sc.nextInt(),sc.next(),sc.nextDouble());
            return p.getInfo();
        });

        System.out.println(String.join("\n", ppb.toList()));
        System.out.println();
    }
}
