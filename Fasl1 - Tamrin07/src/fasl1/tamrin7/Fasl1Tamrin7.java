package fasl1.tamrin7;
import java.util.Scanner;
public class Fasl1Tamrin7
{
public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        
        System.out.print("plz enter your height(pond): ");
        double height=obj.nextDouble();
        
        double kg=0.453592*height;
        double gr=453.59237*height;
        
        System.out.println("your height in kg is: "+kg);
        System.out.println("your height in gr is: "+gr);
    }
    
}