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
public class CSVStateCensus {

    // Assuming these are the expected column names in the CSV file
    private static final String[] EXPECTED_COLUMN_NAMES = {"SrNo", "StateName", "TIN", "StateCode"};

    /**
     * @desc This method reads the state census data from a CSV file and converts it into a list of StateCensusData objects.
     * It assumes that the values in the second column ("StateName") are already enclosed in double quotes.
     *
     * @param csvFilePath The path to the CSV file containing state census data.
     * @return A list of StateCensusData objects representing the loaded data.
     * @throws IOException           If an I/O error occurs while reading the file.
     * @throws CsvException          If an error occurs while processing the CSV file.
     * @throws InvalidCensusDataException If the CSV file has an invalid header.
     */
    public List<StateCensusData> loadCensusData(String csvFilePath) throws IOException, CsvException, InvalidCensusDataException {
        List<StateCensusData> censusDataList = new ArrayList<>();

        try (CSVReader csvReader = new CSVReader(new FileReader(csvFilePath))) {
            // Read the header row to check if it has the expected column names
            String[] header = csvReader.readNext();

            if (!isValidHeader(header)) {
                throw new InvalidCensusDataException("Invalid header in the CSV file. Expected columns: " +
                        String.join(", ", EXPECTED_COLUMN_NAMES));
            }

            // Use an iterator to process each row
            Iterator<String[]> iterator = csvReader.iterator();

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
        } catch (IOException | CsvException e) {
            throw e;
        }

        return censusDataList;
    }

    /**
     * Checks if the header columns match the expected column names.
     *
     * @param header The header columns of the CSV file.
     * @return True if the header is valid, false otherwise.
     */
    private boolean isValidHeader(String[] header) {
        return header != null && header.length == EXPECTED_COLUMN_NAMES.length &&
                java.util.Arrays.equals(header, EXPECTED_COLUMN_NAMES);
    }
}