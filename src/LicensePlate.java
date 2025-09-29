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
    private int number;
    //endregion

    public LicensePlate(String rawLicensePlate)
    {
        String[] parts = rawLicensePlate.split("\\s");

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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
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
