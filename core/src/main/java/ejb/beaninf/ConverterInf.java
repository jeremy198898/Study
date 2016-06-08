package ejb.beaninf;

import javax.ejb.Remote;
import java.math.BigDecimal;

/**
 * Created by jeremy on 2016/6/8.
 */
@Remote
public interface ConverterInf {
    public BigDecimal yuanToDollar(BigDecimal yuan);
}
