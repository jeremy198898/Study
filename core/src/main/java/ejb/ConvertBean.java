package ejb;

import javax.ejb.Stateless;
import java.math.BigDecimal;

/**
 * Created by jeremy on 2016/6/7.
 */
@Stateless(mappedName = "Converter")
public class ConvertBean {

    private final BigDecimal yuanRate =  new BigDecimal("6.5689");

    //private final BigDecimal euroRate =  new BigDecimal("0.134");

    public BigDecimal yuanToDollar(BigDecimal yuan){
        BigDecimal result = yuan.divide(yuanRate);

        return result.setScale(2, BigDecimal.ROUND_UP);
    }

    public String sayHello(){
        return "Welcome to my EJB world!";
    }
}
