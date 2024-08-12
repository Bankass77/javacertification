package org.example.java10.typeinference;

//Using the var keyword in the anonymous class
public class TypeInterferenceAnonymous {
    public static void main(String[] args) {
        var sampleRef = new SampleInterface() {

            @Override
            public void processdata() {
                System.out.println("Method Implemented ");
            }
        };
        sampleRef.processdata();
    }
}
