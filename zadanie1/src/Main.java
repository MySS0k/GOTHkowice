import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        //zad 1
        // double stopnieCelcjusza, stopnieFahrenheita;
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Podaj liczbę stopni w celcujszach");
        // stopnieCelcjusza = scanner.nextDouble();
        // // Fahrenheita = 1.8 * stopniecelcujsza + 32
        // stopnieFahrenheita = 1.8 * stopnieCelcjusza + 32;
        // System.out.println("Stopnie Fahrenheita:" + stopnieFahrenheita);
        //
        //zad 2




        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę całkowitą:");
        int liczba1 = scanner.nextInt();

        System.out.println("Podaj drugą liczbę całkowitą:");
        int liczba2 = scanner.nextInt();

        System.out.println("Podaj trzecią liczbę całkowitą:");
        int liczba3 = scanner.nextInt();


        int najwieksza = Math.max(Math.max(liczba1, liczba2), liczba3);
        int najmniejsza = Math.min(Math.min(liczba1, liczba2), liczba3);

        System.out.println("Największa liczba: " + najwieksza);
        System.out.println("Najmniejsza liczba: " + najmniejsza);

        scanner.close();




    }
}
