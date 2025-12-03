package org.example.functionalprogrammingjava8.supplier;

public class HardwareTicket  extends  Ticket{

    String device;
    String model;
    String serialNumber;

    public HardwareTicket(final String customerName, final int id, final String description, final int dueDate,
                          final String device, final String model, final String serialNumber) {
        super(customerName, id, description, dueDate);
        this.device = device;
        this.model = model;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString(){

        return  super.toString() + "\nDEVICE:" + device+ "\nMODEL:" + model + "\nSERIAL NUMBER:" + serialNumber;
    }
}
