public class Rzutowanie {
    public static void main (String[] args) {
        /*
        RZUTOWANIE - rzutowanie typu zmiennych, polega na rzutowaniu, czyli zmianie typu zmiennej na inny typ
         */

        int u = 5, y = 2;
        double k = 12, l = 15;

        System.out.println(u / y);          //  to mi da 2 zamiast 2.5 poniewaz zmienna są typu całkowitego, i wartości dziesietne są usuwane
        System.out.println((double) u / y); //  RZUTOWANIE - musimy sprawić aby jedna ze zmiennych zmieniła się w double, nieważne która zmienna. Należy dopisać w nawiasie (double)

        int wynik1 = u / y;
        double wynik2 = k / l;
        System.out.println(wynik1);         //  to ci usunie ułamek
        System.out.println(wynik2);         //  wynik poprawny z częścią dziesiętną

//      int wynik3 = u / k; tego nie wywołasz bo dzielisz liczbę całkowitą przez zmiennoprzecinkową, ale możesz rzutować nr k do int jak niżej
        int wynik3 = u / (int) k;           // tak jakbys informował kompilator, ja wiem co robię tzn rzutuję double do int, wiem że stracę część ułamkową
        System.out.println(wynik3);         // wynik dał 0 bo w rzeczywistości jest 5/15=0,333 a że cyfra powinna być całkowita więc część ułamkową odrzuca.

        double wynik4 = u / k;              // to wykona bo jedna ze zmiennych domyślnie jest juz zdefiniowana jako double
        System.out.println(wynik4);

        System.out.println(1.0 / 5);        // bez dopisania .0 nie miałbyś wyniku 0,2. Dopisanie .0 inforuje kompilator że jest to cyfra double
    }
}
