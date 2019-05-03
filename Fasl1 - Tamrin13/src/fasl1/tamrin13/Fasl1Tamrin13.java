package fasl1.tamrin13;
import java.util.Scanner;
public class Fasl1Tamrin13
{
public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        
        System.out.println("plz enter count: ");
        int count=obj.nextInt();
        
        int baKartoon=count/6;
        int biKartoon=count%6;
        
        System.out.println("ba kartoonha: "+baKartoon);
        System.out.println("bi kartoonha: "+biKartoon);
    }
    
}
