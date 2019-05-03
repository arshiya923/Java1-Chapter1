package fasl1.tamrin16;
import java.util.Scanner;
public class Fasl1Tamrin16
{
public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        
        System.out.println("Enter year: ");
        int year=obj.nextInt();
        
        System.out.println("Enter month: ");
        int month=obj.nextInt();
        
        System.out.println("Enter day: ");
        int day=obj.nextInt();
        
        int minInHour=60;
        int minInday=minInHour*24;
        int minInMonth=minInday*30;
        int minInYear=minInday*365;
        
        int yearResult=minInYear*year;
        int monthResult=minInMonth*month;
        int dayResult=minInday*day;
        
        long totalMinute=yearResult+monthResult+dayResult;
        
        System.out.println("result: "+totalMinute);
    }
    
}
