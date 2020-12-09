package DesignPatternsLearing.Factory.AbstractFactory;

/**
 * @author 重新做人idea基础学习
 * @date 2020-12-08
 */
public enum HumanEnum {

    YellowMaleHuman("DesignPatternsLearing.Factory.AbstractFactory.YellowMaleHuman"),
    YellowFemaleHuman("DesignPatternsLearing.Factory.AbstractFactory.YellowFemaleHuman"),
    WhiteMaleHuman("DesignPatternsLearing.Factory.AbstractFactory.WhiteMaleHuman"),
    WhiteFemaleHuman("DesignPatternsLearing.Factory.AbstractFactory.WhiteFemaleHuman"),
    BlackMaleHuman("DesignPatternsLearing.Factory.AbstractFactory.BlackMaleHuman"),
    BlackFemaleHuman("DesignPatternsLearing.Factory.AbstractFactory.BlackFemaleHuman");

    private String value = "";

    private HumanEnum(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }

}