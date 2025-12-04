package cse213.group7.papermillfinal.laboni;

public class HR_Data {
    private String dateType;
    private String startDate;
    private String endDate;
    private String exportFormat;
    private String status;

    public HR_Data(String dateType, String startDate, String endDate, String exportFormat, String status) {
        this.dateType = dateType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.exportFormat = exportFormat;
        this.status = status;
    }

    public String getDateType() {
        return dateType;
    }

    public void setDateType(String dateType) {
        this.dateType = dateType;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getExportFormat() {
        return exportFormat;
    }

    public void setExportFormat(String exportFormat) {
        this.exportFormat = exportFormat;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "HR_Data{" +
                "dateType='" + dateType + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", exportFormat='" + exportFormat + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
