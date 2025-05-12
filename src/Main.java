public class Main {
    public static void main(String[] args) {

        System.out.println("Task # 1");

        int savings = 15000;
        int piggyBank = 0;
        int month = 0;
        while (piggyBank < 2459000) {
            piggyBank = piggyBank + savings;
            month++;
            System.out.println("Месяц " + (month++) + " сумма накоплений равна " + piggyBank + " рублей");
        }

        System.out.println("Task # 2");

        int increase = 0;
        while (increase < 10) {
            increase++;
            System.out.print(increase + " ");
        }
        System.out.println();
        for (; increase >= 1; increase--) {
            System.out.print(increase + " ");
        }
        System.out.println();

        System.out.println("Task # 3");

        int population = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        int year1 = 2025;
        for (int year = year1; year < year1 + 10; year++) {
            population += population * birthRate / 1000 - population * mortality / 1000;
            System.out.println("Год " + year + " численность населения составляет " + population);
        }
        System.out.println("Task # 4");

        int depositAmount = 15000;
        int total = 0;
        int bid = 7;
        while (depositAmount < 12_000_000) {
            depositAmount += depositAmount / 100 * bid;
            total++;
            System.out.println("Месяц " + total + " сумма накоплений = " + depositAmount);
        }

        System.out.println("Task # 5");

        int depositAmount1 = 15000;
        int total1 = 0;
        int bid1 = 7;
        while (depositAmount1 < 12_000_000) {
            depositAmount1 += depositAmount1 / 100 * bid1;
            total1++;
            if (total1 % 6 == 0) {
                System.out.println("Месяц " + total1 + " сумма накоплений = " + depositAmount1);
            }
        }

        System.out.println("Task # 6");
        int depositAmount2 = 15000;
        int bid2 = 7;
        int total2 = 0;
        int times = 12 * 9;
        while (total2 < times) {
            depositAmount2 += depositAmount2 / 100 * bid2;
            total2++;
            if (total2 % 6 == 0)
                System.out.println("Через " + total2 + " месяцев сумма накоплений: " + depositAmount2 + " рублей");
        }

        System.out.println("Task # 7");

        int fridayReport = 7;
        for (int day = fridayReport; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + " -е число. Необходимо подготовить отчет");
        }

        System.out.println("Task # 8");
        int period = 79;
        int seeComet = 0;
        int start = year1 - 200;
        int finish = year1 + 100;
        for (int year = seeComet; year < finish; year += period) {
            if (year > start) {
                System.out.println(year);
            }
        }
    }
}









