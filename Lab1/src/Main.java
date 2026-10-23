import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Zad1(scan);
        Zad2(scan);
        Zad3(scan);
        Zad4(scan);
        Zad5();
        Zad6(scan);
        Zad7();
    }

    private static void Zad1(Scanner scan)
    {
        System.out.print("Podaj bok A: ");
        int a = scan.nextInt();

        System.out.print("Podaj bok B: ");
        int b = scan.nextInt();

        System.out.print("Pole wynosi: " + (a*b));
    }

    private static void Zad2(Scanner scan)
    {
        System.out.print("Podaj bok A: ");
        int bokA = scan.nextInt();

        System.out.print("Podaj bok B: ");
        int bokB = scan.nextInt();

        System.out.print("Podaj bok C: ");
        int bokC = scan.nextInt();

        try {
            if ((bokA + bokB < bokC) || (bokA + bokC < bokB) || (bokB + bokA < bokA))
            {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e)
        {
            System.out.println("Taki trójkąt nie może istnieć");
        }

        double v = Math.pow(bokA, 2) + Math.pow(bokB, 2);

        if(v > Math.pow(bokC, 2))
        {
            System.out.println("Powstały trójkąt jest ostrokątny");
        }
        else if(v < Math.pow(bokC, 2))
        {
            System.out.println("Powstały trójkąt jest rozwartokątny");
        }
        else {
            System.out.println("Powstały trójkąt jest prostokątny");
        }
    }

    private static void Zad3(Scanner scan)
    {
        try {
            System.out.print("Podaj bok A: ");
            double a = scan.nextDouble();

            if(a == 0)
            {
                throw new IllegalArgumentException("To nie jest równanie kwadratowe");
            }


            System.out.print("Podaj bok B: ");
            double b = scan.nextDouble();

            System.out.print("Podaj bok C: ");
            double c = scan.nextDouble();

            double delta = Math.pow(b, 2) - 4 * a * c;

            if (delta < 0)
            {
                throw new Exception("Brak pierwiastków");
            }

            double deltaSqrt = Math.sqrt(delta);

            if (delta == 0)
            {
                double sqrt = -b / (2*a);
                System.out.println("Pierwiastek" + sqrt);
            }
            else
            {
                double sqrt1 = (-b - deltaSqrt)/ (2*a);
                double sqrt2 = (-b + deltaSqrt) / (2*a);
                System.out.println("Pierwiastek 1: " + sqrt1);
                System.out.println("Pierwiastek 2: " + sqrt2);

            }
        } catch (IllegalArgumentException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    private static void Zad4(Scanner scan)
    {
        Random rand = new Random();

        System.out.print("Podaj wielkość zbioru: ");
        int liczba = scan.nextInt();

        List<Integer> list = new ArrayList<>();

        System.out.print("Wylosowane: ");
        int suma = 0;

        for(int i = 0; i < liczba; i++)
        {
            int wylosowana = rand.nextInt(1, 100);
            list.add(wylosowana);
            suma += wylosowana;
        }

        for(int item : list)
        {
            System.out.print(item + " ");
        }
        System.out.println();

        int max = Collections.max(list);
        int min = Collections.min(list);
        int avg = suma / liczba;
        System.out.println("Wartość maksymalna: " + max);
        System.out.println("Wartość minimalna: " + min);
        System.out.println("Wartość średnia: " + avg);
    }

    private static void Zad5()
    {
        for(int i = 1; i < 11; i++)
        {
            for (int j = 1; j < 11; j++)
            {
                System.out.printf("%-3d", i * j);
            }
            System.out.println();
        }
    }

    private static void Zad6(Scanner scan)
    {
        System.out.print("Podaj bok A: ");
        int a = scan.nextInt();

        System.out.print("Podaj bok B: ");
        int b = scan.nextInt();

        Prostokat p1 = new Prostokat(a,b);

        System.out.print(p1.Pole());
    }

    private static void Zad7()
    {
        Energia en = new Energia(100, 150);

        double obecny = en.getStanObecny();
        double poczatkowy = en.getStanPoczatkowy();
        double zuzycie = en.GetZuzycie();
    }
}