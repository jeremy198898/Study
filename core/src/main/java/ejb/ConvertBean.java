package ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import java.math.BigDecimal;

/**
 * Created by jeremy on 2016/6/7.
 */
@Stateless
@LocalBean
public class ConvertBean {

    private final BigDecimal yuanRate =  new BigDecimal("6.5689");

    //private final BigDecimal euroRate =  new BigDecimal("0.134");

    public BigDecimal yuanToDollar(BigDecimal yuan){
        BigDecimal result = yuan.divide(yuanRate, 2, BigDecimal.ROUND_HALF_UP);
        return result;
    }

    public int add(int a , int b){
        return a+b;
    }

    public String sayHello(){
        return "Welcome to my EJB world!";
    }
}
