package fasl1.tamrin8;
import java.util.Scanner;
public class Fasl1Tamrin8
{
public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        
        System.out.print("plz enter your age: ");
        int age=obj.nextInt();
        
        int minute=60;
        int hour=minute*60;
        int day=hour*24;
        double year=day*365.25;
        
        double result=year*age;
        
        System.out.println("your heartbit is: "+result);
    }
    
}