package designpattern.command.command;

/**
 * @author Mengruo
 * @date 2022/3/7 20:55
 * 命令接口
 */
public interface Command {

    void execute();

    void undo();
}
