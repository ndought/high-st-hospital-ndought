package org.wcci;

public class Doctor extends Employee {

    private String specialty;

    public String getSpecialty() {
        return "Heart";
    }
    public Doctor(String name, int empId, int salary, String specialty) {
        super(name, empId, salary);
        this.specialty = specialty;
    }
    public void drawBlood(PatientOne testPatient) {
        testPatient.haveBloodDrawn(2);
    }
    @Override
    public String toString() {
        return "Doctor{" +
                "specialty='" + specialty + '\'' +
                '}';
    }
}
















    //    private String specialty;
//
//    public String getSpecialty() {
//        return specialty;
//    }
//
//    public Doctor(String name, int empId, int salary, String specialty) {
//        super(name, empId, salary);
//        this.specialty = specialty;
//    }
//
//    public void drawBlood(Patient testPatient) {
//        testPatient.haveBloodDrawn(5);
//    }
//}

