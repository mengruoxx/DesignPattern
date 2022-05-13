package designpattern.command.client;

import designpattern.command.command.impl.DoorCloseCommand;
import designpattern.command.command.impl.DoorOpenCommand;
import designpattern.command.command.impl.LightOffCommand;
import designpattern.command.command.impl.LightOnCommand;
import designpattern.command.component.RemoteControl;
import designpattern.command.entity.Door;
import designpattern.command.entity.Light;

/**
 * @author Mengruo
 * @date 2022/3/7 22:34
 */
public class Client {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl(2);
        // 设置命令1
        Door door = new Door();
        remoteControl.setCommand(0, new DoorOpenCommand(door), new DoorCloseCommand(door));
        // 设置命令2
        Light light = new Light();
        remoteControl.setCommand(1, new LightOnCommand(light), new LightOffCommand(light));
        // 按下按钮
        remoteControl.pressOnButton(0);
        remoteControl.pressOffButton(0);
        remoteControl.pressOnButton(1);
        remoteControl.pressUndoButton();
        remoteControl.pressOffButton(1);

    }

}
