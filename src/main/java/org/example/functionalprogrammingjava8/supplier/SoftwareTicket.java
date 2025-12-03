package org.example.functionalprogrammingjava8.supplier;

public class SoftwareTicket extends Ticket {
    String application;
    String version;
    Domain domain;

    public SoftwareTicket(final String customerName, final int id, final String description, final int dueDate,
                           final String application, final String version, final Domain domain) {
        super(customerName, id, description, dueDate);
        this.application = application;
        this.version = version;
        this.domain = domain;
    }

    @Override
    public String toString(){

        return super.toString()+ "\nAPPLICATION:" + application + "\nVERSION:" + version + "\nDOMAIN:" + domain;
    }

}
