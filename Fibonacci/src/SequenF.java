import java.util.ArrayList;
import java.util.Arrays;

public class SequenF {
    public static void main (String[]args){

        //ArrayList<Integer> bocci = new ArrayList<>();



        long[] i = new long[20];

        for(int x = 0;x < i.length; x++){
            if (x == 0) {
                i[x] = 0;
            }
            if (x > 0 && x <= 2) {
                i[x] = 1;
            }
            if (x > 2) {

                i[x] = i[x-1] + i[x -2];
            }
            System.out.println(i[x]);
        }
            }
        }


