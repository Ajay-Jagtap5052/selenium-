package include_Exclude;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class DataP1 {
	@DataProvider
	public String[][]login(){
		String[][]data=null;
		try {
			FileInputStream fis=new FileInputStream("../MAVEN_PROJECT/testdemo1.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			int rows=wb.getSheet("sheet12").getLastRowNum();
			int cell=wb.getSheet("sheet2").getRow(0).getLastCellNum();
			data=new String[rows][cell];
			for(int i=0;i<rows;i++) {
				for
			}
		}
		
	}

}
