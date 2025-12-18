package edu.kis.powp.jobs2d.command;

public class RectangleFactory implements CommandFactory  {

    private final int rectangleWidth;
    private final int rectangleHeight;

    public RectangleFactory(int width, int height) {
        this.rectangleWidth = width;
        this.rectangleHeight = height;
    }

    @Override
    public ComplexCommand createCommand() {

        ComplexCommand commands = new ComplexCommand();

        SetPositionCommand setPositionCommand = new SetPositionCommand(0, 0);
        OperateToCommand drawFirstLineCommand = new OperateToCommand(rectangleWidth, 0);
        OperateToCommand drawSecondLineCommand = new OperateToCommand(rectangleWidth, rectangleHeight);
        OperateToCommand drawThirdLineCommand = new OperateToCommand(0, rectangleHeight);
        OperateToCommand drawFourthLineCommand = new OperateToCommand(0, 0);

        commands.addCommand(setPositionCommand);
        commands.addCommand(drawFirstLineCommand);
        commands.addCommand(drawSecondLineCommand);
        commands.addCommand(drawThirdLineCommand);
        commands.addCommand(drawFourthLineCommand);

        return commands;

    }
}
