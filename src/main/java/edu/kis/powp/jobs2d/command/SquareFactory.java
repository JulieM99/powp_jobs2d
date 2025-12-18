package edu.kis.powp.jobs2d.command;

public class SquareFactory implements CommandFactory {

    private final int squareArmLenght;

    public  SquareFactory(int squareArmLenght) {
        this.squareArmLenght = squareArmLenght;
    }

    @Override
    public ComplexCommand createCommand() {

        ComplexCommand commands = new ComplexCommand();
        SetPositionCommand setPositionCommand = new SetPositionCommand(0, 0);
        OperateToCommand operateToCommand1 = new OperateToCommand(squareArmLenght, 0);
        OperateToCommand operateToCommand2 = new OperateToCommand(squareArmLenght, squareArmLenght);
        OperateToCommand operateToCommand3 = new OperateToCommand(0, squareArmLenght);
        OperateToCommand operateToCommand4 = new OperateToCommand(0, 0);

        commands.addCommand(setPositionCommand);
        commands.addCommand(operateToCommand1);
        commands.addCommand(operateToCommand2);
        commands.addCommand(operateToCommand3);
        commands.addCommand(operateToCommand4);

        return commands;
    }
}
