package com.company;
import java.util.Scanner;
public class Main {
    //funkcja do zzadania 1
    //sprawdza czy dana 1 liczba nalezy do przedziału 13...19jesli tak daje true
    static boolean SprwadzJednoTeen(int a, int b)
    {
        if ((a <= 19 && a >= 13) && (b <= 19 && b >= 13))
            return false;
        if (a <= 19 && a >= 13) return true;
        if (b <= 19 && b >= 13) return true;
        return false;
    }
    //funkcja do zadania 2
    //sprawdza czy dana liczba jest 13 jeśli jest to do daanej liczzby bez niej jest liczona suma, jak nie to wszystkie liczby są liczone
    static int LiczenieSumy(int a, int b, int c)
    {
        if (a != 13 && b != 13 && c != 13) return a + b + c;
        else if (a == 13) return 0;
        else if (b == 13) return a;
        else
            return a + b;
    }

    public static void main(String[] args) {
	// write your code here
        //wykoniwanie funkcji
        //zmienne do zadań
        int a1, b1,a2,b2, c2,suma=0;
        int[] tab;
    Scanner odczyt = new Scanner(System.in);
         int wielkosctab;
        //zadanie 1
        //prosba o liczby
        System.out.println("prosze poadc licze a:");
        a1 = odczyt.nextInt();
        System.out.println("prosze poadc licze b:");
        b1 = odczyt.nextInt();
        //sprawdzamy czy się zgadza

        if (SprwadzJednoTeen(a1, b1) == true) System.out.println("teen");
        //zadanie 2
        System.out.println("prosze poadc licze a:");
        a2 = odczyt.nextInt();
        System.out.println("prosze poadc licze b:");
        b2 = odczyt.nextInt();
        System.out.println("prosze poadc licze c:");
        c2 = odczyt.nextInt();
        //ruchamiamy funkcję liczącą
        suma = LiczenieSumy(a2, b2, c2);
        System.out.println("suma wynosi " + suma);
        //zad 3
        //sprawdza czy w tablicy jest ciąg liczb 1,2,3. Jeśli jest daje wynik true
        System.out.println("prosze poadc wielkosc tablicy (najlepiej do 30):");
        wielkosctab = odczyt.nextInt();
        tab= new int[wielkosctab];
        for(int i=0;i<wielkosctab;i++)
        {
            System.out.println("prosze poadc licze : "+i);
            tab[i] = odczyt.nextInt();
        }

        //wywoływanie pętli sprawzającej
        for (int i = 0; i < wielkosctab - 2; i++)
        {
            if ((tab[i] == 1) && (tab[i + 1] == 2) && (tab[i + 2] == 3)) System.out.println("True");

        }
    }
    }

