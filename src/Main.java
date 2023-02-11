public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();


    }

    public static void task1() {
        System.out.println("Задача 1");
        int meseo = 15000;
        int s = 0;
        int i = 0;
        while (s <= 2_459_000) {
            s = s + meseo;
            i++;
            System.out.println("Месяц - " + i + " сумма накоплений равна " + s + " рублей ");
        }


    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }


    }

    public static void task3() {
        System.out.println("Задача 3");
        int totalPeple = 12_000_000;
        int partPeaple = 17;
        int deathPeaple = 8;
        int pip = partPeaple - deathPeaple;
        for (int i = 1; i < 10; i++) {
            int plusPeple = totalPeple * (partPeaple - deathPeaple) / 1000;
            totalPeple += plusPeple;
            System.out.println("Год" + i + " численность населения составляет" + totalPeple);

        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        double summa = 15000;
        int i = 0;
        while (summa <= 12_000_000) {
            summa = summa + (summa * 0.07);
            i++;
            System.out.print(summa + " денег в " + i + " месяце");
            System.out.println(" ");
        }
        System.out.println(i + " - суммарное количество месяцев");
    }


    public static void task5() {
        System.out.println("Задача 5");
        double summa = 15000;
        int i = 0;
        while (summa <= 12_000_000) {
            summa = summa + (summa * 0.07);
            i++;
            if (i % 6 == 0) {


                System.out.print(summa + " денег в " + i + " месяце");
                System.out.println(" ");
            }
        }
        System.out.println(i + " - суммарное количество месяцев");
    }


    public static void task6() {
        System.out.println("Задача 6");
        double summa = 15000;
        int i = 1;
        while (i <= 9 * 12) {
            summa = summa + (summa * 0.07);
            i++;
            if (i % 6 == 0) {
                System.out.print(summa + " денег в " + i + " месяце");
                System.out.println(" ");
            }


        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday = 3;
        while (friday < 31) {
            System.out.println("Сегодня пятница, " + friday + "е число. Необходимо подготовить отчет");
            friday += 7;
        }


    }

    public static void task8() {
        System.out.println("Задача 8");
        int star_t = 2323 - 200;
        int end = 2023 + 100;
        for (  int year= star_t; star_t<= end; year++ ){
            if (year%79==0){
                System.out.println(year);
            }
        }
    }
}


