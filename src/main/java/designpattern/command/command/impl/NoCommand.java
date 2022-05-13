package designpattern.command.command.impl;

import designpattern.command.command.Command;

/**
 * @author Mengruo
 * @date 2022/3/7 22:55
 * 一个空的命令对象，作为默认命令，execute方法什么都不做
 */
public class NoCommand implements Command {


    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
