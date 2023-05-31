package com.TokenInspector.Token_Inspector.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.TokenInspector.Token_Inspector.Model.CarRegistrationDetails;
import com.TokenInspector.Token_Inspector.Repository.CarRepository;

@Controller
public class CarRegController {
    @Autowired
    CarRepository thirdService;
    
    @GetMapping("/car")
    public String car(Model model) {

        model.addAttribute("info", new CarRegistrationDetails());
        return "CarRegistration";
    }

    @PostMapping("/postcardata")
    public String postdata(@ModelAttribute CarRegistrationDetails detail){
        thirdService.save(detail);
        return "redirect:/carinfo";
    }

    @GetMapping("/carinfo")
    public ModelAndView showCarInfo(@RequestParam(required = false) String plateNumber) {
        ModelAndView m1 = new ModelAndView("CarInformation");
        if (plateNumber != null) {
            m1.addObject("cinfo", thirdService.findCarRegistrationDetailsByPlateNumber(plateNumber));
        } else {
            m1.addObject("cinfo", thirdService.findAll());
        }
        return m1;
    }

    @GetMapping("/generateTokenNumber/{carId}")
    public String generateTokenNumber(@PathVariable long carId) {
        int min=1000;
        int max=2000;
        String tokenNumber = String.format("%04d", (int)Math.floor(Math.random()*(max-min+1)+min));
        CarRegistrationDetails car = this.thirdService.findById(carId).get();
        car.setTokenNumber(tokenNumber);
        this.thirdService.save(car);
        /*thirdService.generateTokenNumber(cardId);*/
        return "redirect:/carinfo";
    }
}
