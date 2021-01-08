public class Tablice {
    public static void main (String[] args) {

/*  Tablice w Javie są obiektami.
    Aby móc skorzystać z Tablicy, nalezy najpierw zadeklarować zmienną tablicową, a następnie utworzyć samą tablicę (obiekt tablicy).
    Tablica - taki "kontener" a wiele, ułozonych kolejno obok siebie zmiennych. Zmienne te są podobne do siebie, tego samego typu.

    1. Schematycznie deklaracja taka jest nastepująca:  typ_tablicy[]  nazwa_tablicy;     (nawiasy kwadratowe można dać po nazwa_tablicy, ale przyjmuje się że jest po typie.)

    2. Tablicę tworzy się za pomocą operatora "new":    new typ_tablicy[liczba elementów];

    3. Oczywiście Tablicę można jednocześnie zadeklarować oraz utworzyć:    typ_tablicy[] nazwa_tablicy = new typ_tablicy[liczba elementów];

 */
    int[] tab = new int[1];
    tab[0] = 10;
    System.out.println("Pierwszy element tablicy ma wartość " + tab[0]);        // jak nie nadasz wartości w tablicy, wszystkie indeksy dla int beda równe 0


/*  I. TABLICE JEDNOWYMIAROWE
        --------------------------------------
        tab[0]  tab[1]  tab[2]  tab[3]  tab[4]
        --------------------------------------

        Pamiętaj, ostatni indeks tablicy jest o jeden mniejszy niż wielkość tablicy, ponieważ indeksy liczony jest od 0.

 */     int[] tablica;                                  // zadeklarowałem tablicę
        tablica = new int[5];                           // utworzyłem tablicę, oczywiście możesz to wszystko zrobić w jednej linii czyli: int[] tablica = new int[5];
            tablica[0] = 20;
            tablica[1] = 7;
            tablica[2] = 27;
            tablica[3] = 15;
            tablica[4] = 77;
//          tablica[5] = 20;                            tego ci nie odpali bo nie zarezerwowałeś dla 6 elementu miejsca, tablica jest 5 elementowa
        System.out.println(tablica[0]);

        int[] tab2 = {4, 53, 48, 514, 46};              // szybsze stworzenie tablicy, rzadziej stosowane, bo dane do tablic pobierane często z baz danych, a nie wpisywane ręcznie.
        System.out.println(tab2[3]);                    // w klamrach {] wpisujemy bezpośrednio dla małych tablic, wówczas nie korzystamy z operatora "new"

        System.out.println(tab2.length);                // wyświetla dlugość tablicy
        System.out.println(tab2[tab2.length-1]);        // odnosimy się do ostatniego elementu, ale pamietaj -1 bo indeksy liczymy od 0.
                                                        // Długość tablicy to 5, i o tym powie ci tab2.length, ale ostatni element jest nr 4!!!
        int[] tablica1 = new int[10];
        for (int i = 0; i < tablica1.length; i++) {
            tablica1[i] = i;
        }
        System.out.println(tablica1[i]);

/*  II. TABLICE WIELOWYMIAROWE
        --------------------------------------------------
        [0][0]  |  [0][1]  |  [0][2]  |  [0][3]  |  [0][4]
        --------------------------------------------------
        --------------------------------------------------
        [1][0]  |  [1][1]  |  [1][2]  |  [1][3]  |  [1][4]
        --------------------------------------------------
        --------------------------------------------------
        [2][0]  |  [2][1]  |  [2][2]  |  [2][3]  |  [2][4]
        --------------------------------------------------
        --------------------------------------------------
        [3][0]  |  [3][1]  |  [3][2]  |  [3][3]  |  [3][4]
        --------------------------------------------------

 */
        int [][] tab3 = new int[4][4];                  // identycznie jak jedno wymiarowe tylko z dwoma [][], trzywymiarowa to [][][]
        tab3[0][0] = 25;                                // np szachy to tablica 2-wymiarowa idealna
        tab3[3][2] = 25;
        tab3[1][3] = 25;
        System.out.println(tab3[0][0]);

// można to też od razu zainicjalizować

        int[][] tab4 = {
                {4, 5, 16, 35},
                {6, 98, 71, 84},
                {21, 53, 102, 11},
                {17, 46, 87, 97},
        };

        System.out.println(tab4[2][2]);
        System.out.println(tab4[3][1]);

        int[][] tab5 = new int [2][4];
        int count = 1;
        for (int i = 0; i < 2; i++) {
            for(int j = 0; j < 4; j++) {
                tab5[i][j] = count++;
            }
        }
    }
}
