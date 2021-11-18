public class OperatoryLogiczne {

    public static void main(String[] args) {

        //Operatory matematyczne (dzialania +,-,*,/)

        System.out.println(10 + 10);
        System.out.println(10 - 10);
        System.out.println(10 * 10);
        System.out.println(10 / 10);

        System.out.println(10 / 4); //to bedzie bez przecinka calkowite

        System.out.println(10.0 / 4.0); //to bedzie z przecinkiem bo sa liczby zmiennoprzecinkowe
        //albo za pomoca zmiennych (double)

        double a = 10;
        double b = 4;

        System.out.println(a / b);

        //Operatory porownania (czy jest taka sama/ rowna/ rozna

        int numOne = 1;
        int numTwo = 2;

        System.out.println(numOne > numTwo);
        System.out.println(numTwo > numOne);
        System.out.println(numOne == numTwo); // czy jest rowna prawda/fausz
        System.out.println(numOne != numTwo); // czy jest rozne

        //operatory logiczne and/ or cos i cos i zawsze jest zwrot w postaci boolean
        // || -> lub
        System.out.println(numOne > numTwo || numOne == 1);
        System.out.println(numOne > numTwo || numOne == 1);

        //jak jeden jest spelnieony albo oba to jest true

        //&& - i (obie musza byc prawda)

        System.out.println(numOne < numTwo && numOne == 1);
        System.out.println(numOne > numTwo && numOne == 1);
        System.out.println(numOne > numTwo && numOne != 1);
    }
}
