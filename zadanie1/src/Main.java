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




       // Scanner scanner = new Scanner(System.in);

       // System.out.println("Podaj pierwszą liczbę całkowitą:");
       // int liczba1 = scanner.nextInt();

       // System.out.println("Podaj drugą liczbę całkowitą:");
       // int liczba2 = scanner.nextInt();

       // System.out.println("Podaj trzecią liczbę całkowitą:");
       // int liczba3 = scanner.nextInt();


       // int najwieksza = Math.max(Math.max(liczba1, liczba2), liczba3);
       // int najmniejsza = Math.min(Math.min(liczba1, liczba2), liczba3);

       // System.out.println("Największa liczba: " + najwieksza);
       // System.out.println("Najmniejsza liczba: " + najmniejsza);

       // scanner.close();



        //zad 3



//
// Scanner s = new Scanner(System.in);
// System.out.println("Podaj wagę (kg):");
// double waga = s.nextDouble();
// System.out.println("Podaj wzrost (m):");
// double wzrost = s.nextDouble();
//
// double bmi = waga / (wzrost * wzrost);
//
// if (bmi >= 18.5 && bmi <= 24.9) {
// System.out.println("Waga prawidłowa");
// } else if (bmi < 18.5) {
// System.out.println("Niedowaga");
// } else {
// System.out.println("Nadwaga");
// }
//
// s.close();


        
// zad 4
// Scanner s = new Scanner(System.in);
// System.out.println("Podaj dochód (PLN):");
// double income = s.nextDouble();
//
// double tax;
// if (income <= 85528) {
// tax = income * 0.18 - 556.02;
// } else {
// tax = 14839.02 + (income - 85528) * 0.32;
// }
//
// // Zaokrąglenie do 2 miejsc po przecinku
// tax = Math.round(tax * 100.0) / 100.0;
//
// // Zapewnienie, że podatek nie jest ujemny
// if (tax < 0) tax = 0;
//
// System.out.println("Należny podatek: " + tax + " PLN");
//
// s.close();


        // zad 5

    /*
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cenaTowaru = 0;
        int liczbaRat = 0;

        while (true) {
            System.out.print("Podaj cenę towaru (od 100 zł do 10000 zł): ");
            cenaTowaru = scanner.nextDouble();
            if (cenaTowaru >= 100 && cenaTowaru <= 10000) {
                break;
            } else {
                System.out.println("Nieprawidłowa cena. Spróbuj ponownie.");
            }
        }

        while (true) {
            System.out.print("Podaj liczbę rat (od 6 do 48): ");
            liczbaRat = scanner.nextInt();
            if (liczbaRat >= 6 && liczbaRat <= 48) {
                break;
            } else {
                System.out.println("Nieprawidłowa liczba rat. Spróbuj ponownie.");
            }
        }

        double oprocentowanie = 0;
        if (liczbaRat >= 6 && liczbaRat <= 12) {
            oprocentowanie = 0.025;
        } else if (liczbaRat >= 13 && liczbaRat <= 24) {
            oprocentowanie = 0.05;
        } else if (liczbaRat >= 25 && liczbaRat <= 48) {
            oprocentowanie = 0.10;
        }
        double kwotaZOdsetkami = cenaTowaru * (1 + oprocentowanie);
        double miesiecznaRata = kwotaZOdsetkami / liczbaRat;
        System.out.printf("Miesięczna rata wynosi: %.2f zł\n", miesiecznaRata);
*/

        /*


        //zad 6


        import java.util.Scanner;

        public class Kalkulator {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Prosty kalkulator: dodawanie, odejmowanie, mnożenie, dzielenie dwóch liczb rzeczywistych.");

        System.out.print("Podaj pierwszą liczbę: ");
        double liczba1 = scanner.nextDouble();

        System.out.print("Podaj operację (+, -, *, /): ");
        char operacja = scanner.next().charAt(0);

        System.out.print("Podaj drugą liczbę: ");
        double liczba2 = scanner.nextDouble();

        switch (operacja) {
            case '+':
                System.out.printf("Wynik: %.2f\n", liczba1 + liczba2);
                break;
            case '-':
                System.out.printf("Wynik: %.2f\n", liczba1 - liczba2);
                break;
            case '*':
                System.out.printf("Wynik: %.2f\n", liczba1 * liczba2);
                break;
            case '/':
                if (liczba2 == 0) {
                    System.out.println("Błąd: nie można dzielić przez zero.");
                } else {
                    System.out.printf("Wynik: %.2f\n", liczba1 / liczba2);
                }
                break;
            default:
                System.out.println("Błąd: niepoprawny symbol operacji.");
        }

        System.out.println("Naciśnij Enter, aby zakończyć...");
        try {
            System.in.read();
        } catch (Exception e) {
        }
        }   */  
    }
}
