package org.example.java17.chapter8.shortProblems;

public class Child {
    String relation;  //  fils, fille, beau-fils, belle-fille
    boolean isStudent;
    int age;
    double supportPourcent;  // pourcentage de ces propres besoins
    boolean isDisabled;
    boolean filedJointReturn;
    boolean onlyForReFund;
    double monthsLivedWithYou;

    public Child(final String relation, final boolean isStudent, final int age, final boolean isDisabled, final double supportPourcent, final boolean filedJointReturn, final boolean onlyForReFund, final double monthsLivedWithYou) {
        this.relation = relation;
        this.isStudent = isStudent;
        this.age = age;
        this.isDisabled = isDisabled;
        this.supportPourcent = supportPourcent;
        this.filedJointReturn = filedJointReturn;
        this.onlyForReFund = onlyForReFund;
        this.monthsLivedWithYou = monthsLivedWithYou;
    }
}
