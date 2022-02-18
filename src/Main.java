import java.util.Scanner;

/**
 * Главный класс
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Для выбора калькулятора введите: 1 , для выбора string array введите: 2");
        int num = scanner.nextInt();
        if(num == 1){
            Calculator calculator = new Calculator();
            calculator.start();
        }
        if(num == 2){
            ArrayInspector arrayInspector = new ArrayInspector();
            arrayInspector.start();
        }else {
            System.out.println("Вы ничего не выбрали. Завершение работы.");
        }
    }
}
