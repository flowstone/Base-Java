package org.xueyao.work01;

import java.util.HashMap;
import java.util.Map;

/**
 * 已知Map中保存如下信息:{“及时雨”=”宋江”, “玉麒麟”=”卢俊义”, “智多星”=”吴用”},
 * 其中键表示水浒中人物的外号,value表示人物的姓名.
 * 1往Map中添加 “入云龙”=”公孙胜”, ”豹子头”=”林冲”两位好汉.
 * 2删除“玉麒麟”=”卢俊义”,
 * 3将key为“智多星”的value修改为null,
 * 4.将“及时雨”=”宋江”,修改为”呼保义”=” 宋江”
 * @author Yao Xue
 * @date Jul 30, 2017 3:33:21 AM
 */
public class Test30 {
    public static void main(String[] args) {
        Map<String,String> hero = new HashMap<String,String>();
        hero.put("及时雨","宋江");
        hero.put("玉麒麟","卢俊义");
        hero.put("智多星","吴用");
        System.out.println(hero);
        hero.put("入云龙","公孙胜");
        hero.put("豹子头","林冲");
        
        System.out.println(hero);
        hero.remove("玉麒麟");
        hero.put("智多星",null);
        hero.remove("及时雨");
        hero.put("呼保义","宋江");
        
        System.out.println(hero);
    }
}
