import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Potter {

    private final Map<Integer, Double> discountFor = new HashMap<Integer, Double>() {
        {
            put(5,0.25);
            put(4, 0.2);
            put(3, 0.1);
            put(2, 0.05);
            put(1, 0.0);
            put(0, 0.0);
        }
    };

    private final int bookPrice = 8;

    public Potter() {}

    public double price(int[] shoppingBasket) {
        double price = 0;

        if(shoppingBasket.length == 0) return price;

        while(shoppingBasket.length > 0){
            int[] unique = Arrays.stream(shoppingBasket).distinct().toArray();

            price += bookPrice * unique.length * (1 - discountFor.get(unique.length));

            shoppingBasket = removeItem(shoppingBasket,unique);
        }

        return price;
    }

    private int[] remove(int[] array, int index){
        int[] copy = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != index) {
                copy[j++] = array[i];
            }
        }
        return copy;
    }

    private int[] removeItem(int[] shoppingBasket, int[] unique){
        for (int k : unique) {
            for (int j = 0; j < shoppingBasket.length; j++) {
                if (shoppingBasket[j] == k) {
                    shoppingBasket = remove(shoppingBasket, j);
                    break;
                }
            }
        }
        return shoppingBasket;
    }

}