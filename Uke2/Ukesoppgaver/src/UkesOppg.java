import Hjelpeklasse.Tabell;

import java.util.Arrays;

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

//OPPG 1 og gjort om til 2, inkl 3
        //Implementert nestMaks i Tabell.java

        int[] randomArray = Tabell.randPerm(20);
        int[] maksOgNestmaks = Tabell.nestMaks1(randomArray); //Bytt nestMaks1 til nestMaks for å få oppg2

        int storst = maksOgNestmaks[0];
        int nestStorst = maksOgNestmaks[1];

        Tabell.skrivln(randomArray);
        System.out.println("Størst verdi er " + randomArray[storst] + " og ligger i posisjon " + storst);
        System.out.println("Nest størst verdi er " + randomArray[nestStorst] + " og ligger i posisjon " + nestStorst);

        System.out.println();
//OPPG 4
        Tabell.sorteringAsc(randomArray);

System.out.println();
System.out.println();
//1.2.6

//OPPG 1
        //Antall operasjoner sendes inn i
        // pos 2 i arrayet sammen med største
        // og nest største verdi


        int[] etArray = Tabell.randPerm(20);
        int[] maksNestAntall = Tabell.nestMaksBokaEx(randomArray);

        System.out.println("Antall operasjoner på et array med lengde "+ etArray.length + " er " + maksNestAntall[2]);


//1.2.8

//OPPG 1
        /*
        Det vil alltid være n-1 sammenligninger
         */

//OPPG 3
///LIGGER I EGEN JAVA KLASSE


//1.2.9

//OPPG 1
        /*
        31 noder (2n-1)
        16 bladnoder og 15 indre noder
        bladnoder er de uten barn (på bunn)
         */

//OPPG 2
        /*
        k = 0,1,2,4,8,16
 */

//OPPG 3
        /*
        antall noder = 2n - 1
        høyde =
        bladnoder = 2^k
        indre noder = (2n-1) - 2^k
        antall sammenligninger = n-1
 */


//1.2.10

//OPPG 1
        /*
        på papir
        Vinneren har slått ut 21,27,18,8

        a) 17
        b) 13
         */


//1.2.11

/*
OPPG 1
        a)
            A false - B false - C true - D false - E true - F false
        b)
            Ingen er perfekte
        c)
            A true - B true - C false - D false - E true - F false
        d)
            Alle har høyde 3
        e)
            A 6 - B 6 - C 6 - D 4 - E 7 - F 4
        f)
        Et turneringstre vil alltid ha 2n-1 noder
            A true - B true - C false - D false - E true - F false
 */

//1.2.13
        //OPPG1
        //Implementert i tabell

System.out.println();
        System.out.println("Turneringstre");
        int[] turneringstreArray = Tabell.randPerm(5);
        System.out.println(Arrays.toString(turneringstreArray));
        int[] turnTre = Tabell.turneringstre(turneringstreArray);

        System.out.println();
        for (int i : turnTre){
            System.out.print(i + " ");
        }

//OPPG3
    }
}
