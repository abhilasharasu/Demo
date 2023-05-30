import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_data {
	public static void main(String[] args) throws IOException 
 {
		//step1
		FileInputStream fis = new FileInputStream("./excel/data.xlsx");
		Workbook book = WorkbookFactory.create(fis);
	}

}
