package junitcalculatorv3;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter mm value: ");
        Integer mmValue = scan.nextInt();
        System.out.println("Enter cm value: ");
        Integer cmValue = scan.nextInt();
        System.out.println("Enter dm value: ");
        Integer dmValue = scan.nextInt();
        System.out.println("Enter m value: ");
        Integer mValue = scan.nextInt();
        System.out.println("Enter km value: ");
        Integer kmValue = scan.nextInt();

        JUnitCalculator jUnitCalculator = new JUnitCalculator(mmValue, cmValue, dmValue, mValue, kmValue);

        jUnitCalculator.additionMM(mmValue,cmValue,dmValue,mValue,kmValue);

        jUnitCalculator.additionCM(mmValue,cmValue,dmValue,mValue,kmValue);

        jUnitCalculator.additionDM(mmValue,cmValue,dmValue,mValue,kmValue);

        jUnitCalculator.additionM(mmValue,cmValue,dmValue,mValue,kmValue);

        jUnitCalculator.additionKM(mmValue,cmValue,dmValue,mValue,kmValue);

    }
}
