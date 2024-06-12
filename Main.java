import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();
        ArrayList<String> listC = new ArrayList<>();

        System.out.println("Введите слова для списка listA: ");
        for (int i = 0; i < 5; i++) {
            listA.add(scanner.next());
        }

        System.out.println("\nВведите слова для списка listB: ");
        for (int i = 0; i < 5; i++) {
            listB.add(scanner.next());
        }

        System.out.println("\nСписок listA: ");
        for (String str : listA) {
            System.out.println(str);
        }
        System.out.println("\nСписок listB: ");
        for (String str : listB) {
            System.out.println(str);
        }


        int size = Math.max(listA.size(), listB.size());
        for (int i = 0; i < size; i++) {
            if (i < listA.size())
                listC.add(listA.get(i));
            if (size - 1 - i < listB.size())
                listC.add(listB.get(size - 1 - i));
        }
        System.out.println("\nСписок listC: " + listC);
        System.out.println();

        listC.sort(Comparator.comparingInt(String::length));
        System.out.println("Отсортированный список: " + listC);

    }
}