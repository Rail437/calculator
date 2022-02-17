/**
 * Класс с логикой математических операций
 */
public class Addition {

    /**
     * Метод сложения чисел
     * @param val1
     * @param val2
     * @return
     */
    public Double plus( Double val1, Double val2){
        return val1 + val2;
    }

    /**
     * Метод вычитания второго числа из первого
     * @param val1
     * @param val2
     * @return
     */
    public Double minus( Double val1, Double val2){
        return val1 - val2;
    }

    /**
     * Метод умножения двух чисел
     * @param val1
     * @param val2
     * @return
     */
    public Double multiply( Double val1, Double val2){
        return val1 * val2;
    }

    /**
     * Метод деления первого числа на второе
     * @param val1
     * @param val2
     * @return
     */
    public Double div( Double val1, Double val2){
        if (val2 == 0) {
            System.err.println("На 0 делить нельзя!");
            //throw new IllegalArgumentException();
            return null;
        }
        return val1 / val2;
    }


}
