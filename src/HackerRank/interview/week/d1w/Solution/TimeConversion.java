package HackerRank.interview.week.d1w.Solution;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String time=scanner.nextLine();
        System.out.println(timeConversion(time));
        
    }
    public static String timeConversion(String s) {
        String updatedS = s.substring(0, s.length()-2);
        StringBuilder sb = new StringBuilder();
        String[] time = updatedS.split(":");

        if(s.contains("AM")) {
            if(time[0].contains("12")) {
                time[0] = time[0].replace("12", "00");
            }
        }

        if(s.contains("PM")) {
            if(!time[0].contains("12")) {
                time[0] = String.valueOf((Integer.parseInt(time[0]) + 12)) ;

            }
        }

        for(int i=0; i<time.length;i++) {
            sb.append(time[i]);
            if(i<time.length-1) {
                sb.append(":");
            }
        }

        return sb.toString();
    }
}
