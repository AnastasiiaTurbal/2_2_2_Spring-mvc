package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDaoImpl;
import web.servise.CarService;

@RequestMapping("/cars")
@Controller
public class CarsController {

    private CarService carService;
    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String returnCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("cars", carService.returnSomeCars(count));
        return "cars/";
    }

    @GetMapping("/quantity")
    public String returnCarsQuantity(Model model) {
        model.addAttribute("carsQuantity", carService.returnQuantityOfCars());
        return "cars/quantity";
    }
}
