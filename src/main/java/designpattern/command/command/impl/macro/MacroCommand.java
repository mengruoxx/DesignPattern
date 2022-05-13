package designpattern.command.command.impl.macro;

import designpattern.command.command.Command;

import java.util.List;

/**
 * @author Mengruo
 * @date 2022/3/7 23:18
 */
public class MacroCommand implements Command {

    private List<Command> commands;

    public MacroCommand(List<Command> commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (Command command : commands) {
            command.undo();
        }
    }
}
