package Hjelpeklasse;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Random;

public class Tabell {
    private Tabell() {}

//OPPGAVE 1
//Programkode 1.2.2 a
    public static int minFraTil(int[] a, int fra, int til){
        if (fra < 0 || til > a.length || til <= fra){
            throw new IllegalArgumentException("Ugyldig intervall");
        }

        int m = fra;
        int minimum_verdi = a[fra];

        for (int i = fra + 1; i < til; ++i){
            if (a[i] < minimum_verdi){
                minimum_verdi = a[i];
                m = i;
            }
        }

        return m;

    }
    public static int minVH(int[] a, int v, int h){

        vhKontroll(a.length, v, h);

        if (v < 0 || h >= a.length || h < v - 1){
            throw new IllegalArgumentException("Ugyldig intervall");
        }

        int m = v;
        int minimum_verdi = a[v];

        for (int i = v; i <= h; ++i){
            if (a[i] < minimum_verdi){
                minimum_verdi = a[i];
                m = i;
            }
        }

        return m;
    }

    // Metoden bytt(int[] a, int i, int j)       Programkode 1.1.8 d)
    public static void bytt(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    // Metoden randPerm(int n)                   Programkode 1.1.8 e)
    public static int[] randPerm(int n)  // en effektiv versjon
    {
        Random r = new Random();         // en randomgenerator
        int[] a = new int[n];            // en tabell med plass til n tall

        Arrays.setAll(a, i -> i + 1);    // legger inn tallene 1, 2, . , n

        for (int k = n - 1; k > 0; k--)  // løkke som går n - 1 ganger
        {
            int i = r.nextInt(k+1);        // en tilfeldig tall fra 0 til k
            bytt(a,k,i);                   // bytter om
        }

        return a;                        // permutasjonen returneres
    }
    // Metoden randPerm(int[] a)                 Programkode 1.1.8 f)
    public static void randPerm(int[] a)  // stokker om a
    {
        Random r = new Random();     // en randomgenerator

        for (int k = a.length - 1; k > 0; k--)
        {
            int i = r.nextInt(k + 1);  // tilfeldig tall fra [0,k]
            bytt(a,k,i);
        }
    }
    // Metoden maks(int[] a, int fra, int til)   Programkode 1.2.1 b)
    public static int maks(int[] a, int fra, int til) {

//Oppg til 1.2.3 OPPG 3 & 4
        //FeilKontrollSøking

        if (a.length == 0){
            throw new NullPointerException("" +
                    "Arrayet er tomt");
        }

        if (fra == til){
            throw new NoSuchElementException("" +
                    "Fra(" + fra + ") = Til(" + til + ") - Tomt intervall");
        }

        fraTilKontroll(a.length, fra, til);



        int m = fra;              // indeks til største verdi i a[fra:til>
        int maksverdi = a[fra];   // største verdi i a[fra:til>

        for (int i = fra + 1; i < til; i++)
        {
            if (a[i] > maksverdi)
            {
                m = i;                // indeks til største verdi oppdateres
                maksverdi = a[m];     // største verdi oppdateres
            }
        }

        return m;  // posisjonen til største verdi i a[fra:til>
    }
    // Metoden maks(int[] a)                     Programkode 1.2.1 c)
    public static int maks(int[] a)  // bruker hele tabellen
    {
        return maks(a,0,a.length);     // kaller metoden over
    }


//OPPG 1.2.2
//OPPG 3
    public static void bytt(char[] c, int i, int j){

        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }

//OPPG 4
    public static void skriv(int[] a, int fra, int til){

        fraTilKontroll(a.length, fra, til);

        //Denne skriver ut tabellen fra og med a[fra] og til og med a[til - 1] (Stopper før til)
        //Hvis i verdien er mindre enn til - 1, dvs at rett før siste verdi som skal skrives ut så legger den
        //med et mellomrom etter. Hvis ikke legger den med et punktum
        for (int i = fra; i < til; ++i){
            if (i < til - 1){
                System.out.print(a[i] +  " ");
            }
            else {
                System.out.print(a[i] + ".");
            }
        }
    }
    public static void skriv(int[] a){

        //Denne skriver ut alle verdiene med et mellomrom mellom utenom etter siste verdi;
            for(int i = 0; i < a.length; ++i){
                if (i < a.length - 1){
                    System.out.print(a[i] + " ");
                }
                else {
                    System.out.print(a[i] + ".");
                }
            }
    }

//OPPG 4
    public static void skrivln (int[] a, int fra, int til){

        fraTilKontroll(a.length, fra, til);

        for (int i = fra; i < til; ++i){
            if (i < til - 1){
                System.out.print(a[i] +  " ");
            }
            else {
                System.out.print(a[i]);
                System.out.println();
            }
        }
    }
    public static void skrivln (int[] a){
        for (int i = 0; i < a.length; ++i){
            if (i < a.length - 1){
                System.out.print(a[i] + " ");
            }
            else {
                System.out.print(a[i]);
                System.out.println();
            }
        }
    }


//OPPG 1.2.3
    //OPPG 1
    public static void fraTilKontroll(int tablLengde, int fra, int til){

        //Fra er negativ. Kan ikke skrive ut en negativ index
        if (fra < 0){
            throw new ArrayIndexOutOfBoundsException("" +
                    "fra " + fra + " er negativ");
        }

        //Til-indeks er større en tabelLengden
        if (til > tablLengde){
            throw new ArrayIndexOutOfBoundsException("" +
                    "Til er større enn tabellengde: " + til + ">"+tablLengde);
        }

        if (fra > til)
        throw new IllegalArgumentException("" +
                "Ugyldig intervall: " + fra  + " > " + til);

    }

    public static void vhKontroll (int tablLengde, int v, int h){

        if (v < 0){
            throw new ArrayIndexOutOfBoundsException("" +
                    "Venstre: " + v  +"er mindre enn 0");
        }

        if (h > tablLengde) {
            throw new ArrayIndexOutOfBoundsException("" +
                    "Høyre: " + h + " er større en lengden på tabllen");
        }

        //+1 fordi metoden skal kunne skrive ut 1 tall
        if (v > h + 1){
            throw new IllegalArgumentException("" +
                    "Venstre " + v + " er større enn høyre " + h);
        }
    }

//OPPG 3
    //SE MAKS(int[] a, int fra, int til) metoden. TESTES I MAIN

//OPPG 4
        /*
        Implementert i maks. Testes i main
        */

//OPPG 5
    //Implementert i Tabell.java i skrivln



//1.2.4

//OPPG 2
        public static int[] nestMaks (int[] a){


            if (a.length < 2) { //Tabellen må ha minst to verdier for å finne nest største
                throw new NoSuchElementException("" +
                        "Må ha to verdier for å finne nest største");
            }

            int maks = maks(a); //Største verdien i tabellen (indeksen til)

            bytt(a, maks, 0);

            int nestMaks = maks(a, 1, a.length);

            bytt(a, 0, maks);

            return new int[] {maks, nestMaks}; //Returnerer et array med maks først
        }

//OPPG 3
        public static int[] nestMaks1(int[] a){
            if (a.length < 2){
                throw new NoSuchElementException("" +
                        "Tabellen må ha 2 verdier");
            }

            int maks = maks(a);

            bytt(a, maks, a.length-1);

            int nestMaks = maks(a, 0, a.length-1);

            bytt(a, a.length-1, maks);

            return new int[] {maks, nestMaks};
        }

//OPPG 4
        public static void sorteringAsc(int[] a){
            if (a.length < 2){
                throw new NoSuchElementException("Må ha flere enn ett tall");
            }

            for (int i = a.length-1; i > 0; --i) {
                int maks = maks(a, 0, i);

                bytt(a, maks, i);
            }
            //Må implementere denne fordi for-løkken vil ikke gå gjennom kontrollen i maks
            //funksjonen
            if (a[0] > a[1]){
                bytt(a,0,1);
            }

            for (int tall : a)
            System.out.print(tall + " ");
        }

//1.2.6

//OPPG 1

    public static int[] nestMaksBokaEx(int[] a) // ny versjon
    {
        int n = a.length;     // tabellens lengde
        if (n < 2) throw      // må ha minst to verdier
                new java.util.NoSuchElementException("a.length(" + n + ") < 2!");

        int m = 0;      // m er posisjonen til største verdi
        int nm = 1;     // nm er posisjonen til nest største verdi

        // bytter om m og nm hvis a[1] er større enn a[0]
        if (a[1] > a[0]) { m = 1; nm = 0; }

        int maksverdi = a[m];                // største verdi
        int nestmaksverdi = a[nm];           // nest største verdi

        int antallop = 1;

        for (int i = 2; i < n; i++)
        {
            antallop++;

            if (a[i] > nestmaksverdi)
            {
                antallop++;

                if (a[i] > maksverdi)
                {
                    nm = m;
                    nestmaksverdi = maksverdi;     // ny nest størst

                    m = i;
                    maksverdi = a[m];// ny størst

                    antallop++;

                }
                else
                {
                    nm = i;
                    nestmaksverdi = a[nm];// ny nest størst

                }
            }
        } // for

        return new int[] {m,nm, antallop};    // n i posisjon 0, nm i posisjon 1

    } // nestMaks





//1.2.13
    //TURNERINGTRE FULLSTENDIG

    public static int[] turneringstre(int[] a)   // en turnering
    {
        int n = a.length;                // for å forenkle notasjonen

        if (n < 2) // må ha minst to verdier!
            throw new IllegalArgumentException("a.length(" + n + ") < 2!");

        int[] b = new int[2*n];          // turneringstreet
        System.arraycopy(a,0,b,n,n);     // legger a bakerst i b

        for (int k = 2*n-2; k > 1; k -= 2)   // lager turneringstreet
            b[k/2] = Math.max(b[k],b[k+1]);

        int maksverdi = b[1], nestmaksverdi = Integer.MIN_VALUE;

        for (int m = 2*n - 1, k = 2; k < m; k *= 2)
        {
            int tempverdi = b[k+1];  // ok hvis maksverdi er b[k]
            if (maksverdi != b[k]) { tempverdi = b[k]; k++; }
            if (tempverdi > nestmaksverdi) nestmaksverdi = tempverdi;
        }

        for(int i : b){
            System.out.print(i + " ");
        }

        return new int[] {maksverdi,nestmaksverdi}; // størst og nest størst

    } // nestMaks
}
