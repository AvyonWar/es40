import java.util.ArrayList;


public class Month {
    public enum ListMonth {January, February, March, April, May, June, July, August, September, October, November, December}


    public static void main(String[] args) {

        for (ListMonth month : ListMonth.values()) {
            if (month.toString().endsWith("y") || month.toString().endsWith("Y")) {
                System.out.println(month + ": ends with y");
            } else {
                System.out.println(month + ": does not end with y");
            }
        }
    }
}


