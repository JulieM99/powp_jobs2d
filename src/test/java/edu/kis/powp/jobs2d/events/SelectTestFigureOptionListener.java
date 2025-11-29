package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
    private Figure figure;

	public SelectTestFigureOptionListener(DriverManager driverManager, Figure figure) {
		this.driverManager = driverManager;
        this.figure = figure;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

        if(figure == Figure.Figure_Joe_1) {
            FiguresJoe.figureScript1(driverManager.getCurrentDriver());
        } else if (figure == Figure.Figure_Joe_2) {
            FiguresJoe.figureScript2(driverManager.getCurrentDriver());
        }

	}
}
