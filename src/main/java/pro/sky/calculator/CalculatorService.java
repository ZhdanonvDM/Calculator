package pro.sky.calculator;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String hello () {
        return "Добро пожаловать в калькулятор";
    }
    public Integer plus (Integer n1, Integer n2) throws Exception {
        if (n1 == null || n2 == null) {
            throw new Exception ("Отсутствует один или оба оператора");
        } else {
            return n1+n2;
        }
    }
    public Integer minus (Integer n1, Integer n2)  throws Exception {
        if (n1 == null || n2 == null) {
            throw new Exception ("Отсутствует один или оба оператора");
        } else {
            return n1-n2;
        }
    }
    public Integer multiply (Integer n1, Integer n2) throws Exception {
        if (n1 == null || n2 == null) {
            throw new Exception ("Отсутствует один или оба оператора");
        } else {
            return n1*n2;
        }
    }
    public Integer divide (Integer n1, Integer n2) throws Exception {
        if (n2 == 0) {
            throw new IllegalArgumentException ("Нельзя делить на ноль");
        } else if (n1 == null || n2 == null) {
            throw new Exception ("Отсутствует один или оба оператора");
        }  else {
            return n1 / n2;
        }
    }
}
