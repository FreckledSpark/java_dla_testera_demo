public class ZadanieDomowe {

    public static void main(String[] args) {
        int numberOne = 2;
        int numberTwo = 2;
        int numberTree = 2;
        int numberFour =2;

        if((numberOne + numberTwo) % 2 == 0) {
            System.out.println("jestem liczba parzysta");
        } else {
            System.out.println("nie jesyem liczba parzysta");
        }

        if((numberTree + numberFour) % 2 == 0) {
            System.out.println("jestem liczba parzysta");
        } else {
            System.out.println("nie jesyem liczba parzysta");
        }

        if(((numberOne + numberTwo) + (numberTree + numberFour)) % 2 == 0) {
            System.out.println("wszystkie liczby sa parzyste");
        } else {
            System.out.println("nie wszystkie liczby sa parzyste");
        }

        if(((numberOne + numberTwo) % 2 == 0) && ((numberTree + numberFour) % 2 == 0)) {
            System.out.println("wszystkie liczby sa parzyste");
        } else {
            System.out.println("nie wszystkie liczby sa parzyste");
        }

    }
}
