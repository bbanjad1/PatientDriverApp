package patient.java;
public class Procedure {
    private String procedureName;
    private String procedureDate;
    private String practitionerName;
    private double procedureCharges;

    // No-arg constructor
    public Procedure() {
    }

    // Constructor for name and date
    public Procedure(String procedureName, String procedureDate) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
    }

    // Constructor for all attributes
    public Procedure(String procedureName, String procedureDate, String practitionerName, double procedureCharges) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = practitionerName;
        this.procedureCharges = procedureCharges;
    }

    // get and set method
    public String getProcedureName() {
        return procedureName;
    }

    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }

    public String getProcedureDate() {
        return procedureDate;
    }

    public void setProcedureDate(String procedureDate) {
        this.procedureDate = procedureDate;
    }

    public String getPractitionerName() {
        return practitionerName;
    }

    public void setPractitionerName(String practitionerName) {
        this.practitionerName = practitionerName;
    }

    public double getProcedureCharges() {
        return procedureCharges;
    }

    public void setProcedureCharges(double procedureCharges) {
        this.procedureCharges = procedureCharges;
    }
    //  displaying all information
    public String toString() {
        return "\tProcedure: " + procedureName + "\n" +
               "\tProcedureDate: " + procedureDate + "\n" +
                "\tPractitioner: " + practitionerName + "\n" + 
               "\tCharges: $" + procedureCharges;
    }
}