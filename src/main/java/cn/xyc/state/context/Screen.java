package cn.xyc.state.context;

import cn.xyc.state.State.FourTimeDasplay;
import cn.xyc.state.State.IState;
import cn.xyc.state.State.NormalDasplay;
import cn.xyc.state.State.TwoTimeDasplay;

/**
 * Created by lijiyang on 2018/5/10.
 * 屏幕类
 */
public class Screen {
    private IState currentState;
    private IState normalState;
    private IState twoTimeState;
    private IState fourTimeState;


    public Screen() {
        this.normalState = new NormalDasplay();
        this.twoTimeState = new TwoTimeDasplay();
        this.fourTimeState = new FourTimeDasplay();
        this.currentState = new NormalDasplay();

        this.currentState = this.normalState;//设置初始状态
        this.currentState.display();
    }

    private void setState(IState state){
        this.currentState = state;
    }

    //单击事件处理方法，封转了对状态类中业务方法的调用和状态的转换
    public void onClick() {
        if (this.currentState == normalState) {
            this.setState(this.twoTimeState);
            this.currentState.display();
        }
        else if (this.currentState == twoTimeState) {
            this.setState(this.fourTimeState);
            this.currentState.display();
        }
        else if (this.currentState == this.fourTimeState) {
            this.setState(normalState);
            this.currentState.display();
        }
    }
}
