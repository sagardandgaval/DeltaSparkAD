package cm.org.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/spark")
public class DeltaSparkController {

    @RequestMapping(value = "/taxiData", method = RequestMethod.GET)
    public void readData(){

    }

}
