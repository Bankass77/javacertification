package org.example.java17.chapter8.shortProblems;

import java.util.function.Predicate;

public class ChildTest {

    public static void main(String[] args) {

        Predicate<Child> isChildRelation = x -> x.relation.equals("son") || x.relation.equals("daugther")
                || x.relation.equals("stepchild") || x.relation.equals("foster");

        Predicate<Child> isAgeValid = x -> (x.age < 19) || (x.isStudent && x.age < 24) || x.isDisabled;

        Predicate<Child> isFinantiallyDependent = x -> !x.filedJointReturn || x.onlyForReFund;

        Predicate<Child> livedHalfYear = x -> x.monthsLivedWithYou > 6;

        Predicate<Child> isDependent = isChildRelation.and(isChildRelation).and(isFinantiallyDependent).and(livedHalfYear);

        Child alpha = new Child("son", false, 18, false, 30, false, false, 8);
        Child beta = new Child("stepchild", false, 17, false, 30, false, false, 8);
        Child gamma = new Child("daughter", true, 25, false, 10, false, false, 12);

        System.out.println("Alpha dependent ?  : " + isDependent.test(alpha));
        System.out.println("beta dependent ? : " + isDependent.test(beta));
        System.out.println("gamma dependent ? : " + isDependent.test(gamma));

    }
}
