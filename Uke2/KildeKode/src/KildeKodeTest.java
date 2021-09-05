import static org.junit.jupiter.api.Assertions.*;

class KildeKodeTest {

    /**
     * win: [alt] + [enter] for å legge til junit til classpath
     * mac: [option] + [enter] --"--
     */
    @org.junit.jupiter.api.Test
    void myFirstSort() {
        int values[] = {1, 7, 2, 4, 6, 9};
        KildeKode.myFirstSort(values);

        int truth[] = {9, 7, 6, 4, 2, 1};
        assertArrayEquals(truth, values);
    }

    @org.junit.jupiter.api.Test
    void findMax() {
        int values[] = {1, 7, 2, 4, 6, 9};

        int index = KildeKode.findMax(values, 0, values.length);

        assertEquals(5, index);
        assertEquals(9, values[index]);


    }
}