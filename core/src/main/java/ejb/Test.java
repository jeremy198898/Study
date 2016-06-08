package ejb;

import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * Created by jeremy on 2016/6/8.
 */
public class Test {

    public static void main(String[] args){
//        ConvertBean cb = new ConvertBean();
//        BigDecimal m = new BigDecimal("9876");
//        BigDecimal x = cb.yuanToDollar(m);
//
//        int xi = cb.add(7,9);
//
//        System.out.println(xi);
        try
        {
            InitialContext ctx = new InitialContext();
            ConvertBean cb = (ConvertBean) ctx.lookup("Converter");
            String name = cb.sayHello();
            System.out.println(name);
        }
        catch (NamingException e)
        {
            e.printStackTrace();
        }

    }

}
