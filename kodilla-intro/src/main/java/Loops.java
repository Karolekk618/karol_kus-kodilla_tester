public class Loops {
    public static void main (String[] args) {

        for (int i=0; i <= 10; i++) {
            System.out.println(i);
        }

        String[] names = new String[] {"Zygfryd","Gwidon","Florentyna"};
        for (int x=0; x < names.length; x++) {
            System.out.println(names[x]);
        }

        for (int z= names.length-1; z >= 0; z--){
            System.out.println(names[z]);
        }

        int[] tablicaLiczb = new int[] {156, 56, 396, 485};

        int tab1 = tablicaLiczb[0];
        int tab2 = tablicaLiczb[1];
        int tab3 = tablicaLiczb[2];
        int tab4 = tablicaLiczb[3];

        int suma = tab1 + tab2 + tab3 + tab4;
        System.out.println(suma);
    }

}
