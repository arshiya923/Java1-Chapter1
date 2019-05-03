package fasl1.tamrin5;
import java.util.Scanner;
public class Fasl1Tamrin5
{
public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        
        System.out.print("plz enter a size: ");
        double size=obj.nextDouble();
        
        double hajm=size*size*size;
        
        System.out.println("hazm is: "+hajm);
    }
    
}
