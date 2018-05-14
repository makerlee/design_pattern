package cn.xyc.chainOfResponsibility.request;

/**
 * Created by lijiyang on 2018/5/14.
 */
public class LeaveRequest {
    private String name;
    private String reason;
    private int period;

    public LeaveRequest(String name, String reason, int period) {
        this.name = name;
        this.reason = reason;
        this.period = period;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
}
