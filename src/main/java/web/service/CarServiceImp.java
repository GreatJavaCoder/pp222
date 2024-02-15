package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService{
    private List<Car> cars = new ArrayList<>();

    public CarServiceImp() {
        cars.add(new Car("car1", 111, "black"));
        cars.add(new Car("car2", 222, "white"));
        cars.add(new Car("car3", 333, "grey"));
        cars.add(new Car("car4", 444, "red"));
        cars.add(new Car("car5", 555, "green"));
    }

    @Override
    public List<Car> getCarList(Integer count) {
        if (count == null) { return cars; }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}