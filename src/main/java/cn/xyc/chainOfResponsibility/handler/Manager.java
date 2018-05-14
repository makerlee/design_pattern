package cn.xyc.chainOfResponsibility.handler;

import cn.xyc.chainOfResponsibility.request.LeaveRequest;

/**
 *  部门经理
 * Created by lijiyang on 2018/5/14.
 */
public class Manager extends IHandler {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        int day = request.getPeriod();
        if(day<10){
            System.out.println(request.getName() + " 请假 "+ day + "天，批准人："+this.name);
        }else{
            System.out.println("请假超过10天，部门经理不敢批，交给总经理----->");
            if (this.next != null){
                this.next.handleRequest(request);
            }
        }
    }
}
