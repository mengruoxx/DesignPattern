package designpattern.command.component;

import designpattern.command.command.Command;
import designpattern.command.command.impl.NoCommand;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mengruo
 * @date 2022/3/7 22:31
 * 组件类，遥控器 执行命令的类，包含一个命令对象。
 * 该类只需要执行命令的execute方法，并不关心具体是什么命令
 */
public class RemoteControl {

    private List<Command> onCommands;

    private List<Command> offCommands;

    private Command lastCommand;

    public RemoteControl(int size) {
        onCommands = new ArrayList<>(size);
        offCommands = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            onCommands.set(0, new NoCommand());
            offCommands.set(0, new NoCommand());
        }
    }

    public void setCommand(int index, Command onCommand, Command offCommand) {
        onCommands.set(index, onCommand);
        offCommands.set(index, offCommand);
    }

    public void pressOnButton(int index) {
        Command command = onCommands.get(index);
        command.execute();
        lastCommand = command;
    }

    public void pressOffButton(int index) {
        Command command = offCommands.get(index);
        command.execute();
        lastCommand = command;
    }

    public void pressUndoButton() {
        lastCommand.undo();
    }
}
