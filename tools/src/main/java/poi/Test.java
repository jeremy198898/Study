package poi;

import org.apache.poi.xssf.usermodel.XSSFRow;

import java.util.List;

/**
 * Created by jeremy on 2016/7/14.
 */
public class Test
{
    private final static String FILE_ROOT_PATH = "D:\\poi-excel\\";
    private final static String EXCEL_2003_SUFFIX = "xls";

    static XSSFRow row;

    public static void main(String[] args)
    {
        String fileName = "goods.xls";
        //FileInputStream fis = readFile("test.xlsx");
        String filepath = FILE_ROOT_PATH+fileName;

        //readExcel(fileName);
        List<GoodsBean> list = new GoodsExcelReader().read(fileName);
        if (list != null)
        {
            for (GoodsBean goods:list){
                System.out.println(goods.getName()+" "+goods.getModel()+" "+goods.getSpec()+" "+goods.getPrice()+" "+goods.getDescript());
            }
        }
    }

}