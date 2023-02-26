import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача1");
        int wanted = 2_459_000;
        int inMonth = 15_000;
        int initially = 0;
        int month = 1;
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        while (initially <= wanted) {
            initially = initially + inMonth;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + numberFormat.format(initially) + " рублей");
            month++;
        }
    }

    public static void task2() {
        System.out.println("Задача2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        i = i - 1;
        System.out.println();
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача3");
        int population = 12_000_000;
        int fertilityThousand = 17;
        int mortalityThousand = 8;
        int years = 10;
        for (int year = 1; year <= years; year++) {
            population = population + population * fertilityThousand / 1000 - population * mortalityThousand / 1000;
            System.out.println("Год " + year + " , численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача4");
        int wanted = 12_000_000;
        double sum = 15_000;
        int month = 1;
        double monthlyPercent = 0.07;
        while (sum <= wanted) {
            sum = sum * (1 + monthlyPercent);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " , сумма накоплений равна " + sum + " рублей");
            }
            month++;
        }
    }

    public static void task6() {
        System.out.println("Задача6");
        double sum = 15_000;
        int months = 12 * 9;
        double monthlyPercent = 0.07;
        for (int month = 1; month <= months; month++) {
            sum = sum * (1 + monthlyPercent);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " , сумма накоплений равна " + sum + " рублей");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача7");
        int firstFridayInMonth = 3;
        for (int friday = firstFridayInMonth; friday <= 31; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }
    }

    public static void task8() {
        System.out.println("Задача8");
        int firstFlightYear = 0;
        int period = 79;
        int currentYear = 2023;
        int start = currentYear - 200;
        int end = currentYear + 100;
        for (int year = firstFlightYear; year <= end; year+=period) {
            if (year >= start) {
                System.out.println(year);
            }
        }
    }
}