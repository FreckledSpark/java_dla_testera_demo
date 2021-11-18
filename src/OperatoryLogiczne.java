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


        //instrukcje sterujacace pomaga okreslic jaka czesc kod powinna byc wykonana przy jakim warunku

        if (true) {
            System.out.println("Jestem kodem z ifa - true");
        }

        if (numOne < numTwo) {
            System.out.println("number one is less than number two");
        } else { //w przeciwnym razie
            System.out.println("number one is gerater than number two");
        }

        //Instrukcja sterujaca "switch"

        String homePage = "Home";
        String loaginPage = "Login";
        String contactPage = "Contact";

        String page = homePage;

        switch (page) {
            case "Home":
                System.out.println("przelaczam sie do strony home");
                break;
            case "Login":
                System.out.println("przelaczam sie do strony login");
                break;
            case "Contact":
                System.out.println("przelaczam sie do strony contact");
                break;
            default:
                System.out.println("Nie znam takiej strony");

        }

        //Nazwy klas PascalCase (duza i duza)
        //User, SuperUser, AdminUser

        //zmienne i metody camelCase (mala i duza)
        // superUser

        String superUser = "jestem super user";
        int number = 10;
        boolean isTrue = true;

        //formatowanie kodu alt+com +l

        //operator modulo to operator reszty z dzielenia (modulo to %) ile wartosci miesci sie w jakiejs wartosci plus wyswietlamy reszta ktora zostaje

        System.out.println(10 % 5);
        System.out.println(10 % 3);
        System.out.println(10 % 4);

        if(9 % 2 == 0) {
            System.out.println("nie jestem liczba parzysta");
        } else {
            System.out.println("nie jesyem liczba parzysta");
        }

    }
}
