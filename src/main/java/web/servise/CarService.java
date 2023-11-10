package web.servise;

import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {
    CarDao carDao = new CarDaoImpl();
    public List<Car> returnSomeCars(int count) {
        return carDao.returnSomeCars(count);
    }

    public int returnQuantityOfCars() {
        return carDao.returnQuantityOfCars();
    }
}
