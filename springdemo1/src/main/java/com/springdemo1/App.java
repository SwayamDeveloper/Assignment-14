package com.springdemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springdemo1.Entity.Agent;
import com.springdemo1.Entity.AgentDao;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");

    	
        AgentDao e2=(AgentDao)context.getBean("e2");
          int st=e2.saveAgent(new Agent(11,"Rohit","500sqrt",55000));
       
//        int st=e2.updateAgent(new Agent(10,"Satyam","150sqrt",36000));
        
        Agent a1= new Agent();
        a1.setId(11);
//        int st=e2.deleteAgent(a1);  
        
        System.out.println(st);

        
    }
}
