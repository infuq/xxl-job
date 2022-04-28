package com.xxl.job.executor.service.jobhandler;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Bootstrap {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext-xxl-job.xml");

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
