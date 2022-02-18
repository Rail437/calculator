import java.util.Scanner;

public class Calculator {

    public void start(){
        Addition ad = new Addition();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Добро пожаловать в калькулятор.");
        while (true) {
            System.out.println("Введите первое число.");
            Double first = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Теперь введите оператор: + сложение, - вычитание, * умножение, / деление");
            String operator = scanner.nextLine();
            if ("exit".equalsIgnoreCase(operator)){
                scanner.close();
                return;
            }
            System.out.println("Теперь введите второе число.");
            Double two = scanner.nextDouble();
            if ("+".equals(operator)) {
                System.out.printf("Ответ: %.4f\n", ad.plus(first, two));
            }
            if ("-".equals(operator)) {
                System.out.printf("Ответ: %.4f\n", ad.minus(first, two));
            }
            if ("*".equals(operator)) {
                System.out.printf("Ответ: %.4f\n", ad.multiply(first, two));
            }
            if ("/".equals(operator)) {
                System.out.printf("Ответ: %.4f\n", ad.div(first, two));
            }
            System.out.println("Для выхода из калькулятора вместо оператора введите: exit");
        }
    }
}
