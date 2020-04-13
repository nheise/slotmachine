package com.nh.slotmachine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.nh.slotmachine.pull" })
public class SlotmachineApplication {

    public static void main(String[] args) {
        SpringApplication.run(SlotmachineApplication.class, args);
    }

}
