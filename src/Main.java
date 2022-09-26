public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Задача 1");
        int age = 16;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил");
        }
        System.out.println("Задача 2");
        int age2 = 9;
        if (age2 >= 7) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age2 >= 18) {
            System.out.println("Человек закончил школу и может отправляться в университет");
        }
        if (age2 >= 24) {
            System.out.println("Человек закончил университет и ему пора искать первую работу");
        }

    }
}