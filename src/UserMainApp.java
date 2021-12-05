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
        bartek.getFullName();
        bartek.getAllData();

        //System.out.println(bartek.firstName + " " + bartek.lastName);
        //System.out.println(bartek.email + " " + bartek.isAdult + " " + bartek.age);


        User tomek = new User();
        tomek.firstName = "Tomek";
        tomek.lastName = "Bestowy";
        tomek.email = "tom@test.pl";
        tomek.isAdult = false;
        tomek.age = 8;
        tomek.getFullName();
        tomek.getAllData();
        //System.out.println(tomek.firstName + " " + tomek.lastName);
        //System.out.println(tomek.email + " " + tomek.isAdult + " " + tomek.age);
    }
}
