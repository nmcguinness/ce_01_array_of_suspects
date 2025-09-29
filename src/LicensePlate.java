public class LicensePlate{
    /*
    191 L 12345
    11 L 12345
    131 L 12345
    132 L 12345
     */

    //region Fields
    private String year;
    private String county;
    private String number;
    //endregion

    public LicensePlate(String rawLicensePlate)
    {
        //TODO - deal with no string, test parts for null
        String[] parts = rawLicensePlate.split("\\s");

        if(parts.length == 3)
        {
            this.year = parts[0];  //"131"
            this.county = parts[1];
            this.number = parts[2];
        }
    }

    public boolean Validate()
    {
        boolean isTargetCounty
                = this.county.matches(".{0,1}L.{0,1}");

        boolean isNumberValid
                = this.number.matches("[0-9]*6[0-9]*6[0-9]*");

        return isTargetCounty && isNumberValid;
    }

    //region Getters & Setters
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    //endregion

    //region Overrides
    @Override
    public String toString() {
        return "LicensePlate{" +
                "year='" + year + '\'' +
                ", county='" + county + '\'' +
                ", number=" + number +
                '}';
    }
    //endregion
}