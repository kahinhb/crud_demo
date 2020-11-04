/*
package com.crud.demo.starter;

import java.util.ArrayList;
import java.util.Iterator;

public class starter {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("第一个");
        names.add("第二个");
        names.add("第三个");
        names.add("第四个");
        names.add("第五个");
        //迭代器遍历
        Iterator<String> it = names.iterator();
        while(it.hasNext()) {
            String itname = it.next();
            //这里使用若是集合里有空指针：itname.equals("itcast")回报异常
            //变量与常量判断时，将常量放在前面，为了预防出现空指针问题
           if ("第一个".equals(itname)) {
                //删除集合中的“第一个”元素
                it.remove();
                names.remove(itname);
            }
        }
        System.out.println(names);
    }
}
*/
