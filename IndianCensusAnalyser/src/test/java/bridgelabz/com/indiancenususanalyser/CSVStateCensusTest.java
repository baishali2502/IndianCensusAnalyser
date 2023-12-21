package bridgelabz.com.indiancenususanalyser;

import static org.junit.Assert.*; 
import java.io.IOException;
import java.util.*;
import org.junit.Test;
import com.opencsv.exceptions.CsvException;
import bridgelabz.com.indiancenususanalyser.StateCensusData;

public class CSVStateCensusTest {

	/**
	 * @desc
	 * This method is a JUnit test that checks the functionality of the "loadCensusData" method in the CSVStateCensus class.
	 * It loads census data from a specified CSV file, creates a list of StateCensusData objects, and then verifies
	 * if the number of records matches the expected count.
	 *
	 * @params
	 * testCsvFilePath: The path to the CSV file used for testing the "loadCensusData" method.
	 *
	 * @returns
	 * This test does not return any value. It asserts the expected number of records against the actual number of records
	 * loaded from the CSV file.
	 *
	 * @throws IOException If an I/O error occurs while reading the CSV file.
	 * @throws CsvException If an error occurs while processing the CSV file.
	 */
	@Test
	public void testLoadCensusData() {
	    // Specify the path to your CSV file for testing
	    String testCsvFilePath = "C:\\Users\\KIIT\\Downloads\\StateCensus.csv";

	    // Create CSVStateCensus instance
	    CSVStateCensus csvStateCensus = new CSVStateCensus();

	    // Load census data for testing
	    List<StateCensusData> censusDataList = null;
	    try {
	        censusDataList = csvStateCensus.loadCensusData(testCsvFilePath);
	    } catch (IOException e) {
	        // Handle IOException
	        e.printStackTrace();
	    } catch (CsvException e) {
	        // Handle CsvException
	        e.printStackTrace();
	    } catch (InvalidCensusDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    // Expected number of records for the test file
	    int expectedRecordCount = 37;

	    // Check if the number of records matches
	    assertEquals(expectedRecordCount, censusDataList.size());
	}


}

