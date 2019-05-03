package fasl1.tamrin17;
import java.util.Scanner;
public class Fasl1Tamrin17
{
public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        
        System.out.print("plz enter zel: ");
        double zel=obj.nextDouble();
        
        double masahatMoraba=zel*zel;
        double masahatDayere=3.14*(zel/2)*(zel/2);
        
        double ezafe=masahatMoraba-masahatDayere;
        double vaznEzafe=ezafe*20;
        
        System.out.println("vazne door riz: "+vaznEzafe+"gram");
    }
    
}
