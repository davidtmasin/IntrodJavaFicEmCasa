import java.util.Scanner;
public class SumTwoNumbers {

    public static void main (String[]args){
        int number_1, number_2, result;

        Scanner parcel = new Scanner (System.in);

        System.out.println ("Digite o primeiro número: ");
        number_1 = parcel.nextInt();

        System.out.println ("Digite o segundo número: ");
        number_2 = parcel.nextInt();

        result = number_1 + number_2;
        System.out.println ("O resultado da soma vale: " + result);
    }

}
