import java.util.Random;

public class IntegerFinder {

    public void start(){
        int[] arr = new int[20];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 10 - random.nextInt(20);
        }
        printArray(arr);
        int maxMin = 0;
        int box1 = 0;
        int box2 = 0;
        int min = 11;
        for (int i = 0; i < arr.length; i++) {
            int buff = arr[i];
            if(buff >= 0 && buff < min){
                min = buff;
                box1 = i;
            }
            if(buff < 0 && buff < maxMin){
                maxMin = buff;
                box2 = i;
            }
        }
        System.out.println("Максимальное отрицательное число: " + maxMin);
        System.out.println("Минимальное положительное число: " + min);
        swapInt(arr, box1, box2);
        printArray(arr);
    }

    private void printArray(int[] arr) {
        System.out.print("Массив {");
        for (int j : arr) {
            System.out.print(j + ",");
        }
        System.out.println("}");
    }
    private void swapInt(int[] arr, int a, int b){
        int buff = arr[a];
        arr[a] = arr[b];
        arr[b] = buff;
    }
}
