package org.wcci;

public class Doctor extends Employee {

    private String specialty;

    @Override
    public String getName() {
        return super.getName();
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Doctor(String name, int empId, int salary, String specialty) {
        super(name, empId, salary);
        this.specialty = specialty;
    }

    public void drawBlood(Patient testPatient) {
        testPatient.haveBloodDrawn(-5);

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
