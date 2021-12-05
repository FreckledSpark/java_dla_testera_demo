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
        bartek.getLastNameAdnAge();
        bartek.getPersonalizeEmail();
        System.out.println(bartek.getUserAge());
        int userAge = bartek.getUserAge(); //przypisanie do zmiennej
        System.out.println(userAge); //wyswietlenie zmiennej

        boolean userAdult = bartek.isUserAdult();
        System.out.println("czy bartek jest dorosly: " + userAdult);


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
        tomek.getLastNameAdnAge();
        tomek.getPersonalizeEmail();
        System.out.println(tomek.getUserAge());

        boolean isTomekAdult = tomek.isUserAdult();
        System.out.println("czy tomek jest dorosly: " + userAdult);
        //System.out.println(tomek.firstName + " " + tomek.lastName);
        //System.out.println(tomek.email + " " + tomek.isAdult + " " + tomek.age);
    }
}
