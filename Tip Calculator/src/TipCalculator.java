
import java.util.Scanner;


public class TipCalculator {

private static Scanner d;
public static void main(String[] args) {


d = new Scanner(System.in);


System.out.println("Enter in bill amount: ");

double e = d.nextFloat();


double cost = fifteenpercent(e);

System.out.println("This is the fifteen percent amount of your bill " + cost);


}


public static double fifteenpercent(double tip1) {

double fifteen;

fifteen = (.15 * tip1) + tip1;

return fifteen;

}


public static double twentypercent(double tip2){

double twenty;

twenty = (.20 * tip2) + tip2;

return twenty;

}


}