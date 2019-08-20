import static org.junit.jupiter.api.Assertions.*;

class BiggestNumberTest {

    @org.junit.jupiter.api.Test
    void findMax() {
        int[] liste = {1,2,4,-2,43,121,-234,12};

        int max_value = BiggestNumber.findMax(liste);

        assertEquals(32, max_value);
    }
}