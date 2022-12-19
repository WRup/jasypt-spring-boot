package com.wrup.jasyptdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = "jasypt.encryptor.password=Pa55word!Us3D_F0r#Alg0RiTHm")
class JasyptDemoApplicationTests {

    @Test
    void contextLoads() {
    }

}
