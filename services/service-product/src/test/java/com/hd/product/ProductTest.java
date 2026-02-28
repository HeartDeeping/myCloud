package com.hd.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;

@SpringBootTest
public class ProductTest {

    @Autowired
    DiscoveryClient discoveryClient;

    @Test
    void discoveryClientTest() {
        for (String service : discoveryClient.getServices()) {
            System.out.println("service=" + service);
            for (ServiceInstance instance : discoveryClient.getInstances(service)) {
                System.out.println("ip："+instance.getHost()+"端口："+instance.getPort());
            }
        }

    }
}
