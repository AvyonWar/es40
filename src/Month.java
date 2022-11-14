import java.util.ArrayList;

/**
 * l'es. chiede di stampare solo un mese,
 * Ma se io volessi usare un IF/ELSE per stampare tuuti i mesi con vicino l'apposita scritta,
 *     es.
 *     January ends with y,
 *     February ends with y,
 *     March doesn't end with y,
 *     ecc...
 * come faccio?
 */
public class Month {
   // public enum ListMonth {January, February, March, April, May, June, July, August, September, October, November, December}

    public static void main(String[] args) {
        String[] listMonth = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println(listMonth[0] + " - " + listMonth[1] + " - " + listMonth[4] + " - " + listMonth[6] +  " - ends with y");
        System.out.println(listMonth[2] + " - " + listMonth[3] + " - " + listMonth[5] + " - " + listMonth[7] + " - " + listMonth[8] + " - " + listMonth[8] + " - " + listMonth[10] + " - " + listMonth[11] + " - doesn't end with y");



       /* ListMonth listMonth = ListMonth.April;

        switch (listMonth){
            case January:
                System.out.println(listMonth + " ends with y");
                break;
            case  February:
                System.out.println(listMonth + " ends with y");
                break;
            case  March:
                System.out.println(listMonth + " doesn't end with y");
                break;
            case  April:
                System.out.println(listMonth + " doesn't end with y");
                break;
            case  May:
                System.out.println(listMonth + " ends with y");
                break;
            case  June:
                System.out.println(listMonth + " doesn't end with y");
                break;
            case July :
                System.out.println(listMonth + " ends with y");
                break;
            case  August:
                System.out.println(listMonth + " doesn't end with y");
                break;
            case  September:
                System.out.println(listMonth + " doesn't end with y");
                break;
            case  October:
                System.out.println(listMonth + " doesn't end with y");
                break;
            case  November:
                System.out.println(listMonth + " doesn't end with y");
                break;
            case  December:
                System.out.println(listMonth + " doesn't end with y");
                break;
        }*/
    }
}
