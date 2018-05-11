package cn.xyc.state.State;

/**
 * Created by lijiyang on 2018/5/10.
 * 正常大小
 */
public class NormalDasplay implements IState {
    @Override
    public void display() {
        System.out.println("正常大小显示.....");
    }
}
