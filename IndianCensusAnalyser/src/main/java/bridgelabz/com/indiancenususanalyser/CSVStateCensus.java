package bridgelabz.com.indiancenususanalyser;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * A class responsible for reading Indian State Census data from a CSV file.
 */
public class CSVStateCensus 
{
	 /**
     * @desc This method reads the state census data from a CSV file and converts it into a list of StateCensusData objects.
     * It assumes that the values in the second column ("StateName") are already enclosed in double quotes.
     * @params csvFilePath The path to the CSV file containing state census data.
     * @throws IOException  If an I/O error occurs while reading the file.
     * @throws CsvException If an error occurs while processing the CSV file.
     * @returns A list of StateCensusData objects representing the loaded data.
     */
    public List<StateCensusData> loadCensusData(String csvFilePath) throws IOException, CsvException {
        List<StateCensusData> censusDataList = new ArrayList<>();

        try {
            // Create a CSVReader for reading the CSV file
            CSVReader csvReader = new CSVReader(new FileReader(csvFilePath));

            // Read all data into a list of arrays
            List<String[]> data = csvReader.readAll();

            // Use an iterator to process each row
            Iterator<String[]> iterator = data.iterator();
            iterator.next(); // Skip header row

            while (iterator.hasNext()) {
                String[] row = iterator.next();

                // Extract values from the row
                int srNo = Integer.parseInt(row[0]);
                String stateName = row[1];  // Assumes that the values in the second column are already enclosed in double quotes
                int tin = Integer.parseInt(row[2]);
                String stateCode = row[3];

                // Create a StateCensusData object for each row and add it to the list
                StateCensusData censusData = new StateCensusData(srNo, stateName, tin, stateCode);
                censusDataList.add(censusData);
            }

            // Close the CSVReader
            csvReader.close();
        } catch (IOException | CsvException e) {
            e.printStackTrace();
            throw e; // Rethrow the exception to the calling method
        }

        return censusDataList;
    }

}
