import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> something = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите строку для списка A: ");
            something.add(scanner.nextLine());
        }

        System.out.println("Список A: " + something);

        ArrayList<String> something2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите строку для списка B: ");
            something2.add(scanner.nextLine());
        }

        ArrayList<String> something3 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            something3.add(something.get(i));
            something3.add(something2.get(4 - i));
        }

        System.out.println("Список C: " + something3);

        Collections.sort(something3, (s1, s2) -> s1.length() - s2.length());

        System.out.println("Список C: " + something3);
    }
}
