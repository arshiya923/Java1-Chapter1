package fasl1.tamrin14;
import java.util.Scanner;
public class Fasl1Tamrin14
{
public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        
        System.out.print("plz enter hour: ");
        int hour=obj.nextInt();
        
        System.out.print("plz enter minute: ");
        int minute=obj.nextInt();
        
        int day=24*60;
        int hourToMinute=hour*60;
        int result=day-(hourToMinute+minute);
        
        System.out.println("Minute to 24:00 : "+result);
    }
    
}
