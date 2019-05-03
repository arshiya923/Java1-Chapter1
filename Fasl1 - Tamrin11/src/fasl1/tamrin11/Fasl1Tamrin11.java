package fasl1.tamrin11;
import java.util.Scanner;
public class Fasl1Tamrin11
{
public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        
        System.out.print("plz enter tool: ");
        double tool=obj.nextDouble();
        
        System.out.print("plz enter arz: ");
        double arz=obj.nextDouble();
        
        double mohit=(tool+arz)*2;
        double masahat=tool*arz;
        
        System.out.println("mohit= "+mohit);
        System.out.println("masahat= "+masahat);
    }
    
}