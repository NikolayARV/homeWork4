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
        int age2 = 15;
        if (age2 >= 24) {
            System.out.println("Человек закончил университет и ему пора искать первую работу");

        }
        if (age2 < 24 && age2 >= 18) {
            System.out.println("Человек закончил школу и может отправляться в университет");
        }

        if (age2 < 18 && age2 >= 7) {
            System.out.println("Ребенок ходит в школу");
        }
        System.out.println("Задача 3");
        int vollum = 70;
        if (vollum <= 60) {
            System.out.println("В вагоне есть сидячее место");
        }
        if (vollum > 60) {
            System.out.println("В вагоне есть стоячее место");
        }
        if (vollum > 102) {
            System.out.println("В вагоне мест нет");
        }
        System.out.println("Задача 1.1");
        int age3 = 19;
        if (age3 >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил");
        }
        System.out.println("Задача 2.1");
        int age4 = 24;
        if (age4 >= 7 && age4 <= 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age4 >= 18 && age4 <= 24) {
            System.out.println("Человек закончил школу и может отправляться в университет");
        } else {
            System.out.println("Человек закончил университет и ему пора искать первую работу");
        }
        System.out.println("Задача 3.1");
        int vollum1 = 103;
        if (vollum1 <= 60) {
            System.out.println("В вагоне есть сидячее место");
        }
        if (vollum1 < 103) {
            System.out.println("В вагоне есть стоячее место");
        } else {
            System.out.println("В вагоне мест нет");
        }
        System.out.println("Задание 7");
        int age7 = 25;
        if (age7 >= 2 && age7 <= 6) {
            System.out.println("Если возраст человека " + age7 + " , то ему нужно ходить в детский сад");
        }
        if (age7 >= 7 && age7 <= 18) {
            System.out.println("Если возраст человека " + age7 + " , то ему нужно ходить в школу");
        }
        if (age7 >= 18 && age7 <= 24) {
            System.out.println("Если возраст человека " + age7 + " , то его место в университете");
        } else if (age7 > 24) {
            System.out.println("Если возраст человека " + age7 + " , то ему пора ходить на работу");
        }
        System.out.println("Задание 8");
        int age8 = 13;
        boolean adultIsHier = true;
        if (age8 < 5) {
            System.out.println("Детям младше 5 лет ещё нельзя кататься на атракционах");
        }
        else if (age8 > 14) {
            System.out.println("Ты можешь кататься без сопровождения взрослого");
        }  else if (age8 >= 5 && age8 <= 14 && adultIsHier)
        {
            System.out.println("Ты можешь кататься только в сопровождении взрослого");
        }
        else {
            System.out.println("Если взрослого нет, кататься нельзя");
        }


        System.out.println("Задание 9");
        int one = 5;
        int two = 19;
        int free = 23;
        if (one > two && one > free){
            System.out.println("Большее число one.");
        } else if (two > one && two > free){
            System.out.println("Большее число two.");
        }
        else {
            System.out.println("Большее число free.");
        }

    }
}