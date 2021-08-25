import java.util.Arrays;

public class UkesOppg {
    public static void main(String[] args) {
//OPPGAVER TIL 1.1.2

        /*Oppgave 1
            Den metoden vil returnere 6, som tilsier at minste verdi er plassert på indeks 6
        */

        //ARRAY
        int [] vals = {4,4,17,10,1,20,2,11,15,3,18,9,2,7,20};

        //Oppg 2
        System.out.println(min(vals));

        //Oppg 3
        System.out.println(max(vals));
        //Endrer sammenligning i if-løkke til å bli større eller lik

//OPPGAVER TIL 1.1.3
        //Oppg 5
        System.out.println(Arrays.toString(minmaks(vals)));
        //42 + x sammenligninger

        //Oppg 6
        System.out.println(fak(3));
        //det vil multipliseres n-1 ganger

//OPPGAVER TIL 1.1.4
        /*Deloppg i
            //10, 5, 7, 2, 9, 1, 3, 8, 4, 6
        31 operasjoner fordi a[0] er allerede størst
         */

        /*Deloppg ii
            //1, 2, 3, 4, 5, 6, 7, 8, 9, 10
            49 fordi en går inn i if-løkka hver gang å gjør 2 operasjoner (=)
         */

//OPPGAVER TIL 1.1.5
        //Oppg 1
        System.out.println(maks(vals));

    }
    //Oppg 2
    public static int min(int[] a){
        if (a.length < 1){
            throw new java.util.NoSuchElementException("Tabellen er tom");
        }

        int m = 0;

        for (int i = 1; i < a.length; ++i){
            if (a[i] < a[m]){ //Hvis tallet i rekken er mindre så settes m lik indeksen
                m = i;
            }
        }
        return m;
    }

    //Oppg 3
    public static int max(int[] a){
        if (a.length < 1){
            throw new java.util.NoSuchElementException("Tabellen er tom");
        }

        int m = 0;

        for (int i = 0; i < a.length; ++i){
            if (a[i] >= a[m]){ //Endrer sammenligningen til å bli større eller lik
               m = i;
            }
        }
        return m;
    }


//OPPGAVER TIL 1.1.3
    //Oppg 5
    public static int[] minmaks (int[] a){
        int[] b = {a[0], a[0]};

        for (int i = 1; i < a.length; ++i){ //15 + 14

            if (a[i] < b[0]){ //13
                b[0] = i +1;//+1 fordi vi begynner på 1 i for-løkka så må få riktig indeks; //
            }
                else if (a[i] < b[1]){ //x fordi de tallene som ikke blir true i forrige if går hit
                        b[1] = i +1; //
                }
        }

        return b;
    }

    //Oppg 6
    public static long fak(int n){
        if (n <= 1) {
            return 1;
        }
        else {
                return n * fak(n - 1);
            }

    }

//OPPGAVER TIL 1.1.5
    public static int maks (int[] a){
        int sist = a.length - 1;
        int m = 0;
        int maksverdi = a[0];
        int temp = a[sist];
        a[sist] = 0x7fffffff;          // legger tallet 2147483647 sist som er maks for int

        for (int i = 0; ; ++i){
            if (a[i] >= maksverdi){

                if (i == sist){
                    a[sist] = temp;
                    return  temp >= maksverdi ? sist : m;
                }
                else {
                    maksverdi = a[i];
                    m = i;
                }
            }
        }
    }
}
