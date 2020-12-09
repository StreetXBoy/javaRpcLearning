package DesignPatternsLearing.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 重新做人idea基础学习
 * @date 2020-12-08
 */
public class XiaoMei {
    List<Person> list = new ArrayList<Person>();
    public XiaoMei(){
    }

    public void addPerson(Person person){
        list.add(person);
    }

    //遍历list，把自己的通知发送给所有暗恋自己的人
    public void notifyPerson() {
        for(Person person:list){
            person.getMessage("你们过来吧，谁先过来谁就能陪我一起玩儿游戏!");
        }
    }
}