package ComparableandComparator;

import java.util.Arrays;
import java.util.Comparator;

public class MainY {
    public static void main(String[] args) {
        Cars bmw = new Cars("BMW", 5000, true, 4);
        Cars bmwCoupe = new Cars("BMW", 5500, true, 2);
        Cars vw_TUGIUN = new Cars("VW", 3000, false, 4);
        Cars VAZ2114 = new Cars("VAZ", 1000, false, 4);
        Cars VAZ2108 = new Cars("VAZ", 1000, false, 2);
        Cars VW_polo = new Cars("VW", 1000, false, 2);
        Cars[] cars = {bmw, bmwCoupe, VAZ2114, vw_TUGIUN, VAZ2108,VW_polo};
        //COMPARABLE
//        Arrays.sort(cars);
//        System.out.println(Arrays.toString(cars));
//        /comparator
        Arrays.sort(cars, new ComparatorByPrice());
        for (Cars carx : cars) {
            System.out.println(carx.toString());
        }
        System.out.println("Sort by price is ended");
        System.out.println();

//        Arrays.sort(cars,new ComparatorByDoors());
//        for (Cars carx : cars) {
//            System.out.println(carx.toString());
//
//        }
//        System.out.println("Sort by doors is ended");
        Arrays.sort(cars, (o1, o2) -> ((Cars) o1).getDoors() - ((Cars) o2).getDoors());
        for (Cars carx : cars) {
            System.out.println(carx.toString());

        }

        System.out.println("Sort by doors is ended");

        //under w/out lyambda
//        Arrays.sort(cars, new Comparator<Cars>() {
//            @Override
//            public int compare(Cars o1, Cars o2) {
//                return ((Cars) o1).getDoors() - ((Cars) o2).getDoors();
//            }
//        });
        Arrays.sort(cars,new ComparatorByName());
        for (Cars carx : cars) {
            System.out.println(carx.toString());
        }
        System.out.println("Sort by name is ended");

    }
}
