package cn.xyc.observer.subject;

/**
 * Created by lijiyang on 2018/5/4.
 */
public class HeadHR extends AbstractHR {
    public void publishJob(String job) {
        allTalents.forEach(talent -> talent.newJob(job));
    }
}
