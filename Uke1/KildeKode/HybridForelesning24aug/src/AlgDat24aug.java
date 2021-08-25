public class AlgDat24aug {
    public static void main(String[] args) {
        System.out.println("Hybrid forelesning 24aug");
        System.out.println();

        int[] values = {1, 7, 2, 4, 6, 9};


        for (int k = 0; k < values.length - 1; ++k) {

            //Sjekk at vi får fornuftig svar for tilfellet vårt.
            //Vi må utføre ordentlig testing før
            int max_index = findMax(values, 0, values.length);
            System.out.println("Største verdi ligger på plass " + max_index + " og har verdi " + values[max_index]);

            //Bytte plass på tall på plass 0 og max_index
            int temp = values[k];
            values[k] = values[max_index];
            values[max_index] = temp;

            System.out.println();
            System.out.println("Arrayet etter ombytting");
            for (int i = 0; i < values.length; ++i) {
                System.out.print(values[i] + " ");
            }
            System.out.println();
        }
    }

    /*
    FindMax - finner index til største tall i et array
    men søker bare innenfor tallene i fra index [fra] til [til]
     */
    public static int findMax (int[] values, int fra, int til){

        //initialisert variablene
        int index = fra;
        int max_value = values[fra];

        for (int i = fra+1; i < til; ++i){

            if (values[i] > max_value){
                index = i;
                max_value = values[i];
            }
        }

        return index;
    }
}
