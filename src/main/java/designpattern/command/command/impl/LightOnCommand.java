package designpattern.command.command.impl;

import designpattern.command.command.Command;
import designpattern.command.entity.Light;

/**
 * @author Mengruo
 * @date 2022/3/7 20:56
 * 具体的命令对象，包含一个被命令操作的对象的实例变量
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
