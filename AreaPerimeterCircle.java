import java.util.Scanner;

public class AreaPerimeterCircle {
    public static void main (String[]args)
    {

        float radius, area, perimeter;
        final float PI = 3.14f;
        Scanner r = new Scanner (System.in);

        System.out.println ("Informe o valor do raio do círculo");
        radius = r.nextFloat ();

        area = PI * (radius * radius);
        perimeter = 2 * PI * radius;

        System.out.println ("A área do círculo vale " + area);
        System.out.println ("O perímetro do círculo vale " + perimeter);
    }
}
