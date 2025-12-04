package cse213.group7.papermillfinal.laboni;

public class SafetyReporting {
    private String location;
    private String date;
    private String description;
    private String severity;
    private String incidentType;

    public SafetyReporting(String location, String date, String description, String severity, String incidentType) {
        this.location = location;
        this.date = date;
        this.description = description;
        this.severity = severity;
        this.incidentType = incidentType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getIncidentType() {
        return incidentType;
    }

    public void setIncidentType(String incidentType) {
        this.incidentType = incidentType;
    }

    @Override
    public String toString() {
        return "SafetyReporting{" +
                "location='" + location + '\'' +
                ", date='" + date + '\'' +
                ", description='" + description + '\'' +
                ", severity='" + severity + '\'' +
                ", incidentType='" + incidentType + '\'' +
                '}';
    }
}
