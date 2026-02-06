package com.example.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.config.AppConfig;
import com.example.demo.model.Order;

public class MainApp {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    ApplicationContext context =
          new AnnotationConfigApplicationContext(AppConfig.class);
    Order or = context.getBean(Order.class);
    or.display();


  }

}