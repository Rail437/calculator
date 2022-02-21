import java.util.Scanner;

public class ArrayInspector {

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Добро пожаловать в Array Inspector.\nВведите длину массива\n");
        int count = scanner.nextInt();
        String[] words = new String[count];
        scanner.nextLine();
        for (int i = 0; i < count; i++) {
            System.out.println("Введите слово");
            String word = scanner.nextLine();
            words[i] = word;
        }
        int max = 0;
        String find = "";
        for (String word : words) {
            int buff = word.length();
            if (buff > max) {
                max = buff;
                find = word;
            }
        }
        System.out.println("Самое длинное слово в массиве: " + find);
        scanner.close();
    }
}
