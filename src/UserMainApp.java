public class UserMainApp {

    public static void main(String[] args) {
        //o to jest klasa
        //z czego sklada sie klasa

        //typ nazwa = nowy obirkt;

        User bartek = new User();
        bartek.firstName = "Bartek";
        bartek.lastName = "Testowy";
        bartek.email = "tes@test.pl";
        bartek.isAdult = true;
        bartek.age = 28;
        System.out.println(bartek.firstName);
        System.out.println(bartek.email);
        System.out.println(bartek.isAdult);

        User tomek = new User();
        tomek.firstName = "Tomek";
        tomek.lastName = "Bestowy";
        tomek.email = "tom@test.pl";
        tomek.isAdult = false;
        tomek.age = 8;
        System.out.println(tomek.email);
        System.out.println(tomek.isAdult);
    }
}
