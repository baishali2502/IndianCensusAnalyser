package bridgelabz.com.indiancenususanalyser;
/**
 * Represents a record in the Indian State Census data.
 */
public class StateCensusData {

    /**
     * Serial number of the census data.
     */
    private int srNo;

    /**
     * Name of the state.
     */
    private String stateName;

    /**
     * Taxpayer Identification Number.
     */
    private int tin;

    /**
     * Code representing the state.
     */
    private String stateCode;

    /**
     * Constructs a StateCensusData object.
     *
     * @param srNo      Serial number of the census data.
     * @param stateName Name of the state.
     * @param tin2       Taxpayer Identification Number.
     * @param stateCode Code representing the state.
     */
    public StateCensusData(int srNo, String stateName, int tin2, String stateCode) {
        this.srNo = srNo;
        this.stateName = stateName;
        this.tin = tin2;
        this.stateCode = stateCode;
    }

    /**
     * Gets the serial number of the census data.
     *
     * @return The serial number.
     */
    public int getSrNo() {
        return srNo;
    }

    /**
     * Gets the name of the state.
     *
     * @return The state name.
     */
    public String getStateName() {
        return stateName;
    }

    /**
     * Gets the Taxpayer Identification Number.
     *
     * @return The TIN.
     */
    public int getTin() {
        return tin;
    }

    /**
     * Gets the code representing the state.
     *
     * @return The state code.
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * Returns a string representation of the StateCensusData object.
     *
     * @return A string representation.
     */
    @Override
    public String toString() {
        return "StateCensusData{" +
                "srNo=" + srNo +
                ", stateName='" + stateName + '\'' +
                ", tin='" + tin + '\'' +
                ", stateCode='" + stateCode + '\'' +
                '}';
    }
}
