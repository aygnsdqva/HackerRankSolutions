package HackerRank.interview.week.d3w.Solution;

import java.io.*;

public class CaserCheaper {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String s = bufferedReader.readLine();
        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = caesarCipher(s, k);
        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
    public static String caesarCipher(String s, int k) {

        String ans = "";
        int t =0;
        for(char c : s.toCharArray()){
            if(Character.isLetter(c)){
                if(Character.isUpperCase(c)){
                    t=((int)(c + k-65))%26;

                    ans +=  String.valueOf((char)(t + 65));
                }
                else{
                    if(Character.isLowerCase(c)){
                        t=((int)(c + k-97))%26;

                        ans +=  String.valueOf((char)(t + 97));
                    }
                }
            }


            else{
                ans += c;
            }
        }
        return ans;
    }
}
