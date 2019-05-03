package fasl1.tamrin15;
import java.util.Scanner;
public class Fasl1Tamrin15
{
public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        
        System.out.println("orange kg: ");
        double kg=obj.nextDouble();
        
        System.out.println("orange qeymat: ");
        double qeymat=obj.nextDouble();
        
        double percent=qeymat*10/100;
        
        double high=(qeymat+percent)*kg;
        double low=(qeymat-percent)*kg;
        
        System.out.println("high qeymat: "+high);
        System.out.println("low qeymat: "+low);
    }   
}