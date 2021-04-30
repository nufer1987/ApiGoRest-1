
package databaseWork;

import java.io.IOException;
import java.time.LocalDate;

public class MyException{


     public static void main(String[] name) {
            int x = 10;
            int y = 2;
            try {
                for (int z = 2; z >= 0; z--) {
                     int ans = x / z;
                    System.out.print(ans+ " ");
                }
            } catch (Exception e1) {
                System.out.println("E1");
            }
        }


    void checkCard(int a) throws RuntimeException{
        System.out.println("a");
    }
    void readCard(int a) throws Exception{
        System.out.println("b");
    }

}
