package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.CarService.CarService;
import web.model.Car;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {
    @GetMapping("/car")
    String getCarList(Model model,
                      @RequestParam(value = "count", required = false) String count1) {
        int count;
        if (count1 == null) {
            count = 5;
        } else {
            count = Integer.parseInt(count1);
        }
        List<Car> cars1 = Arrays.asList(
                new Car("BMW", "Lux", 5),
                new Car("VAZ", "WWW", 1),
                new Car("AUDI", "SSS", 2),
                new Car("OPEL", "TTT", 231),
                new Car("SUZUKI", "Grand Vitara", 2)
        );
        CarService carService = new CarService();
        List<Car> cars2 = count >= 5 ? carService.getCar(cars1, 5) : carService.getCar(cars1, count);
        model.addAttribute("something", "Car table");
        model.addAttribute("car", cars2);
        return "car";
    }
}
