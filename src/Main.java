public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int age = 50;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " лет, то он совешеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + " лет, то он не достиг совершеннолетия, нужно немного подождать.");
        }
        //Задача 2
        System.out.println("Задача 2");
        int outsideTemperature = 2;
        if (outsideTemperature < 5) {
            System.out.println("На улице " + outsideTemperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + outsideTemperature + " градусов, можно идти без шапки.");
        }
        //Задача 3
        System.out.println("Задача 3");
        int speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придётся заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        }
        //Задача 4
        System.out.println("Задача 4");
        int personAge = 25;
        if (personAge >= 2 && personAge <= 6) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в детский сад.");
        } else if (personAge >= 7 && personAge <= 17) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в школу.");
        } else if (personAge >= 18 && personAge <= 24) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в университет.");
        } else {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить на работу.");
        }
        //Задача 5
        System.out.println("Задача 5");
        int childAge = 10;
        if (childAge < 5) {
            System.out.println("Если возраст ребёнка равен " + childAge + ", то ему нельзя кататься на аттракционе.");
        } else if (childAge >= 5 && childAge < 14) {
            System.out.println("Если возраст ребёнка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else {
            System.out.println("Если возраст ребёнка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взростого.");
        }
        //Задача 6
        System.out.println("Задача 6");
        int trainCapacity = 120;
        if (trainCapacity >= 60 && trainCapacity < 102) {
            System.out.println("Есть только стоячие места");
        } else if (trainCapacity >= 102) {
            System.out.println("Мест нет.");
        } else {
            System.out.println("Ещё есть сидячие места.");
        }
        //Задача 7
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (two > one && two < three) {
            System.out.println("two больше чем one.");
        }
        if (three > two && three > one) {
            System.out.println("three больше чем one, и больше чем two.");
        } else {
            System.out.println(" ");
        }
    }
}