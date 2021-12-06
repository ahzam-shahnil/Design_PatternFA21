import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class LanternFish {
    public static void main(String[] args) {

        int[] array = {3,4,3,1,2};
        List<Integer> cars = new ArrayList<Integer>();
        for( int s : array )
        {
            cars.add(s);
        }
        int days=0;
        int nextDay=0;
        while (days<2){
            for (int i = 0; i < cars.size(); i++) {
                if (cars.get(i)==0) {
                    cars.set(i,Integer.parseInt("6"));

                    cars.add(8);
                    continue;

                }

                cars.set(i, cars.get(i)- Integer.parseInt("1"));

            }

            days++;
        }
        for (Integer car : cars){
            System.out.print(car);
        }
    }
}
