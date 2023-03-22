package pro.sky.calculator;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String hello () {
        return "Добро пожаловать в калькулятор";
    }
    public String summ (String n1, String n2) throws Exception {
        if (n1.equals("") || n2.equals("")) {
            throw new Exception ("Отсутствует один или оба оператора");
        } else {
            return n1 + " + " + n2 + " = " + String.valueOf(Integer.valueOf(n1) + Integer.valueOf(n2));
        }
    }
    public String minus (String n1, String n2)  throws Exception {
        if (n1.equals("") || n2.equals("")) {
            throw new Exception ("Отсутствует один или оба оператора");
        } else {
            return n1 + " - " + n2 + " = " + String.valueOf(Integer.valueOf(n1) - Integer.valueOf(n2));
        }
    }
    public String multiply (String n1, String n2) throws Exception {
        if (n1.equals("") || n2.equals("")) {
            throw new Exception ("Отсутствует один или оба оператора");
        } else {
            return n1 + " * " + n2 + " = " + String.valueOf(Integer.valueOf(n1) * Integer.valueOf(n2));
        }
    }
    public String divide (String n1, String n2) throws Exception {
        if (n2.equals("0")) {
            throw new Exception ("Нельзя делить на ноль");
        } else if (n1.equals("") || n2.equals("")) {
            throw new Exception ("Отсутствует один или оба оператора");
        }  else {
            return n1 + " / " + n2 + " = " + String.valueOf(Integer.valueOf(n1) / Integer.valueOf(n2));
        }
    }
}
