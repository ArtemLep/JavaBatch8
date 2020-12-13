package com.syntax.class35;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelFileHandlingDemo3 {
    public static void main(String[] args) throws IOException {
        //Break till 12:30
        String path = "C:\\Users\\Owner\\eclipse-workspace\\JavaBatch8\\src\\com\\syntax\\class35\\Test.xlsx";
        System.out.println(path);
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheet("Sheet2");
        Row row= sheet.getRow(1);
        Cell cell=row.getCell(2);
        cell.setCellValue("Artem");
        System.out.println(cell);
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        workbook.write(fileOutputStream);
    }
}