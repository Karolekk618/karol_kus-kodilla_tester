public class Operatory {
    public static void main (String[] args) {
        /*
        OPERATORY ARYTMETYCZNE - to znaki służące do operowania na zmiennych

                + , - , * , / , =
                % - reszta z dzielenia (dzielenie modulo)
                ++ - inkrementacja - powiększ o 1
                -- - dekrementacja - zmniejsz o 1

                y++ - POST INKREMENTACJA    (wypisuje zmienną na ekran, ewentualnie cos wylicza i dopiero póżniej dodaje do niej 1.) Mówimy tak: powiększ mi ale narazie nie pokazuj, pokaż w kolejnej lini.
                Y-- - POST dekrementacja

                ++Y - PRE INKREMENTACJA     (najpierw dodaje do zmiennej 1 i następnie ją wypisuje/wylicza na ekran) Hej, najpierw mi powiększ a następnie wypisz na ekran
                --Y - PRE dekrementacja
                Szczególnie przydatne w pętlach.

                x += y     =>     x = x + y
                x -= y     =>     x = x - y
                x *= y     =>     x = x * y
                x /= y     =>     x = x / y
                x %= y     =>     x = x % y

         */

                int m = 7;
                m = m + 2;  // taki zapis jest nadmiarowy - redundacyjny, zamias tego stosuj odpowiedni operator
                m += 5;     // dodaje do wartości która jest juz przypisana do "m" wartość po = czyli tutaj 5. To samo z '- * / '
                System.out.println(m);
                m++;        //zwiększa mi o 1. to jest to samo co m+=1;

                System.out.println(m++); // m aktualnie =15, i dalej po takim zapisie zostanie pokazana jako 15, ale w domyśle już bedzie 16 bo dodaliśmy 1 post inkrementacji
                System.out.println(m);
                System.out.println(++m); //tu słusznie jest obecie 17, bo wcześniej z 15 zmienilo się po post inkrem. na 16 a teraz w pre inkrement. zwiekszyliśmy o 1 i dopiero wypisaliśmy na ekran

        /*
        OPERATOR RELACYJNY (porównania) - szczególnie do typu boolean będziesz używać

            == - porównanie (pamiętaj = to przypisanie wartości do zmiennej, porównanie to dwa ==)
            != - porównanie czy są różne od siebie
            >,<,>=,<=

        */
            boolean isTrue = 4==4;
            System.out.println(isTrue);
            System.out.println(5 != 8);

            if (4 == 8)
                System.out.println(isTrue);     // nie wykonał instrukcji, ponieważ warunek jest niespełniony

        /*
        OPERATORY LOGICZNE - true lub false

            1. NEGACJA - logiczna. Zmienia wartość argumentu na przeciwną (NOT)

                ! - negacja
                    !(true) = false
                    !(false) = true

            2. KONIUNKCJA - iloczyn logiczny (AND)

                && - koniunkcja - "i" - w tym samym momencie. Jest prawdziwe i liczy tylko wtedy gdy wszystkie warunki sa prawdziwe. (ampersandy)
                            true true   - true
                            true false  - false
                            false true  - false      (jak pierwszy warunek jest false już dalej nie liczy)
                            false false - false

             3. ALTERNATYWA - suma logiczna (OR)

                || - alternatywa - "lub" - to lub to. Jest fałszywa gdy wszystkie wyrażenia są fałszywe, w innym przypadku jest true.
                            true true   - true
                            true false  - true
                            false true  - true
                            false false - false
        */
            int a = 5,
                b = 5,
                c = 7;
            if (!(a == b))
                System.out.println("Tak");
            if (a == b && c > 5)        // gdy pierwszy warunek jest false, dalej nie liczy, bo już wiadomo że wszystkie nie będą true
                System.out.println("Ponownie tak");
            if (a != b || c > 5)        // gdy pierwszy warunek jest true, dalej nie liczy, bo juz wiadomo że przynajmniej jedna to true
                System.out.println("I co teraz");

        /*
        OPERATORY BITOWE _ z udemy zrób
        */

        /*
        PRIORYTETY OPERATORÓW _ tablice + książki
        */
    }
}
