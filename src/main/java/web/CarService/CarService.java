package web.CarService;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    public List<Car> getCar(List<Car> c, int a) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            cars.add(c.get(i));
        }
        return cars;
    }
}
