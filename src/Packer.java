import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Packer {
    public void start(){
        Candy Mamba = new Candy(21.5F,18,"Mamba");
        Jellybean GreenJelly = new Jellybean(30.5F,19,"Green");
        Jellybean RedJelly = new Jellybean(30.5F,19,"Red");
        Chocolate Milka = new Chocolate(59,85, "Milka");
        Chocolate AlpenGold = new Chocolate(49,80, "AlpenGold");
        Present[] present = new Present[]{Mamba, GreenJelly, RedJelly, Milka, AlpenGold};
        Present[] presentBox = makeGift(present, 5);
        System.out.println("Вес подарка: " + getPresentWeight(presentBox) + " г. Цена: " + getPresentPrice(presentBox));
        showContent(presentBox);
    }


    /**
     * Метод принимает массив сладостей и создает подарок.
     * @param present массив сладостей.
     * @param count количество сладостей в конечном подарке.
     * @return подарочную коробку с рандомным набором.
     */
    private Present[] makeGift(Present[] present , int count){
        Random random = new Random();
        Present[] presents = new Present[count];
        for (int i = 0; i < count; i++) {
            presents[i] = present[random.nextInt(present.length-1)];
        }
        return presents;
    }

    /**
     * Возвращает вес массива со сладостями.
     * @param arr Массив со сладостями
     * @return вес.
     */
    private float getPresentWeight(Present[] arr){
        float result = 0;
        for (Present present : arr) {
            result += present.getWeight();
        }
        return result;
    }

    /**
     * Возвращает цену массива со сладостями.
     * @param arr Массив со сладостями
     * @return общая цена.
     */
    private float getPresentPrice(Present[] arr){
        float result = 0;
        for (Present present : arr) {
            result += present.getPrice();
        }
        return result;
    }

    /**
     * Показывает что в себе содержит массив со сладостями.
     * @param arr Массив со сладостями
     */
    private void showContent(Present[] arr){
        Map<Present, Integer> presentMap = new HashMap<>();
        for (Present present : arr) {
            if (!presentMap.containsKey(present)) {
                presentMap.put(present, 1);
            } else {
                presentMap.replace(present, presentMap.get(present) + 1);
            }
        }
        System.out.println("Содержит в себе: ");
        for (Map.Entry<Present, Integer> entry : presentMap.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue() + "шт.");
        }
    }
}
