import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PotterTest {

    Potter potter = new Potter();


    @Test
    void noBooksShouldCostZero(){
        List<Integer> books = List.of();
        assertEquals(potter.price(books), 0);
    }


    //when only identical books
    @Test
    void oneBookShouldCost8(){
        List<Integer> books = List.of(1);
        assertEquals(potter.price(books), 8);

        List<Integer> books2 = List.of(2);
        assertEquals(potter.price(books2), 8);

        List<Integer> books3 = List.of(3);
        assertEquals(potter.price(books3), 8);

        List<Integer> books4 = List.of(4);
        assertEquals(potter.price(books4), 8);

        List<Integer> books5 = List.of(5);
        assertEquals(potter.price(books5), 8);
    }

    @Test
    void twoBooksShouldCost16(){
        List<Integer> books = List.of(1, 1);
        assertEquals(potter.price(books), 16);
    }

    @Test
    void oneCollectionWithNoMoreBooks(){
        List<Integer> books = List.of(1, 2);
        assertEquals(potter.price(books), 15.2);

        List<Integer> books2 = List.of(1, 2, 3);
        assertEquals(potter.price(books2), 21.6);

        List<Integer> books3 = List.of(1, 2, 3, 4);
        assertEquals(potter.price(books3), 25.6);

        List<Integer> books4 = List.of(1, 2, 3, 4, 5);
        assertEquals(potter.price(books4), 30);
    }

    @Test
    void whenBuyingMultipleCollections(){
        //buying a 3-books collection + a 2-books collection should cost 36.8e
        List<Integer> books1 = List.of(1, 2, 3, 1, 2);
        assertEquals(potter.price(books1), 21.6 + 15.2);



        //buying one collection of each (2, 3, 4, 5) + one identical
        List<Integer> books2 = List.of(
                1, 2, 3, 4, 5,
                1, 2, 3, 4,
                1, 2, 3,
                1, 2,
                1
        );
        assertEquals(potter.price(books2), 30 + 25.6 + 21.6 + 15.2 + 8);

        //prefers 2 4-books collections over a 5-books one + a 3-books one
        List<Integer> books3 = List.of(
                1, 2, 3, 4,
                2, 3, 4, 5
        );
        assertEquals(potter.price(books3), 25.6 * 2);

    }




}
