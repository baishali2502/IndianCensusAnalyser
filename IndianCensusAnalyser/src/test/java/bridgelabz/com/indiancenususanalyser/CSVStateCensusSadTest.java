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
    /**
     * @desc
     * This test case checks whether the CSVStateCensus class throws a custom exception
     * (InvalidCensusDataException) when the type is incorrect in the correct state census CSV file.
     * This is a sad test case to ensure that an exception is raised in case of incorrect types.
     *
     * @params
     * The test uses the following parameters:
     * - correctCsvFilePath: A string representing the path to the correct CSV file
     *                       with an incorrect type used for testing.
     *
     * @returns
     * This test case does not return any value. It expects the InvalidCensusDataException
     * to be thrown during the execution of the loadCensusData method. If the method throws
     * the expected exception, the test passes; otherwise, it fails.
     *
     * @throws IOException               If an I/O error occurs during the test.
     * @throws CsvException              If an error occurs while processing the CSV file.
     * @throws InvalidCensusDataException If the CSV file has correct data but incorrect types.
     */
    @Test(expected = InvalidCensusDataException.class)
    public void testLoadCensusDataWithIncorrectType() throws IOException, CsvException, InvalidCensusDataException {
        // Specify a correct CSV file path with incorrect types for testing
        String correctCsvFilePath = "C:\\Users\\KIIT\\OneDrive\\Desktop\\StateCensus2.csv";

        // Create CSVStateCensus instance
        CSVStateCensus csvStateCensus = new CSVStateCensus();

        // Attempt to load census data from the correct CSV file with incorrect types
        csvStateCensus.loadCensusData(correctCsvFilePath);
    }
    /**
     * @desc
     * This test case checks whether the CSVStateCensus class throws a custom exception
     * (InvalidCensusDataException) when the file delimiter is incorrect in a correct state census CSV file.
     * This is a sad test case to ensure that an exception is raised in case of an incorrect delimiter.
     *
     * @params
     * The test uses the following parameters:
     * - correctCsvFilePath: A string representing the path to the correct CSV file
     *                       with an incorrect delimiter used for testing.
     *
     * @returns
     * This test case does not return any value. It expects the InvalidCensusDataException
     * to be thrown during the execution of the loadCensusData method. If the method throws
     * the expected exception, the test passes; otherwise, it fails.
     *
     * @throws IOException               If an I/O error occurs during the test.
     * @throws CsvException              If an error occurs while processing the CSV file.
     * @throws InvalidCensusDataException If the CSV file has correct data but an incorrect delimiter.
     */
    @Test(expected = InvalidCensusDataException.class)
    public void testLoadCensusDataWithIncorrectDelimiter() throws IOException, CsvException, InvalidCensusDataException {
        // Specify a correct CSV file path with an incorrect delimiter for testing
        String correctCsvFilePath = "C:\\Users\\KIIT\\OneDrive\\Desktop\\StateCensus3.csv";

        // Create CSVStateCensus instance
        CSVStateCensus csvStateCensus = new CSVStateCensus();

        // Attempt to load census data from the correct CSV file with an incorrect delimiter
        csvStateCensus.loadCensusData(correctCsvFilePath);
    }
}
