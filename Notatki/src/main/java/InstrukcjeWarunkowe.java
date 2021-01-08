import jdk.swing.interop.SwingInterOpUtils;

public class InstrukcjeWarunkowe {
    public static void main (String[] args) {
    /*
    INSTRUKCJA WARUNKOWA - if...else if...else...

        Jeżeli wyrażanie jest np. prawdziwe - true to chcemy wykonać daną instrukcję 1, w przeciwnym przypadku, nie wykonywać nic, lub wykonać inną instrukcję
        Informuje cię co się wydarzy, jeżeli coś sie stanie.
    ...........................
        if (wyrażenie) {                    // jezeli wyrażenie jest prawdziwe to wykona się poniższa instrukcja, inaczej się nic nie wykona
            instrukcja 1;                   // klamry {} musisz używać, jak masz więcej niż jedną instrukcję,
            ...
            instrukcja n;
        }
    ...........................
        if (wyrażenie) {
            instrukcja 1;
            ...
            instrukcja n;
        }
        else instrukcja m;
    ...........................
        if (wyrażenie) {
            instrukcja 1;
            ...
            instrukcja n;
        }
        else if (wyrażenie) {
            instrukcja ...
            instrukcja m
        }
        else instrukcja k;
    ...........................         // else, if else - możesz stosować opcjonalnie tyle razy ile chcesz
     */

    int a = 5,
        b=7;
    System.out.println(a != b);
    if (a != b)                        // tu w warunku często nalezy stosować, koniunkcję, alternatywę
        System.out.println("Test");     // dla a == b "test" sie nie pokaże tylko będzie false

    if (a > b)
        System.out.println("a > b");
    else if (a < b)
        System.out.println("a < b");
//      System.out.println("pokaże ci bląd, ponieważ nie masz klamer {}");
    else
        System.out.println("a =b");
        System.out.println("lalala");   // "lalala" ci się pojawi bo tylko jedna instrukcja tyczy się elsa, chyba że dasz klamry {}


    /* INSTRUKCJA SWITCH - można nią zastapić serie instrukcji "if...else if..." (przełącznik)

            1. Pozwala ci przełączać pomiedzy różnymi stanami wartość która zostanie do niego wysłana
            2. Instrukcje nie sa przerywane, Switch idzie po kolei - przełącza - do przypadku który jest prawdziwy i wywołuje wszystko poniżej.
            3. Jak chcesz wywołać tylko poprawny przypadek - case - wszędzie musisz dać break, jest to wyjście z przełącznika, wyjście ze Switcha ( z instrukcji w {} )
            4. Po case są : -  a nie średniki
            5. Nie porównujemy double, Stringa.
            6. Znaki - char - można porównać np. 'j'


        switch (wyrażenie) {
            case wartość_1:
                instrukcje_1;
                break;
            case wartość_2:
                instrukcje_2;
                break;
            case wartość_3:
                instrukcje_3;
                break;
            default:
                instrukcje_4
        }

        Jeżeli wartością wyrażenia jest wartość_1, wykonane są instrukcje_1, jeżeli wartościa wyrażenia jest wartość_2, wykonane sa instrukcje_2 itd.
        Jeżeli nie uda sie dopasować wartości wyrażenia do wartości wystepujących w przypadkach - case, wykonywane są instrukcje wystepujące po słowie default.
        Instrukcja break przerywa wykonywanie bloku switch.

    */
    int c = 150;
    switch (c) {
    /*  case 50:
            System.out.println("c jest równe 50");
        case 100:
            System.out.println("c jest równe 100");
        default:
            System.out.println(" tak naprawde c = " + c);       // tak wywałany Switch, wypisze ci wszystko, a gdy c=100 wypisze ci dwie ostatnie,
                                                                // jak bedzie różne c od 50 i 100 to wypisze ci default,
    */                                                          // jak default dasz przed pierwszym case to znowu się wszystko wyświetli (dla c != 50, 100)
        case 50:
            System.out.println("c jest równe 50");
            break;
        case 100:
            System.out.println("c jest równe 100");
            break;
        default:
            System.out.println("tak naprawde c = " + c);        // na koncu nie musisz dawać breaka bo poniżej nie ma żadnych instrukcji

    }

    /* OPERATOR WARUNKOWY - warunek ? wartość_1 : wartość_2

            Jeżeli warunek jest prawdziwy, wartością wyrażenia staje się wartość_1, w przeciwnym wypadku wartością wyrażenia staje się wartość_2
     */

        int liczba = 10;
        int liczba2 = liczba < 0 ? -1 : 1;
        System.out.println(liczba2);

        int x = 5;

        if (x % 2 == 0)
            System.out.println("Parzysta");
        else
            System.out.println("Nieparzysta");
        // to samo co powyrzej można zapisać krócej, jak niżej:

        String czyParzysta = x % 2 == 0 ? "Parzysta" : "Nieparzysta";
            System.out.println(czyParzysta);
    }
}
