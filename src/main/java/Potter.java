import java.util.*;

public class Potter {

    public int book_price = 8;

    public Map<Integer, Double> discountFor = Map.of(
            5, 0.25,
            4, 0.2,
            3, 0.1,
            2, 0.05,
            1, 0.0
    );



    public double price(List<Integer> books){
        double price = 0;

        for (int i = 0; i < books.size(); i++) {
            Set<Integer> uniqueBooks = new HashSet<>(books);

            price += book_price * uniqueBooks.size() * (1 - discountFor.get(uniqueBooks.size()));
            /*
            for(Object item: uniqueBooks){
                books.remove(books.indexOf(item));
            }*/

            uniqueBooks.forEach(item -> books.remove(books.indexOf(item)));
        }
        return price;
    }

    
}
