package MagicBox;

import java.util.Random;

public class MagicBox <T>{
    T[] items;

    public MagicBox (int size){
       items = (T[]) new Object[size];

    }

    public boolean add(T item){
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                System.out.println("add: true");
                return true;
            }
        }
        return false;
    }
    public T pick() throws Exception{
        int count = 0; //  счетчик пустых ячеек
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
             count++;
            }
        }
        if (count != 0) {
            throw new RuntimeException("Коробка не полна. Осталось заполнить " + count + " ячеек.");
        }
        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        return items[randomInt];
    }

}
