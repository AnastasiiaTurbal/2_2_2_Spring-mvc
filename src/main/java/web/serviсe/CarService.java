package web.serviсe;

import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Component
public class CarService {
    CarDao carDao = new CarDaoImpl();
    public List<Car> getCars(int count) {
        return carDao.getCars(count);
    }

    public int countCars() {
        return carDao.countCars();
    }
}
