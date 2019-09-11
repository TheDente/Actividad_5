import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class funciones {

int year;

public void whatyear(){

    Scanner entrada = new Scanner(System.in);
    System.out.print("Especifica un año:");
    year = entrada.nextInt();

}

public void bisiesto(){

    GregorianCalendar calendar = new GregorianCalendar();
 
    if (calendar.isLeapYear(year))
        System.out.println("El año es bisiesto");
    else
        System.out.println("El año no es bisiesto");


}




}