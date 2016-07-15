package poi;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ReadExcel
{
    private final static String EXCEL_2003_SUFFIX = "xls";
    private final static String EXCEL_2007_SUFFIX = "xlsx";
    private final static String FILE_ROOT_PATH = "D:\\poi-excel\\";

    private Workbook wb = null;

    public Workbook read(String fileName)
    {
        FileInputStream inputStream = null;
        inputStream = readExcelToStream(fileName);

        if (inputStream != null)
        {
            try
            {
                if (isXLSX(fileName))
                {
                    wb = new XSSFWorkbook(inputStream);
                }
                else if(isXLS(fileName))
                {
                    wb = new HSSFWorkbook(inputStream);
                }
                return wb;
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

        }
        return wb;
    }

    private FileInputStream readExcelToStream(String fileName)
    {
        FileInputStream inputStream = null;
        try
        {
            inputStream = new FileInputStream(FILE_ROOT_PATH + fileName);
            return inputStream;
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public boolean isXLSX(String fileName)
    {
        boolean isExcel2007 = false;
        if (fileName.endsWith(EXCEL_2007_SUFFIX))
        {
            isExcel2007 = true;
        }
        return isExcel2007;
    }

    public boolean isXLS(String fileName)
    {
        boolean isExcel2003 = false;
        if (fileName.endsWith(EXCEL_2003_SUFFIX))
        {
            isExcel2003 = true;
        }
        return isExcel2003;
    }

}
