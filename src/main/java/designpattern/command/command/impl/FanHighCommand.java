package designpattern.command.command.impl;

import designpattern.command.command.Command;
import designpattern.command.entity.Fan;

/**
 * @author Mengruo
 * @date 2022/3/7 23:10
 */
public class FanHighCommand implements Command {

    private Fan fan;

    private int lastSpeed;

    @Override
    public void execute() {
        lastSpeed = fan.getSpeed();
        fan.high();
    }

    @Override
    public void undo() {
        if (lastSpeed == Fan.HIGH_SPEED) {
            fan.high();
        } else if (lastSpeed == Fan.MEDIUM_SPEED) {
            fan.medium();
        } else if (lastSpeed == Fan.LOW_SPEED) {
            fan.low();
        }
    }
}
