package stkstarter.navigation;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.ibm.icu.impl.Row;
import jxl.Sheet;
import jxl.Workbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelFile {
    public static String emiratesId;
    public static String emailId;
    public static String deal;
    public static String type;
    public static String dealType;
    public static String dataValue, valueAddedOffer, notificationOption;

    public void readExcel(String filePath,String fileName,String sheetName) throws IOException {

        File file = new File(filePath + "\\" + fileName);
        FileInputStream inputStream = new FileInputStream(file);

        //Workbook name is data
        XSSFWorkbook data = null;
        HSSFWorkbook data1=null;
        String fileExtensionName = fileName.substring(fileName.indexOf("."));
        if (fileExtensionName.equals(".xlsx")) {
            //If it is xlsx file then create object of XSSFWorkbook class
            data = new XSSFWorkbook(inputStream);
        }
        else if (fileExtensionName.equals(".xls")) {
            data1 = new HSSFWorkbook(inputStream);
        }

        //Sheet name is stkData
        XSSFSheet stkData = data.getSheet(sheetName);
        XSSFRow row0 = stkData.getRow(0);
        emiratesId= row0.getCell(1).getStringCellValue();

        XSSFRow row1 = stkData.getRow(1);
        deal= row1.getCell(1).getStringCellValue();

        XSSFRow row2 = stkData.getRow(2);
        type= row2.getCell(1).getStringCellValue();

        XSSFRow row3 = stkData.getRow(3);
        dealType= row3.getCell(1).getStringCellValue();

        XSSFRow row4 = stkData.getRow(4);
        dataValue= row4.getCell(1).getStringCellValue();

        XSSFRow row5 = stkData.getRow(5);
        valueAddedOffer= row5.getCell(1).getStringCellValue();

        XSSFRow row6 = stkData.getRow(6);
        emailId= row6.getCell(1).getStringCellValue();

        XSSFRow row7 = stkData.getRow(7);
        notificationOption= row7.getCell(1).getStringCellValue();

        //System.out.println(emiratesIdValue);

    }
    }


