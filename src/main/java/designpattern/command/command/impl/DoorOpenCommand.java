package designpattern.command.command.impl;

import designpattern.command.command.Command;
import designpattern.command.entity.Door;

/**
 * @author Mengruo
 * @date 2022/3/7 20:56
 * 具体的命令对象，包含一个被命令操作的对象的实例变量
 */
public class DoorOpenCommand implements Command {

    private Door door;

    public DoorOpenCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.open();
    }

    @Override
    public void undo() {
        door.close();
    }
}
