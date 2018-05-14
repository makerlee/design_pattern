package cn.xyc.chainOfResponsibility.handler;

import cn.xyc.chainOfResponsibility.request.LeaveRequest;

/**
 * Created by lijiyang on 2018/5/14.
 */
public abstract class IHandler {
    protected String name;

    protected IHandler next;

    public void setNext(IHandler handler){
        this.next = handler;
    }

    public IHandler() {
    }

    public IHandler(String name) {
        this.name = name;
    }

    public abstract void handleRequest(LeaveRequest request);
}
