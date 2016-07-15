package poi;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jeremy on 2016/7/14.
 * http://www.cnblogs.com/hongten/p/java_poi_excel_xls_xlsx.html
 */
public class GoodsExcelReader
{
    public List<GoodsBean> read(String fileName)
    {
        ReadExcel excel =  new ReadExcel();
        HSSFWorkbook wb = (HSSFWorkbook) excel.read(fileName);

        GoodsBean goods = null;
        List<GoodsBean> list  = new ArrayList<GoodsBean>();

        //循环读取表格
        for (int numSheet = 0; numSheet < wb.getNumberOfSheets(); numSheet++)
        {
            HSSFSheet sheet = wb.getSheetAt(numSheet);
            if (sheet == null)
            {
                continue;
            }
            for (int rowNum=0; rowNum<=sheet.getLastRowNum(); rowNum++)
            {
                HSSFRow row = sheet.getRow(rowNum);
                if (row != null)
                {
                    goods = new GoodsBean();
                    HSSFCell name = row.getCell(0);
                    HSSFCell model = row.getCell(1);
                    HSSFCell spec = row.getCell(2);
                    HSSFCell price = row.getCell(3);
                    HSSFCell descript = row.getCell(4);
                    goods.setName(getValue(name));
                    goods.setModel(getValue(model));
                    goods.setSpec(getValue(spec));
                    goods.setPrice(getValue(price));
                    goods.setDescript(getValue(descript));
                    list.add(goods);
                }
            }
        }
        return list;

    }

    private String getValue(HSSFCell cell)
    {
        if(null == cell)
        {
            return "";
        }
        if (cell.getCellType() == Cell.CELL_TYPE_STRING)
        {
            return String.valueOf(cell.getStringCellValue());
        }
        else if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC)
        {
            return String.valueOf(cell.getNumericCellValue());
        }
        return "";
    }
}
