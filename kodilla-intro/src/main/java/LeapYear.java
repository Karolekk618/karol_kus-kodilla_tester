public class LeapYear {
    public static void main(String[] args) {
/*      ROK Przestepny:
                        - jest podzielny przez 4 i niepodzielny przez 100
                        lub
                        - jest podzielny przez 400
 */
        int rok = 1899;
        int rok2 = rok;
        String rokPrzestepny = "TAK, Jest rokiem przestepny";
        String rokNiePrzestepny = "Jest rokiem NIE przestepny";

        System.out.println("Czy podany rok: " + rok + " jest rokiem przestepnym czy nie przestepnym?");

        if (((rok % 4 == 0) && (rok % 100 != 0)) || (rok % 400 == 0))
            System.out.println(rokPrzestepny);
        else
            System.out.println(rokNiePrzestepny);


//      DRUGI SPOSÓB

        System.out.println();
        System.out.println("Czy podany rok: " + rok2 + " jest rokiem przestepnym czy nie przestepnym?");

        if (rok2 % 4 == 0) {
            if (rok2 % 100 == 0) {
                if (rok2 % 400 == 0)
                    System.out.println("Jest rokiem przestepny");
                else
                    System.out.println("Jest rokiem nie przestepny");
            } else
                System.out.println("Jest rokiem przestepnym");
        } else
            System.out.println("Jest rokiem nie przestepnym");
        System.out.println();

//      Wynik dla "n" lat

        int ileLat = 205;
        int podajRok = 2000;

        int[] tablica = new int[ileLat];
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = podajRok + i;
        }
        for (int a = 0; a < ileLat; a++) {
            if (((tablica[a] % 4 == 0) && (tablica[a] % 100 != 0)) || (tablica[a] % 400 == 0))
                System.out.println(tablica[a] + " ---------------------------- " + rokPrzestepny);
            else
                System.out.println(tablica[a] + "  " + rokNiePrzestepny);
        }
    }
}
