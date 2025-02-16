public class Main {
    public static void main(String[] args) {

        System.out.println("Task # 1");

        int savings = 15000;
        int piggyBank = 0;
        int month = 1;
        while (piggyBank <= 2459000) {
            piggyBank = piggyBank + savings;
            System.out.println("Месяц " + (month++) + " сумма накоплений равна " + piggyBank + " рублей");

        }
        System.out.println("Для накопления " + piggyBank + " потребуется " + month + " месяцев");

        System.out.println("Task # 2");

        int increase = 0;
        int decrease = 11;
        while (increase < 10) {
            increase = increase + 1;
            System.out.print(increase + " ");
        }
        System.out.println();
        while (decrease > 1) {
            decrease = decrease - 1;
            System.out.print(decrease + " ");
        }
        System.out.println();

        System.out.println("Task # 3");

        int population = 12_000_000;
        for (int i = 0; i < 10; i++) {
            int birthRate = 17 * population / 1000;
            int mortality = 8 * population / 1000;
            population = population + birthRate - mortality;
            System.out.println("Год " + (i + 1) + " численность населения составляет " + population);
        }
        System.out.println("Task # 4");

        int depositAmount = 15000;
        int total = 0;
        int bid = 7;
        while (depositAmount < 12_000_000) {
            depositAmount = depositAmount + depositAmount / 100 * bid;
            total = total + 1;
            System.out.println("Месяц " + total + " сумма накоплений = " + depositAmount);
        }

        System.out.println("Task # 5");

        int depositAmount1 = 15000;
        int total1 = 0;
        int bid1 = 7;
        while (depositAmount1 < 12_000_000) {
            depositAmount1 = depositAmount1 + depositAmount1 / 100 * bid1;
            total1 = total1 + 1;
            if (total1 % 6 == 0) {
                System.out.println("Месяц " + total1 + " сумма накоплений = " + depositAmount1);
            }
        }

        System.out.println("Task # 6");
// я не разобрался с этим циклом... и заданием в том числе
        int depositAmount2 = 15000;
        int bid2 = 7;
        int time = 108;
        for (int i = 0; i < time; i = i + 6) {
            depositAmount2 = depositAmount2 + depositAmount2 / 100 * bid2;
            System.out.println("Через " + (i + 6) + " месяцев сумма накоплений: " + depositAmount2 + " рублей");
        }


        System.out.println("Task # 7");

        int fridayReport = 1;
        while (fridayReport <= 31) {
            System.out.println("Сегодня пятница, " + fridayReport + " -е число.Необходимо подготовить отчет");
            fridayReport += 7;
        }

        System.out.println("Task # 8");
// и тут я не смог((( судя по всему двойка... и отчисление, не понимаю
        int present = 2025;
        int past = present - 200;
        int future = present + 100;
        while (past < present) {
            System.out.println(past);
            past = past + 79;
        }
        while (present < future) {
            System.out.println(present);
            present = present + 79;
        }
    }
}






