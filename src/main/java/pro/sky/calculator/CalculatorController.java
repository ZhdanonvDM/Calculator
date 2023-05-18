package pro.sky.calculator;

import org.springframework.lang.Nullable;
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
 @Nullable
    public String plus (@RequestParam(value = "num1", required = false)  Integer n1, @RequestParam(value = "num2", required = false) Integer n2) throws Exception {
      //  String s = calculatorService.plus(n1,n2);
        return n1 + " + " + n2 + " = " + calculatorService.plus(n1,n2);
    }
    @RequestMapping(path =   "/minus")
    public String minus (@RequestParam(value = "num1", required = false)  Integer n1, @RequestParam(value = "num2", required = false) Integer n2 )  throws Exception {
        return n1 + " - " + n2 + " = " + calculatorService.minus(n1,n2);
    }
    @RequestMapping(path =   "/multiply")
    public String multiply (@RequestParam(value = "num1", required = false)  Integer n1, @RequestParam(value = "num2", required = false) Integer n2) throws Exception  {
        return n1 + " * " + n2 + " = " + calculatorService.multiply(n1,n2);
    }
    @RequestMapping(path =   "/divide")
    public String divide (@RequestParam(value = "num1", required = false)  Integer n1, @RequestParam(value = "num2", required = false) Integer n2) throws Exception {
        return n1 + " / " + n2 + " = " + calculatorService.divide(n1,n2);
    }


}








