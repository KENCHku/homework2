import java.util.Random;

public class Main {

    public static void main(String[] args) {


        int age = 20, temperature = 25;


        System.out.println(addition(age, temperature));
        System.out.println(addition(77, 4));
        System.out.println(addition(6, 60));
        System.out.println(addition(89, 78));
        System.out.println(addition(29, 33));
        System.out.println(addition(55, 19));

        System.out.println(addition(generateRandomAge(), temperature));

    }

    public static String addition(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature <= 30 && temperature >= -20) {
            return "можно идти гулять";
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "можно идти гулять";
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return "можно идти гулять";
        } else {
            return "оставайтесь дома";
        }
    }

    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(74) + 1;
    }


}

