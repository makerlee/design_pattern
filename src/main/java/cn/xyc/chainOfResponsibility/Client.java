package cn.xyc.chainOfResponsibility;

import cn.xyc.chainOfResponsibility.handler.GManager;
import cn.xyc.chainOfResponsibility.handler.IHandler;
import cn.xyc.chainOfResponsibility.handler.Leader;
import cn.xyc.chainOfResponsibility.handler.Manager;
import cn.xyc.chainOfResponsibility.request.LeaveRequest;

/**
 * Created by lijiyang on 2018/5/14.
 */
public class Client {
    public static void main(String[] args) {
        LeaveRequest request = new LeaveRequest("小明","就是不想上班，就是想请假",120);

        IHandler leader = new Leader("李德");
        IHandler manager = new Manager("经理");
        IHandler gmanager = new GManager("总经理");

        leader.setNext(manager);
        manager.setNext(gmanager);

        leader.handleRequest(request);
    }
}
