package cn.xyc.observer.subject;

import cn.xyc.observer.observer.ITalent;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by lijiyang on 2018/5/4.
 */
public abstract class AbstractHR {
    protected Collection<ITalent> allTalents = new ArrayList<ITalent>();

    public abstract void publishJob(String job);

    public void addTalent(ITalent talent){
        allTalents.add(talent);
    }

    public void removeTalent(ITalent talent){
        allTalents.remove(talent);
    }
}
