public class User {

    //1. POLA OBIEKTU
    // OPISUJA Z CZEGO BEDZIE SKLADAL SIE DANY OBIEKT

    String firstName; //null
    String lastName; //null
    String email;
    int age; //0
    boolean isAdult; //false

    //metody
    // co bedzie dany obiekt robic
    //zwracany typ + nazwa metody

    void getFullName() {
        System.out.println(firstName + " " + lastName);
    }

    void getAllData() {
        System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + isAdult);
    }
}
