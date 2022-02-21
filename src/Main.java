import java.util.Arrays;
import java.util.Random;

/**
 * Главный класс
 */
public class Main {
    public static void main(String[] args) {
        IntegerFinder integerFinder = new IntegerFinder();
        integerFinder.start();

        Packer packer = new Packer();
        packer.start();
    }


}
