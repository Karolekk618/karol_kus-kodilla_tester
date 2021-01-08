public class SimpleArray {
    public static void main (String[] args) {
        String[] animals = new String[5];

        animals[0] = "Bull";
        animals[1] = "Dog";
        animals[2] = "Cat";
        animals[3] = "Snake";
        animals[4] = "Bird";


        String animal = animals[3];
        System.out.println(animal);

        int numbersOfElements = animals.length;
        System.out.println("Moja tablica zawiera " + numbersOfElements + " elementów");
    }
}
