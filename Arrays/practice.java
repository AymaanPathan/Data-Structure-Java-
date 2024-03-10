import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class practice {
    public static void main(String[] args) {
        // Create a new Workbook
        try (Workbook workbook = new XSSFWorkbook()) {
            // Create a Sheet
            Sheet sheet = workbook.createSheet("Sheet1");

            // Create data rows
            Object[][] data = {
                    { "Name", "Age", "City" },
                    { "John", 30, "New York" },
                    { "Alice", 25, "London" },
                    { "Bob", 35, "Paris" }
            };

            // Write data to the Sheet
            int rowNum = 0;
            for (Object[] rowData : data) {
                Row row = sheet.createRow(rowNum++);
                int colNum = 0;
                for (Object field : rowData) {
                    Cell cell = row.createCell(colNum++);
                    if (field instanceof String) {
                        cell.setCellValue((String) field);
                    } else if (field instanceof Integer) {
                        cell.setCellValue((Integer) field);
                    }
                }
            }

            // Write the workbook to a file
            try (FileOutputStream outputStream = new FileOutputStream("data.xlsx")) {
                workbook.write(outputStream);
                System.out.println("Excel file written successfully.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
