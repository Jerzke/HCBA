package com.jerppa.fullstackbackend.data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;




public class CSVReader {
    public static List<data> readDataFromFile(String fileName) {
        File file = new File(fileName);
        List<data> dataList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            boolean isHeader = true; // Add a flag to track if the current line is the header row
            while ((line = reader.readLine()) != null) {
                // Skip the header row
                if (isHeader) {
                    isHeader = false;
                    continue;
                }
                // Split the line by commas and parse the values into a data object
                String[] values = line.split(",");
                data data = new data(
                        values[0],
                        values[1],
                        Integer.parseInt(values[2]),
                        values[3],
                        Integer.parseInt(values[4]),
                        values[5],
                        Double.parseDouble(values[6]),
                        Double.parseDouble(values[7])
                );
                dataList.add(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataList;
    }
}