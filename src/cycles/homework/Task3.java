package src.cycles.homework;

/**
 * Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию на позицию Junior Java Developer
 * с зарплатой 600$ в месяц.
 * Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
 * 300$ в месяц Ваня тратит на еду и развлечения.
 * 10% от зарплаты Ваня ежемесячно переводит насчет брокера,
 * чтобы инвестировать в акции с доходностью 2% в месяц.
 * Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.
 * Для интереса: попробовать увеличить процент, которые Ваня инвестирует из своей зарплаты
 */
public class Task3 {

    //    доходы от инвестиции 2 процента в месяц
//    средств на своем счету и на счету брокера за 3 года и 2 месяца.
    public static void main(String[] args) {

        double salary = 600;
        double percentProfitBroker = 0.02;
        double percentBroker = 0.1;
        int year = 3;
        int month = 2;

        System.out.println(isAccountBalance(salary, isSumYearInMonth(year, month), percentBroker));

    }

    public static double isAccountBalance(double salary, int month, double percent) {

        double result = 0;
        double sum = salary;
        double wasteMoney = 300;

        for (int i = 0; i < month; i++) {

            if (i == 6) {
                sum += 400;
            }

            result += (sum - (sum * percent) - wasteMoney);

        }
        return result;
    }

    public static double isAccountBalanceBroker(double salary, int month, double percent) {

        double result = 0;
        double sum = salary;


        for (int i = 0; i < month; i++) {

            if (i == 6) {
                sum += 400;
            }

            result += sum;
            result += result * percent;

        }
        return result;
    }

    public static int isSumYearInMonth(int year, int month) {
        return year * 12 + month;
    }
}
