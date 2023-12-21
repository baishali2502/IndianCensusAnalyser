package bridgelabz.com.indiancenususanalyser;
import java.io.IOException;

import java.util.List;
import com.opencsv.exceptions.CsvException;

public class Main 
{
	public static void main(String[] args) 
	{
		System.out.println( " Welcome to Indian State Census Analyser !! " );
        
	     // Specify the path to your CSV file
	        String csvFilePath = "C:\\Users\\KIIT\\Downloads\\StateCensus.csv";

	        // Create CSVStateCensus instance
	        CSVStateCensus csvStateCensus = new CSVStateCensus();
	//--------------------------------------- UC-1 ----------------------------------------------
	        // Load census data
	        List<StateCensusData> censusDataList=null;
			try {
				censusDataList = csvStateCensus.loadCensusData(csvFilePath);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (CsvException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	        // Check if the number of records matches
	        int expectedRecordCount = 37;
	        
	        if (censusDataList.size() == expectedRecordCount) {
	            System.out.println("Number of records match.");
	        } else {
	            System.out.println("Number of records do not match.");
	        }	
	}
}
