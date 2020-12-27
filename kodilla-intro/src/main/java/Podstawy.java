/*
komentarze wieloliniowe: STOSUJ KOMENTARZE !!!
 */
// komentrz jednoliniowy (stosowanie tych znaków, powoduje że kompilator tego nie interpretuje
// przypisanie wartości do zmiennej nazywamy INICJALIZACJĄ
// napisz: sout + "naciśnij tabulator" a funkcja sama ci wyskoczy
// (REDUNDACYJNE = NADMIAROWE)


package podstawy;
public class Podstawy {
    public static void main(String[] args) {
//        ZMIENNE PODSTAWOWE - PRYMITYWNE (ciąg-ilość bitów):
//        Ich wartości przechowywane sa w RAM. Nie możesz dodawać różnych zmiennych do siebie (drobne wyjątki niżej)*

//            TYPY CAŁKOWITE:
//                byte:   - 8 bitów     _ -128 do 127
//                short:  - 16 bitów    _ -32 768 do 32 767
//                int:    - 32 bity     _ od -2 ^31 do 2 ^31 -1  (~2mld)
//                long:   - 64 bity     _ -2 ^63 do 2 ^ 63 -1
//
//                      Jak chcesz dodać np int + long to on to zrobi ale jak wartość chcesz przypisać do zmiennej int to zwroci ci błąd bo jest za mały zakres.
        int a = 3645654;
        long b = 16564654562654L; // domyślnie jest int, dodaj L i bedzie long
        long c = a + b; // pamiętaj zmienna c nie może być typu int!!! bo jedna ze skladowych jest typu long
        byte liczba = 127;
        short sredniaLiczba = -32768; // raz jeszcze przypominam, pamiętaj o zakresach!!!
        // głównie będziesz uzywał zmiennej całkowitej typu int, ale dla mniejszenia poboru RAM czasem innych mniejszych!
        System.out.println(c);
        System.out.println(liczba);
        System.out.println(sredniaLiczba);
        int d = 4, e = 9; // zmienna mogę zapisywać w jednej linii, oddzielając je przecinkami
//            TYPY ZMIENNOPRZECINKOWE:
//                float:    - 32 bity _ 1,4 * 10 ^ -45 do 3,4 * 10 ^ 138 _ pojedyńcza precyzja, stosując ja musisz na końcu cyfry dopisać "f" np. 3.65f
//                double:   - 64 bity _ 4,9 * 10 ^ -324 do 1,8 * 10 ^ 308 _ podwójna precyzja, kazda domysla liczba z kropką dziesiętną jest typu double
//                      Stosujemy kropki a nie przecinki!
        float f = 5.43f; // musisz na końcu dać "f" inaczej kompilator odbiera kazdą zmiennoprzecinkową jako double (domyślnie)
        double g;
        g = f+8;
        System.out.println(g);
//            TYPY LOGICZNE:
//                boolean: bity zależy od JVM _ true lub false (tylko te dwie wartości możesz przypisać do tego typu zmiennej)
        boolean czyPada;
        czyPada = true;
        boolean swieciSlonce = false; //od razu zainicjalizowaliśmy zmienną typu logicznego o nazwie "swieciSlonce"
//            TYP ZNAKOWY:
//                char: - 16 bitów _ 0 do 65 535
        char h;
        h = 'd';  // tylko jeden znak i w pojedyńczym cudzycłowiu: 'x' (apostrofy pojedyncze do jednego znaku, podwójne do ciągu znaków)
//  Każda zmienna musi miec typ i nazwę, inicjalizację możemy wykonać od razu, przypisując do zmiennej wartość lub później:
        int i = 6;
        short j;
        j = 169;
        i = i + a; //zmienną przypisujemy za pomoca jednego znaku =, dwa znaki equols == służą do porównania.
        if (i == 5)
            System.out.println(i);
        else
            System.out.println(j);
        String imie = "Karol";
        String nazwisko = "Kus";
        String Imie = "Asia"; //wywołuje zmienną imie = Karol oraz Imie = Asia
        imie = "Zygmunt"; // takim przypisaniem zmieniam wartość zmiennej imie z Karol na Zygmunt

        System.out.println("Imie: " + imie + " oraz " + "Nazwisko " + nazwisko);
//        Wielkość litery w nazwie zmiennej ma znaczenie:

        System.out.println(Imie);
//        Zmienną lokalną (pomiędzy {} ) nalezy nazywać z malej litery!! Taka jest konwencja w Java.

        String daneOsobowe = imie + " " + nazwisko;
        System.out.println(daneOsobowe);

// Nazwa zmiennej powinna być samookreślająca się, nie wolno jej zaczynać od cyfry, ale od _ czy $ można. Cyfra może być w środku.
// Nie wolno używać w nazwie zmiennej keywordów, ani spacji
// Przyjmuj w nazwie wielowyrazowej, że każdy kolejny wyraz pisany jest z dużej litery (początek z małej !)
// Ewentualnie jak tworzysz zmienną stałą która się nie ma prawa zmienić, wówczas możesz ją wielkimi literami nazwać, wówczas powinno się dopisać "final"
        final double LICZBA_PI = 3.1456649846;
        System.out.println(LICZBA_PI);
//        LICZBA_PI = 5.4; nie mogę zmienić jej wartości bo jest zablokowana wyżej poprzez słowo "final" (modyfikator)
        System.out.println();
//     ODWOŁANIA DO OBIEKTÓW


//        RZUTOWANIE
//        rzutowanie typu zmiennych, polega na rzutowaniu, czyli zmianie typu zmiennej na inny typ
        int u = 5, y = 2;
        double k = 12, l = 15;
        System.out.println(u / y); //to mi da 2 zamiast 2.5 poniewaz zmienna jest typu całkowitego, i wartości dziesietne są usuwane
        System.out.println((double)u / y); //RZUTOWANIE - musimy sprawić aby jedna ze zmiennych zmieniła się w double, nieważne która zmienna. Należy dopisać w nawiasie (double)

        int wynik1 = u / y;
        double wynik2 = k / l;
        System.out.println(wynik1); //to ci usunie ułamek
        System.out.println(wynik2); //wynik poprawny z częścią dziesiętną

//      int wynik3 = u / k; tego nie wywołasz bo dzielisz liczbę całkowitą przez zmiennoprzecinkową, ale możesz rzutować nr k do int jak niżej
        int wynik3 = u / (int)k; // tak jakbys informował kompilator, ja wiem co robię tzn rzutuję double do int, wiem że stracę część ułamkową
        System.out.println(wynik3); // wynik dał 0 bo w rzeczywistości jest 5/15=0,333 a że cyfra powinna być całkowita więc część ułamkową odrzuca.
        double wynik4 = u / k; // to wykona bo jedna ze zmiennych domyślnie jest juz zdefiniowana jako double
        System.out.println(wynik4);
        System.out.println(1.0 / 5); // bez dopisania .0 nie miałbyś wyniku 0,2. Dopisanie .0 inforuje kompilator że jest to cyfra double

//        OPERATORY - TO ZNAKI SŁUŻĄCE DO OPEROWANIA ZMIENNYCH
//          +-*/=
//          +=
        int m = 7;
//          m = m + 2; //taki zapis jest nadmiarowy - redundacyjny, zamias tego stosuj odpowiedni operator
        m += 5; // dodaje do wartości która jest juz przypisana tutaj np.5. To samo z '-*/'
//          % - reszta z dzielenia (dzielenie modulo)
//          ++ - inkrementacja - powiększ o 1
//          -- - dekrementacja - zmniejsz o 1
        m++; //to jest to samo co m+=1;

//          y++ - POST INKREMENTACJA    (wypisuje zmienną na ekran i póżniej dodaje do niej 1.) Mówimy tak: powiększ mi ale narazie nie pokazuj, pokaż w kolejnej lini.
//          Y-- - POST dekrementacja
//
//          ++Y - PRE INKREMENTACJA     (najpierw dodaje do zmiennej 1 i następnie ją wypisuje na ekran) Hej, najpierw mi powiększ a następnie wypisz na ekran
//          --Y - PRE dekrementacja
//            Szczególnie przydatne w pętlach
        System.out.println(m++); // m aktualnie =13, i dalej po takim zapisie zostanie pokazana jako 13, ale w domyśle już bedzie 14 do dodaliśmy 1 post inkrementacji
        System.out.println(m);
        System.out.println(++m); //tu słusznie jest obecie 15, bo wcześniej z 13 zmienilo się po post inkrem. na 14 a teraz w pre inkrement. zwiekszyliśmy o 1 i dopiero wypisaliśmy na ekran

//            OPERATOR RELACYJNY (PORÓWNANIA) //szczególnie typ boolean będziesz używać
        //              == - porównanie
        //              != - porównanie czy są różne od siebie
        //              >,<,>=,<=
//
//            OPERATORY LOGICZNE - true lub false
//                ! - negacja
//                !(true) = false
//                !(false) = true

//                && - koniunkcja - "i" - w tym samym momencie. Jest prawdziwe i liczy tylko wtedy gdy wszystkie warunki sa prawdziwe.
//                            true true - true
//                            true false - false
//                            false true - false
//                            false false - false
//                || - dokończ w udemy....
//

    }

    public void Rzutowanie (String[] args){



    }
}
