import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by jeremy on 2016/7/14.
 */
public class Test
{
    import org.apache.poi.hssf.usermodel.HSSFWorkbook;
    import org.apache.poi.ss.usermodel.Workbook;

    import java.io.FileInputStream;
    import java.io.FileNotFoundException;
    import java.io.IOException;

    /**
     * Created by jeremy on 2016/7/14.
     */
    public class Test
    {
        private final static String FILE_ROOT_PATH = "D:\\poi-excel\\";
        private final static String EXCEL_2003_SUFFIX = "xls";

        public static void main(String[] args)
        {
            String fileName = "test-x.xls";
            //FileInputStream fis = readFile("test.xlsx");
            String filepath = FILE_ROOT_PATH+fileName;

            readExcel(fileName);
        }

        private static FileInputStream readFile(String fileName)
        {
            try
            {
                FileInputStream fileInputStream = new FileInputStream(FILE_ROOT_PATH+fileName);
                return fileInputStream;
            }
            catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }
            return null;
        }

        private static void readExcel(String fileName)
        {
            Workbook wb = null;
            boolean isExcel2003 = false;
            FileInputStream inputStream = readFile(fileName);
            if (fileName.endsWith(EXCEL_2003_SUFFIX))
            {
                isExcel2003 = true;
            }
            try
            {
                if (isExcel2003 == true)
                {
                    //HSSF － 提供读写Microsoft Excel XLS格式档案的功能
                    wb = new HSSFWorkbook(inputStream);
                    //wb = new XSSF
                }

            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

        }
    }
}
