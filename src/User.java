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

    void getLastNameAdnAge() {
        System.out.println(lastName + " - " + age);
    }

    void getPersonalizeEmail() {
        System.out.println(firstName + "." + lastName + age + "@gmail.com");
    }

    int getUserAge() {
        return age;
    }

    boolean isUserAdult() {
        if(age >= 18){
            return true;
        } else {
            return false;
        }
    }

    void greeting(String name) {
        System.out.println("Hi " + name + ". Nice to see you!");
    }

    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void howOldAreYou(String name, int userAge) {
        System.out.println("Hi " + name + ". You are " + userAge + " years old!");
    }

    int youAgePlus10(int userAge) {
        return userAge + 10;
    }
}
