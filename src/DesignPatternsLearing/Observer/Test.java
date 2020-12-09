package DesignPatternsLearing.Observer;

/**
 * @author 重新做人idea基础学习
 * @date 2020-12-08
 */
public class Test {
    public static void main(String[] args) {

        XiaoMei xiao_mei = new XiaoMei();
        LaoWang lao_wang = new LaoWang();
        LaoLi lao_li = new LaoLi();

        //小王和小李在小美那里都注册了一下
        xiao_mei.addPerson(lao_wang);
        xiao_mei.addPerson(lao_li);

        //小美向小王和小李发送通知
        xiao_mei.notifyPerson();
    }
}