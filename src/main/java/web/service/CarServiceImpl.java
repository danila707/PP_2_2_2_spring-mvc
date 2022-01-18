package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<Car>();
        cars.add(new Car("1", "Volga", 2020));
        cars.add(new Car("2", "Gaz", 2021));
        cars.add(new Car("3", "Moscvich", 2022));
        cars.add(new Car("4", "Niva", 2023));
        cars.add(new Car("5", "Zil", 2024));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count > 0 && count < cars.size()) {
            return cars.subList(0, count);
        }
        return cars;
    }
}