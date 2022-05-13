package designpattern.command.entity;

import lombok.Data;

/**
 * @author Mengruo
 * @date 2022/3/7 23:07
 * 还可以将状态保存到命令接受者里
 */
@Data
public class Fan {

    public static final int HIGH_SPEED = 10;
    public static final int MEDIUM_SPEED = 5;
    public static final int LOW_SPEED = 1;

    private int speed;

    public void high() {
        speed = HIGH_SPEED;
    }

    public void medium() {
        speed = MEDIUM_SPEED;
    }

    public void low() {
        speed = LOW_SPEED;
    }

}

