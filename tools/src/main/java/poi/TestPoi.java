package poi;

import org.apache.poi.xssf.usermodel.XSSFRow;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by jeremy on 2016/7/14.
 */
public class TestPoi
{
    //private final static String FILE_ROOT_PATH = "D:\\poi-excel\\";
    private final static String EXCEL_2003_SUFFIX = "xls";

    static XSSFRow row;

    public static void main(String[] args)
    {

//        String urlTest = "http://static.gomro.cn/market/c5da6ccc-ef9c-3661-5375-5e6a8d83279c.xls";
//
//        String filePath = "http://static.gomro.cn/market/61cd3d07-23a9-4614-da91-80764dffd293.xls";
//
//        //readExcel(fileName);
//        List<GoodsBean> list = new GoodsExcelReader().read(filePath);
//        if (list != null)
//        {
//            for (GoodsBean goods:list){
//                System.out.println(goods.getName()+"|"+goods.getModel()+"|"+goods.getSpec()+"|"+goods.getPrice()+"|"+goods.getDescript());
//            }
//        }
        //String url = "http:\/\/static.gomro.cn\/market\/b87a9adc-5278-a38d-722e-746f46f8e15f.xls";
        Date test = new Date();

        Date test1 = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(test);

        System.out.println(test+"===="+format);

    }

}