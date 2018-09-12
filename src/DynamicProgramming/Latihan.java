package DynamicProgramming;
import java.math.BigInteger;
import java.util.Scanner;
public class Latihan
{
    public static void tampilJudul(String identitas)
    {
        System.out.println("identitas : " + identitas);
        System.out.println("");
        System.out.println("Hitung Fibonanci");
        System.out.println("");
        System.out.println("1, 1, 2, 3, 5, 8, 13, 21, ... dst.");
    }
    
    private static int tampilInput()
    {
        Scanner oi = new Scanner(System.in);
        
        System.out.print("Bilangan ke - : ");
        int n = oi.nextInt();
        
        return n;
    }
    
    private static BigInteger fibo(int n)
    {
        BigInteger[] hasil = new BigInteger[n];
        
        hasil[0] = BigInteger.ONE;
        hasil[1] = BigInteger.ONE;
        
        for (int i = 2; i < n; i++)
        {
            hasil[i] = hasil[i - 1].add(hasil[i - 2]);
        }
        
        return hasil[n - 1];
    }
    
    private static void tampilHasil(int n, BigInteger hasil)
    {
        System.out.println("Bilangan Fibonacci ke- " + n + " : " + hasil);
    }
    
    public static void main(String[] args)
    {
        String identitas = "M. RIFQI ZAKARIYAH / X RPL 3 / No. 20 ";
        
        tampilJudul(identitas);
        int n = tampilInput();
        BigInteger hasil = fibo(n);
        tampilHasil(n, hasil);
    }
    
}
