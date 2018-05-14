package cn.xyc.chainOfResponsibility.handler;

import cn.xyc.chainOfResponsibility.request.LeaveRequest;

/**
 *  总经理
 * Created by lijiyang on 2018/5/14.
 */
public class GManager extends IHandler {
    public GManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        int day = request.getPeriod();
        if(day<15){
            System.out.println(request.getName() + " 请假 "+ day + "天，批准人："+this.name);
        }else{
            if (this.next != null){
                this.next.handleRequest(request);
            }else{
                System.out.println("请假不成功");
            }
        }
    }
}
