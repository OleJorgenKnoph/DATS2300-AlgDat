import Hjelpeklasse.Tabell;

public class UkesOppg {

    public static void main(String[] args) {
        System.out.println("Ukesoppgaver uke 2");
System.out.println();
//OPPG 1.2.1
        //TEST AV OPPG 1 I TABELL-KLASSE
        int[] a = {9,8,7,6,5,4,3,2,1,5,6};
//OPPG 1
        System.out.println(a[Tabell.minFraTil(a,3, 8)]);
        System.out.println(a[Tabell.minVH(a, 3, 8)]);
System.out.println();
        //Samme input (1 har indeks 8) men Tabell.minVH tar med 1 tallet i beregningen. Det gjør
        //ikke fra og til. Derfor outputter Tabell.minFraTil 2 og Tabell.minVH 1

//OPPG 5
        for (int tall : a){
            System.out.print(tall + " ");
        }
        System.out.println();
        System.out.println();


//OPPG 1.2.2

//Programkode 1.2.2 b
//OPPG 1 & 2
        int[] b = Tabell.randPerm(20);              // en tilfeldig tabell
        for (int k : b) System.out.print(k + " ");  // skriver ut b

        int m = Tabell.maks(b);   // finner posisjonen til største verdi

        System.out.println("\nStørste verdi ligger på plass " + m);

//OPPG 3
System.out.println();
        char[] charArray = {'a','b','c','d','e','f'};

        Tabell.bytt(charArray, 1,2); // Denne skal bytte plass på verdiene b og c
        System.out.println(charArray);

//OPPG 4
System.out.println();

            Tabell.skriv(a,0,4); //Denne skal skrive ut de 4 første verdien (9,8,7,6 men ikke 5 som egt er index 4
 System.out.println();
            Tabell.skriv(a); //Denne skriver alt med mellomrom utenom etter siste
System.out.println();

//OPPG 5
System.out.println();
        Tabell.skrivln(a,0,4); //samme som over bare med println
        Tabell.skrivln(a); //^



//OPPG 1.2.3

//OPPG 1 implementert i Tabell.java
//OPPG 2
//rangeCheck() funksjonen er nesten identisk som de ovenfor.

        System.out.println();
//OPPG 3
    //Implementert i maks() i Tabell
    //Test:
        /*
        System.out.println(Tabell.maks(a,6,5)); //FRA STØRRE ENN TIL
        System.out.println(Tabell.maks(a,3,3)); //FRA = TIL
        */

//OPPG 4
        /*
        int[] tomtArray = {};
        System.out.println(Tabell.maks(tomtArray, 2, 3));
        */

//OPPG 5
    //Implementert i Tabell.java i skrivln

        System.out.println();
//1.2.4

//OPPG 1
        //Implementert nestMaks i Tabell.java

        int[] randomArray = Tabell.randPerm(20);
        int[] maksOgNestmaks = Tabell.nestMaks(randomArray);

        int storst = maksOgNestmaks[0];
        int nestStorst = maksOgNestmaks[1];

        Tabell.skrivln(randomArray);
        System.out.println("Størst verdi er " + randomArray[storst] + " og ligger i posisjon " + storst);
        System.out.println("Nest størst verdi er " + randomArray[nestStorst] + " og ligger i posisjon " + nestStorst);

    }
}
