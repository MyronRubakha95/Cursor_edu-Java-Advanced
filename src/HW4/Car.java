package HW4;

public class Car {
    String CarName;
    String CarModify;
    int CarYear;
    int Price;

    @Override
    public String toString() {
        return "Car{" + "CarName='" + CarName + '\'' + ", CarModify='" + CarModify + '\'' + ", CarYear=" + CarYear + ", Price=" + Price + '}';
    }


    public void setCarName(String carName) {
        CarName = carName;
    }

    public void setCarModify(String carModify) {
        CarModify = carModify;
    }

    public void setCarYear(int carYear) {
        CarYear = carYear;
    }

    public void setPrice(int price) {
        Price = price;
    }
}
