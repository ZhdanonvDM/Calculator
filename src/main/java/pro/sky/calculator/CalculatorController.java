package pro.sky.calculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping (path = "/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public  CalculatorController (CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @RequestMapping(path =   "/")
    public String hello () {
        return calculatorService.hello();
    }
 //   @GetMapping(path = "/calculator/plus")
 @RequestMapping(path =   "/plus")
    public String plus (@RequestParam("num1") String n1, @RequestParam("num2") String n2) throws Exception {
        return calculatorService.plus(n1,n2);
    }
    @RequestMapping(path =   "/minus")
    public String minus (@RequestParam("num1") String n1, @RequestParam("num2") String n2)  throws Exception {
        return calculatorService.minus(n1,n2);
    }
    @RequestMapping(path =   "/multiply")
    public String multiply (@RequestParam("num1") String n1, @RequestParam("num2") String n2) throws Exception  {
        return calculatorService.multiply(n1,n2);
    }
    @RequestMapping(path =   "/divide")
    public String divide (@RequestParam("num1") String n1, @RequestParam("num2") String n2) throws Exception {
        return calculatorService.divide(n1,n2);
    }


}








