/*Napisz program pobierający trójelementową tablicę liczb i zwracający największą liczbę.

 */
public class Program {
    public static void main(String[] args) {
        int[] tablica = new int[]{2000, 700, 10004};
        if (tablica[0] > tablica[1] && tablica[0] > tablica[2]) {
            System.out.println("Najwieksza liczba to " + tablica[0]);
        }
        if (tablica[1] > tablica[0] && tablica[1] > tablica[2]) {
            System.out.println("Najwieksza liczba to " + tablica[1]);
        }
        if (tablica[2] > tablica[0] && tablica[2] > tablica[1]) {
            System.out.println("Najwieksza liczba to " + tablica[2]);
        }
    }
}
