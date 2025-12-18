package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestCommandOptionListener implements ActionListener {

    private final DriverManager driverManager;
    private final DriverCommand driverCommand;

    public  SelectTestCommandOptionListener(DriverManager driverManager, DriverCommand driverCommand) {
        this.driverManager = driverManager;
        this.driverCommand = driverCommand;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        driverCommand.execute(driverManager.getCurrentDriver());
    }
}
