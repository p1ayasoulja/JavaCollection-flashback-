package ComparableandComparator;

import java.util.Comparator;

public class Cars implements Comparable<Cars> {
    private String brand;
    private int price;
    private boolean isLike;
    private int doors;

    public Cars(String brand, int price, boolean isLike, int doors) {
        this.brand = brand;
        this.price = price;
        this.isLike = isLike;
        this.doors = doors;
    }

    public int getPrice() {
        return price;
    }

    public int getDoors() {
        return doors;
    }

    public String getBrand() {
        return brand;
    }

    public Cars(Cars cars) { //clone
        this.brand = cars.brand;
        this.price = cars.price;
        this.isLike = cars.isLike;
        this.doors = cars.doors;
    }

    @Override
    public String toString() {
        return "Car : " +
                "brand is '" + brand + '\'' +
                ", price is '" + price + '\'' +
                ", is everyOne like it? - " + isLike +
                ", number of doors is " + doors +
                '}';
    }

    @Override
    //compare by price->doors if impl Comparable<>
//    public int compareTo(Object o) {
//        int tmp = this.price - ((Cars) o).price;
//        if (tmp == 0) {
//            return this.doors - ((Cars) o).doors;
//        } else return tmp;
//}}
    //if implements Comparable<Cars>
    public int compareTo(Cars newCar) {
        return this.brand.compareTo(newCar.brand);
    }
}

class ComparatorByPrice implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Cars) o1).getPrice() - ((Cars) o2).getPrice();
    }
}

//class ComparatorByDoors implements Comparator {
//    @Override
//    public int compare(Object o1, Object o2) {
//        return ((Cars) o1).getDoors() - ((Cars) o2).getDoors();
//    }
//}
class ComparatorByName implements Comparator<Cars>{
    @Override
    public int compare(Cars o1, Cars o2) {
        String brand1=o1.getBrand();
        String brand2=o2.getBrand();
        return brand1.compareTo(brand2);
    }
}
