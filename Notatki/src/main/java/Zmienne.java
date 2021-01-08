public class Zmienne {
    public static void main (String[] args) {
        /*
        ZMIENNE PODSTAWOWE - PRYMITYWNE (ciąg-ilość bitów). Ich wartości przechowywane sa w RAM.
                CALKOWITE:              byte, short, int, long.
                ZMIENNOPRZECINKOWE:     float, double.
                LOGICZNE:               boolean.
                ZNAKOWE:                char, String.

            1. Nie możesz dodawać różnych zmiennych do siebie (drobne wyjątki niżej), stracisz dane.
            2. Każda zmienna musi miec typ i nazwę, inicjalizację możemy wykonać od razu, przypisując do zmiennej wartość lub później.
            3. Zmienną mogę zapisywać w jednej linii, oddzielając je przecinkami.
            4. Nazwa zmiennej powinna być samookreślająca się, i powinna zaczynać się z małej litery.
            5. Nie wolno zaczynać nazwy zmiennej od cyfry, ale wolno od _ czy $. Cyfra może być w środku.
            6. Nie wolno używać w nazwie zmiennej keywordów, ani spacji.
            7. Wielkość liter ma znaczenie.
            8. Przyjmuj w nazwie wielowyrazowej, że każdy kolejny wyraz pisany jest z dużej litery (początek z małej !). camelCase
            9. Jak tworzysz zmienną stałą która się nie ma prawa zmienić, wówczas możesz ją nazwać wielkimi literami, równocześnie powinno się dopisać modyfikator "final".
            10. Zmienną lokalną (pomiędzy {} ) nalezy nazywać z malej litery. Taka jest konwencja w Java.
        */

        final double LICZBA_PI = 3.1456649846;
        System.out.println(LICZBA_PI);
//      LICZBA_PI = 5.4; - nie mogę zmienić jej wartości bo jest zablokowana wyżej poprzez słowo "final" (modyfikator, jakis właściwości dodatkowe ma zmienna)

        int i = 6, k; //zmienne mogą być w jednej lini, oddzielone przecinkiem, zainicjalizowane od razu lub później
        short j;
        j = 169;
        k = i + j; //zmienną przypisujemy (inicjalizacja) za pomoca jednego znaku =, dwa znaki equols == służą do porównania.
        if (i == 5)
            System.out.println(k);
        else
            System.out.println(j);

        /*
        TYPY CALKOWITE:
            byte:   - 8 bitów   (1 bajty)  _ -128 do 127
            short:  - 16 bitów  (2 bajty)  _ -32 768 do 32 767
            int:    - 32 bity   (4 bajty)  _ od -2 ^31 do 2 ^31 -1  (~2mld)
            long:   - 64 bity   (8 bajtów) _ -2 ^63 do 2 ^ 63 -1

            Jak chcesz dodać np int + long to on to zrobi ale jak wartość chcesz przypisać do zmiennej int to zwróci ci błąd bo jest za mały zakres.
            Głównie będziesz uzywał zmiennej całkowitej typu int, ale dla mniejszenia poboru RAM czasem innych mniejszych!
        */

            int a = 3645654;
            long b = 16564654562654L; // domyślnie jest int, dodaj L i bedzie long
            long c = a + b; // pamiętaj zmienna c nie może być typu int!!! bo jedna ze składowych jest typu long
            byte liczba = 127;
            short sredniaLiczba = -32768; // raz jeszcze przypominam, pamiętaj o zakresach!!!

            System.out.println(c);
            System.out.println(liczba);
            System.out.println(sredniaLiczba);

        /*
        TYPY ZMIENNOPRZECINKOWE:

            float:    - 32 bity _ 1,4 * 10 ^ -45 do 3,4 * 10 ^ 138 _ pojedyńcza precyzja, stosując ja musisz na końcu cyfry dopisać "f" np. 3.65f
            double:   - 64 bity _ 4,9 * 10 ^ -324 do 1,8 * 10 ^ 308 _ podwójna precyzja, kazda domysla liczba z kropką dziesiętną jest typu double

            Różnią się rozmiarem oraz zakresem liczb mozliwych do zaprezentowania.
            Stosujemy kropki a nie przecinki!
        */

            float f = 5.43f; // musisz na końcu dać "f" inaczej kompilator odbiera kazdą zmiennoprzecinkową jako double (domyślnie)
            double g;
            g = f + 8;
            System.out.println(g);

        /*
        TYPY LOGICZNE:
            boolean: bity zależy od JVM _ true lub false (tylko te dwie wartości możesz przypisać do tego typu zmiennej)
        */
            boolean czyPada; //stworzenie zmiennej, czyli zarezerwowanie w pamięci RAM miejsca dla niej
            czyPada = true; //inicjalizacja zmiennej
            boolean swieciSlonce = false; //od razu zainicjalizowaliśmy zmienną typu logicznego o nazwie "swieciSlonce"
            System.out.println(swieciSlonce);

        /*
        TYP ZNAKOWY:
            char: - 16 bitów _ 0 do 65 535 opiera się na standardzie UNICODE. Służy do reprezentowania wszelkich znaków, m.in. liter.
        */

        char h;
        h = 'd';  // tylko jeden znak i w pojedyńczym cudzycłowiu: 'x' (apostrofy pojedyncze do jednego znaku, podwójne do ciągu znaków)
        System.out.println(h);

        /*
        TYP STRING:
            Jest to klasa, zawsze z podwójnym cudzysłowiu " "
            Wielkość litery w nazwie zmiennej ma znaczenie.
        */

        String imie = "Karol"; // wielkość liter zmiennej ma znaczenie! -> patrz imie/Imie
        String nazwisko = "Kus";
        String Imie = "Asia"; //wywołuje zmienną imie = Karol oraz Imie = Asia
        imie = "Zygmunt"; // takim przypisaniem zmieniam wartość zmiennej imie z Karol na Zygmunt

        System.out.println("Imie: " + imie + " oraz " + "Nazwisko " + nazwisko);
        System.out.println(Imie);

        String daneOsobowe = imie + " " + nazwisko;
        System.out.println(daneOsobowe);

    }
}
