package bridgelabz.com.indiancenususanalyser;

import org.junit.Test;

import com.opencsv.exceptions.CsvException;


import java.io.IOException;

/**
 * JUnit 4 test case for verifying that the CSVStateCensus class throws a custom exception
 * when an incorrect state census CSV file is provided.
 */
public class CSVStateCensusSadTest {

    /**
     * @desc
     * This test case checks whether the CSVStateCensus class throws a custom exception
     * (InvalidCensusDataException) when an incorrect state census CSV file is provided
     * for loading data.
     *
     * @params
     * The test uses the following parameters:
     * - incorrectCsvFilePath: A string representing the path to the incorrect CSV file
     *                        used for testing.
     *
     * @returns
     * This test case does not return any value. It expects the InvalidCensusDataException
     * to be thrown during the execution of the loadCensusData method. If the method throws
     * the expected exception, the test passes; otherwise, it fails.
     *
     * @throws IOException               If an I/O error occurs during the test.
     * @throws CsvException              If an error occurs while processing the CSV file.
     * @throws InvalidCensusDataException If the CSV file has incorrect or invalid data.
     */
    @Test(expected = InvalidCensusDataException.class)
    public void testLoadCensusDataWithIncorrectFile() throws IOException, CsvException, InvalidCensusDataException {
        // Specify an incorrect CSV file path for testing
        String incorrectCsvFilePath = "C:\\Users\\KIIT\\OneDrive\\Desktop\\users.csv";

        // Create CSVStateCensus instance
        CSVStateCensus csvStateCensus = new CSVStateCensus();

        // Attempt to load census data from the incorrect CSV file
        csvStateCensus.loadCensusData(incorrectCsvFilePath);
    }
}
