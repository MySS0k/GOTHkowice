/*
1.import random


tablica = [random.randint(-10, 10) for _ in range(10)]


print("Wylosowane liczby:")
print(" ".join(map(str, tablica)))

minimum = min(tablica)
maksimum = max(tablica)
print(f"Min: {minimum}, Max: {maksimum}")


srednia = sum(tablica) / len(tablica)
print(f"Średnia: {srednia:.2f}")


mniejsze = sum(1 for x in tablica if x < srednia)
wieksze = sum(1 for x in tablica if x > srednia)
print(f"Mniejszych od śr.: {mniejsze}")
print(f"Większych od śr.: {wieksze}")


print("Liczby w odwrotnej kolejności:")
print(" ".join(map(str, reversed(tablica))))

2.import random

tablica = [random.randint(1, 10) for _ in range(20)]

print("Wylosowane liczby:")
print(" ".join(map(str, tablica)))

wystapienia = {i: 0 for i in range(1, 11)}
for liczba in tablica:
    wystapienia[liczba] += 1

print("\nWystąpienia:")
for liczba in range(1, 11):
    print(f"{liczba}: {wystapienia[liczba]}")


3.import java.util.Random;

public class Macierz {
    public static void main(String[] args) {

        int[][] macierz = new int[5][5];
        Random random = new Random();
        

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                macierz[i][j] = random.nextInt(11) - 5; // Losowanie liczby z zakresu -5 do 5
            }
        }
        

        System.out.println("Macierz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(macierz[i][j] + "\t");
            }
            System.out.println();
        }

        int[] minima = new int[5];
        int[] maksima = new int[5];
        

        for (int j = 0; j < 5; j++) {
            minima[j] = macierz[0][j];
            maksima[j] = macierz[0][j];
            for (int i = 1; i < 5; i++) {
                if (macierz[i][j] < minima[j]) {
                    minima[j] = macierz[i][j];
                }
                if (macierz[i][j] > maksima[j]) {
                    maksima[j] = macierz[i][j];
                }
            }
        }
        

        System.out.println("\nMinima dla każdej kolumny:");
        for (int i = 0; i < 5; i++) {
            System.out.print(minima[i] + "\t");
        }
        System.out.println();
        
        System.out.println("\nMaksima dla każdej kolumny:");
        for (int i = 0; i < 5; i++) {
            System.out.print(maksima[i] + "\t");
        }
    }
}
4.import java.util.Scanner;

public class LiczbaBinarnie {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        int liczba = scanner.nextInt();
        
        int[] bity = new int[32];
        
        boolean isNegative = liczba < 0;
        
        if (isNegative) {
            liczba = Math.abs(liczba);
        }


        int i = 0;
        while (liczba > 0) {
            bity[i] = liczba % 2;
            liczba = liczba / 2;
            i++;
        }
        

        System.out.print("Liczba " + (isNegative ? "-" : "") + " binarnie: ");

        if (isNegative) {
            System.out.print("1.");
        } else {
            System.out.print("0.");
        }

        boolean leadingZero = true;
        for (int j = i - 1; j >= 0; j--) {
            if (bity[j] == 1) {
                leadingZero = false;
            }
            if (!leadingZero) {
                System.out.print(bity[j]);
            }
        }
        

        if (isNegative) {
            System.out.print("1");
        }
    }
}

5.
 import java.util.Scanner;

public class LiczbaBinarnieZU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        


        System.out.print("Podaj liczbę całkowitą: ");
        int liczba = scanner.nextInt();


        int[] bity = new int[32];
        int[] bityZU1 = new int[32];
        int[] bityZU2 = new int[32];


        boolean isNegative = liczba < 0;
        

        int absLiczba = isNegative ? Math.abs(liczba) : liczba;
        

        int i = 0;
        while (absLiczba > 0) {
            bity[i] = absLiczba % 2;
            absLiczba = absLiczba / 2;
            i++;
        }


        int[] tempZU1 = new int[32];
        for (int j = 0; j < 32; j++) {
            tempZU1[j] = (bity[j] == 0) ? 1 : 0; // Inwersja bitów
        }
        

        int[] tempZU2 = new int[32];
        System.arraycopy(tempZU1, 0, tempZU2, 0, 32);  // Przypisanie uzupełnienia do jedynki do uzupełnienia do dwóch
        int carry = 1;
        for (int j = 31; j >= 0; j--) {
            if (tempZU2[j] == 0 && carry == 1) {
                tempZU2[j] = 1;
                carry = 0;
                break;
            } else if (tempZU2[j] == 1 && carry == 1) {
                tempZU2[j] = 0;
            }
        }

        System.out.println("\nReprezentacje liczby: " + liczba);

        System.out.print("ZM: ");
        System.out.print(isNegative ? "1." : "0.");
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(bity[j]);
        }
        System.out.println();

        System.out.print("ZU1: ");
        System.out.print(isNegative ? "1." : "0.");
        boolean leadingZeroZU1 = true;
        for (int j = 31; j >= 0; j--) {
            if (tempZU1[j] == 1) {
                leadingZeroZU1 = false;
            }
            if (!leadingZeroZU1) {
                System.out.print(tempZU1[j]);
            }
        }
        System.out.println();

        System.out.print("ZU2: ");
        System.out.print(isNegative ? "1." : "0.");
        boolean leadingZeroZU2 = true;
        for (int j = 31; j >= 0; j--) {
            if (tempZU2[j] == 1) {
                leadingZeroZU2 = false;
            }
            if (!leadingZeroZU2) {
                System.out.print(tempZU2[j]);
            }
        }
        System.out.println();
    }
}
6. 
import java.util.Scanner;

public class LiczbyWZapisach {
    

    public static int[] zmToZu1(int liczba) {
        int[] bityZU1 = new int[32];
        int absLiczba = Math.abs(liczba);
        
        int i = 0;
        while (absLiczba > 0) {
            bityZU1[i] = absLiczba % 2;
            absLiczba = absLiczba / 2;
            i++;
        }
        

        for (int j = 0; j < 32; j++) {
            bityZU1[j] = (bityZU1[j] == 0) ? 1 : 0;
        }
        return bityZU1;
    }


    public static int[] zmToZu2(int liczba) {
        int[] bityZU2 = zmToZu1(liczba);

        int carry = 1;
        for (int i = 31; i >= 0; i--) {
            if (bityZU2[i] == 0 && carry == 1) {
                bityZU2[i] = 1;
                carry = 0;
                break;
            } else if (bityZU2[i] == 1 && carry == 1) {
                bityZU2[i] = 0;
            }
        }
        return bityZU2;
    }


    public static int zu2ToInt(int[] bityZU2) {
        int liczba = 0;
        int potega = 1;
        for (int i = 0; i < 32; i++) {
            liczba += bityZU2[i] * potega;
            potega *= 2;
        }
        return liczba;
    }


    public static int zu1ToInt(int[] bityZU1) {
        // Inwersja bitów dla ZU1 do uzyskania liczby
        for (int i = 0; i < 32; i++) {
            bityZU1[i] = (bityZU1[i] == 0) ? 1 : 0;
        }
        

        int carry = 1;
        for (int i = 31; i >= 0; i--) {
            if (bityZU1[i] == 0 && carry == 1) {
                bityZU1[i] = 1;
                carry = 0;
                break;
            } else if (bityZU1[i] == 1 && carry == 1) {
                bityZU1[i] = 0;
            }
        }
        
        return zu2ToInt(bityZU1);
    }


    public static int zmToInt(int[] bityZM, boolean isNegative) {
        int liczba = 0;
        int potega = 1;
        for (int i = 0; i < 32; i++) {
            liczba += bityZM[i] * potega;
            potega *= 2;
        }
        return isNegative ? -liczba : liczba;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę całkowitą: ");
        int liczba1 = scanner.nextInt();
        System.out.print("Podaj drugą liczbę całkowitą: ");
        int liczba2 = scanner.nextInt();


        boolean isNegative1 = liczba1 < 0;
        boolean isNegative2 = liczba2 < 0;

        int[] zm1 = new int[32];
        int[] zm2 = new int[32];
        int[] zu1_1 = zmToZu1(liczba1);
        int[] zu1_2 = zmToZu1(liczba2);
        int[] zu2_1 = zmToZu2(liczba1);
        int[] zu2_2 = zmToZu2(liczba2);

        System.out.println("\nReprezentacje w różnych kodach:");
        System.out.println("Liczba 1 (ZM): " + liczba1);
        System.out.println("Liczba 2 (ZM): " + liczba2);

        System.out.println("Liczba 1 (ZM): " + liczba1);
        System.out.println("Liczba 2 (ZM): " + liczba2);
        System.out.println("ZU1 liczby 1: " + zu1_1);
        System.out.println("ZU1 liczby 2: " + zu1_2);
        System.out.println("ZU2 liczby 1: " + zu2_1);
        System.out.println("ZU2 liczby 2: " + zu2_2);
        
        System.out.println("Wyniki dodawania:");
        System.out.println("Dodawanie liczb w ZM: " + (liczba1 + liczba2));

        int sumaZU1 = zu1ToInt(zu1_1) + zu1ToInt(zu1_2);
        System.out.println("Dodawanie liczb w ZU1: " + sumaZU1);

        int sumaZU2 = zu2ToInt(zu2_1) + zu2ToInt(zu2_2);
        System.out.println("Dodawanie liczb w ZU2: " + sumaZU2);

        System.out.println("Wyniki odejmowania:");
        System.out.println("Odejmowanie liczb w ZM: " + (liczba1 - liczba2));

        int roznicaZU1 = zu1ToInt(zu1_1) - zu1ToInt(zu1_2);
        System.out.println("Odejmowanie liczb w ZU1: " + roznicaZU1);

        int roznicaZU2 = zu2ToInt(zu2_1) - zu2ToInt(zu2_2);
        System.out.println("Odejmowanie liczb w ZU2: " + roznicaZU2);
    }
}
7. import java.util.Scanner;

public class BoothMultiplication {

    public static String boothMultiply(int number1, int number2) {
        int n = 32;  

        String result = "";
        

        int[] A = new int[n];
        int[] Q = new int[n];
        int Q_1 = 0;
        

        String binNum1 = Integer.toBinaryString(number1);
        String binNum2 = Integer.toBinaryString(number2);
        
        while (binNum1.length() < n) binNum1 = "0" + binNum1; 
        while (binNum2.length() < n) binNum2 = "0" + binNum2; 
        
 
        for (int i = 0; i < n; i++) {
            A[i] = 0;
            Q[i] = binNum2.charAt(i) == '1' ? 1 : 0;
        }

  
        for (int i = 0; i < n; i++) {

            if (Q[n - 1] == 0 && Q_1 == 1) {

                addAtoQ(A, Q);
            } else if (Q[n - 1] == 1 && Q_1 == 0) {

                subtractAfromQ(A, Q);
            }


            Q_1 = Q[n - 1];
            shiftRight(A, Q);
        }


        for (int i = 0; i < n; i++) {
            result += A[i];
        }

        for (int i = 0; i < n; i++) {
            result += Q[i];
        }

        return result;
    }


    public static void addAtoQ(int[] A, int[] Q) {
        int carry = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            int sum = A[i] + Q[i] + carry;
            Q[i] = sum % 2;
            carry = sum / 2;
        }
    }


    public static void subtractAfromQ(int[] A, int[] Q) {
        int borrow = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            int diff = Q[i] - A[i] - borrow;
            if (diff < 0) {
                Q[i] = diff + 2;
                borrow = 1;
            } else {
                Q[i] = diff;
                borrow = 0;
            }
        }
    }

    public static void shiftRight(int[] A, int[] Q) {
        int Qn_1 = Q[Q.length - 1];
        for (int i = Q.length - 1; i > 0; i--) {
            Q[i] = Q[i - 1];
        }
        Q[0] = A[A.length - 1];
        for (int i = A.length - 1; i > 0; i--) {
            A[i] = A[i - 1];
        }
        A[0] = Qn_1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Podaj pierwszą liczbę: ");
        int number1 = scanner.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int number2 = scanner.nextInt();


        String result = boothMultiply(number1, number2);


        System.out.println("Wynik mnożenia: " + result);
    }
}
8. 
public class DivisionMethods {


    public static int divisionCompare(int dividend, int divisor) {
        int quotient = 0;
        int remainder = Math.abs(dividend);
        divisor = Math.abs(divisor);
        
        while (remainder >= divisor) {
            remainder -= divisor;
            quotient++;
        }
        

        if (dividend < 0 && divisor < 0 || dividend > 0 && divisor > 0) {
            return quotient;
        } else {
            return -quotient;
        }
    }


    public static int divisionNonRestorative(int dividend, int divisor) {
        int quotient = 0;
        int remainder = Math.abs(dividend);
        divisor = Math.abs(divisor);
        
        for (int i = 31; i >= 0; i--) {
            remainder <<= 1;
            if ((remainder >>> 31) == 1) {
                remainder -= divisor;
                quotient |= (1 << i);
            }
        }
        

        if (dividend < 0 && divisor < 0 || dividend > 0 && divisor > 0) {
            return quotient;
        } else {
            return -quotient;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj dzielną: ");
        int dividend = scanner.nextInt();
        System.out.print("Podaj dzielnik: ");
        int divisor = scanner.nextInt();


        int quotientCompare = divisionCompare(dividend, divisor);
        System.out.println("Wynik dzielenia metodą porównawczą: " + quotientCompare);


        int quotientNonRestorative = divisionNonRestorative(dividend, divisor);
        System.out.println("Wynik dzielenia metodą nierestytucyjną: " + quotientNonRestorative);
    }
}
*/
