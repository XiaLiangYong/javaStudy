package com.example.springbootconfiguration;

import com.example.springbootconfiguration.service.IRedisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootConfigurationApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    private IRedisService iRedisService;

    @Test
    public void demo() {
		iRedisService.set("test","1");
		iRedisService.expire("test",5);
     //   System.out.println("test="+iRedisService.get("test"));
       // iRedisService.lpush("test1",1);
        //iRedisService.lpush("test1",2);
        System.out.println(iRedisService.rpop("test1"));

    }

}
