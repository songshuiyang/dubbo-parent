package com.songsy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 启动服务
 * @author songshuiyang
 * @date 2018/7/23 12:08
 */
public class Application {
    public static void main(String[] args) throws Exception {
        System.out.println("provider 模块开始启动");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(context.getDisplayName() + ":here");
        context.start();
        System.out.println("provider 模块启动成功");
        // 为保证服务一直开着，利用输入流的阻塞来模拟 按任意键退出
        System.in.read();


    }
}
