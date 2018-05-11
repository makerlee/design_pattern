package cn.xyc.state;

import cn.xyc.state.context.Screen;

/**
 * Created by lijiyang on 2018/5/10.
 * https://blog.csdn.net/lovesomnus/article/details/45750039#commentBox
 */
public class Client {
    public static void main(String[] args) {
        Screen screen = new Screen();
        screen.onClick();
        screen.onClick();
        screen.onClick();
    }
}
