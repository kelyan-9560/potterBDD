import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class PotterTest {

    Potter potter = new Potter();


    @Test
    void noBooksShouldCostZero(){
        int[] books = {};
        assertEquals(potter.price(books), 0);
    }


    //when only identical books
    @Test
    void oneBookShouldCost8(){
        int[] books = {1};
        assertEquals(potter.price(books), 8);

        int[] books2 = {2};
        assertEquals(potter.price(books2), 8);

        int[] books3 = {3};
        assertEquals(potter.price(books3), 8);

        int[] books4 = {4};
        assertEquals(potter.price(books4), 8);

        int[] books5 = {5};
        assertEquals(potter.price(books5), 8);
    }

    @Test
    void twoBooksShouldCost16(){
        int[] books = {1, 1};
        assertEquals(potter.price(books), 16);
    }

    @Test
    void oneCollectionWithNoMoreBooks(){
        int[] books = {1, 2};
        assertEquals(potter.price(books), 15.2);

        int[] books2 = {1, 2, 3};
        assertEquals(potter.price(books2), 21.6);

        int[] books3 = {1, 2, 3, 4};
        assertEquals(potter.price(books3), 25.6);

        int[] books4 = {1, 2, 3, 4, 5};
        assertEquals(potter.price(books4), 30);
    }

    @Test
    void whenBuyingMultipleCollections(){
        //buying a 3-books collection + a 2-books collection should cost 36.8e
        int[] books1 = {1, 2, 3, 1, 2};
        assertEquals(potter.price(books1), 21.6 + 15.2);


        //buying one collection of each (2, 3, 4, 5) + one identical
        int[] books2 = {
                1, 2, 3, 4, 5,
                1, 2, 3, 4,
                1, 2, 3,
                1, 2,
                1
        };
        assertEquals(potter.price(books2), 30 + 25.6 + 21.6 + 15.2 + 8);

        //prefers 2 4-books collections over a 5-books one + a 3-books one
        int[] books3 = {
                1, 2, 3, 4,
                2, 3, 4, 5
        };
        assertEquals(potter.price(books3), 25.6 * 2);

    }


}
