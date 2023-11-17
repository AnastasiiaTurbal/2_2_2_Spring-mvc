package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao{
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("model1", "series1", 1));
        cars.add(new Car("model2", "series2", 2));
        cars.add(new Car("model3", "series3", 3));
        cars.add(new Car("model4", "series4", 4));
        cars.add(new Car("model5", "series5", 5));
    }

    public List<Car> getCars(int count) {
        return cars.stream().limit(count).toList();
    }

    public int countCars() {
        return cars.size();
    }

}
