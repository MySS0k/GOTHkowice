/*
1.import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą dodatnią: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
    }
}
2.import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj A: ");
        int A = scanner.nextInt();
        System.out.print("Podaj B: ");
        int B = scanner.nextInt();


        int sum = 0;
        int i = A;
        while (i <= B) {
            sum += i;
            i++;
        }
        System.out.println("Suma (while): " + sum);


        sum = 0;
        i = A;
        do {
            sum += i;
            i++;
        } while (i <= B);
        System.out.println("Suma (do-while): " + sum);


        sum = 0;
        for (i = A; i <= B; i++) {
            sum += i;
        }
        System.out.println("Suma (for): " + sum);
    }
}

3.import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą dodatnią: ");
        int n = scanner.nextInt();

        int power = 1;
        while (power <= n) {
            System.out.println(power);
            power *= 2;
        }
    }
}
4.import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int liczba;
        
        do {
            System.out.print("Podaj liczbę (0 kończy wprowadzanie): ");
            liczba = scanner.nextInt();
            suma += liczba;
        } while (liczba != 0);
        
        System.out.println("Suma liczb: " + suma);
    }
}
5.import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int suma = 0;
        int liczba;

        System.out.println("Podaj ciąg liczb (0 kończy):");
        while (true) {
            liczba = scanner.nextInt();
            if (liczba == 0) {
                break;
            }
            if (liczba > max) {
                max = liczba;
            }
            if (liczba < min) {
                min = liczba;
            }
        }

        suma = max + min;
        double srednia = (max + min) / 2.0;
        System.out.println("Suma min i max: " + suma);
        System.out.println("Średnia: " + srednia);
    }
}
6.import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba = (int) (Math.random() * 100) + 1;
        int próba;
        
        System.out.println("Zgadnij liczbę z zakresu 1-100!");
        
        while (true) {
            System.out.print("Podaj swoją liczbę: ");
            próba = scanner.nextInt();
            
            if (próba > liczba) {
                System.out.println("Podałeś za dużą wartość");
            } else if (próba < liczba) {
                System.out.println("Podałeś za małą wartość");
            } else {
                System.out.println("Gratulacje! Zgadłeś liczbę!");
                break;
            }
        }
    }
}
7.import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj znak do rysowania prostokąta: ");
        char znak = scanner.next().charAt(0);
        System.out.print("Podaj współrzędne x i y lewego górnego rogu: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.print("Podaj długości boków a i b: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = 0; i < y; i++) {
            System.out.print(" ");
        }

        for (int i = 0; i < b; i++) {
            System.out.print(znak);
        }
        System.out.println();
    }
}
8.import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wysokość choinki: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
9.
import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        int n = scanner.nextInt();
        
        int sumaCyfr = 0;
        int sumaParzystych = 0;
        int sumaNieparzystych = 0;
        int liczbaParzystych = 0;
        int liczbaNieparzystych = 0;
        
        while (n > 0) {
            int cyfra = n % 10;
            sumaCyfr += cyfra;
            if (cyfra % 2 == 0) {
                sumaParzystych += cyfra;
                liczbaParzystych++;
            } else {
                sumaNieparzystych += cyfra;
                liczbaNieparzystych++;
            }
            n /= 10;
        }
        
        double sredniaParzystych = liczbaParzystych == 0 ? 0 : (double) sumaParzystych / liczbaParzystych;
        double sredniaNieparzystych = liczbaNieparzystych == 0 ? 0 : (double) sumaNieparzystych / liczbaNieparzystych;
        
        System.out.println("Suma cyfr: " + sumaCyfr);
        System.out.println("Średnia arytmetyczna cyfr parzystych: " + sredniaParzystych);
        System.out.println("Średnia arytmetyczna cyfr nieparzystych: " + sredniaNieparzystych);
    }
}
10.import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int n = scanner.nextInt();
        
        System.out.print("Dzielniki liczby " + n + ": ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
11.import java.util.Scanner;

public class SprawdzLiczbePierwsza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Podaj liczbę całkowitą n (n > 1): ");
        int n = scanner.nextInt();

        
        if (n <= 1) {
            System.out.println("Liczba musi być większa niż 1.");
            return;
        }

     
        boolean jestPierwsza = true;

        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                // Jeśli znajdziemy dzielnik to liczba nie jest pierwsza
                jestPierwsza = false;
                break;
            }
        }

        
        if (jestPierwsza) {
            System.out.println("Liczba " + n + " jest liczbą pierwszą.");
        } else {
            System.out.println("Liczba " + n + " nie jest liczbą pierwszą.");
        }
    }
}
*/
