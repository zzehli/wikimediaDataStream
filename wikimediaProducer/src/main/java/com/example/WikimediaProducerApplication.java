package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WikimediaProducerApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(WikimediaProducerApplication.class, args);
    }

    @Autowired
    private WikimediaProducer wikimediaProducer;

    @Override
    public void run(String... args) throws Exception {
        wikimediaProducer.sendMessage();
    }
}