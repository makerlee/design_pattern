package cn.xyc.chainOfResponsibility.handler;

import cn.xyc.chainOfResponsibility.request.LeaveRequest;

/**
 *  直属领导
 * Created by lijiyang on 2018/5/14.
 */
public class Leader extends IHandler {
    public Leader(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        int day = request.getPeriod();
        if(day<3){
            System.out.println(request.getName() + " 请假 "+ day + "天，批准人："+this.name);
        }else{
            System.out.println("请假超过3天，leader搞不定，交给经理----->");
            if (this.next != null){
                this.next.handleRequest(request);
            }
        }
    }
}
