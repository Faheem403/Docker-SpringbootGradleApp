package com.sniffer.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class SnifferController 
{
	@GetMapping("/")
    public Map<String, Object> getInfo() {

        return Map.of(
                "platform", "Sniffer Learning Academy",
                "description", "Learn Java, Spring Boot, DevOps, AI Engineering with Live + Recorded sessions",
                "website", "https://sniffer.com",
                "courses", new String[]{
                        "Java Full Stack",
                        "Spring Boot",
                        "DevOps with AWS",
                        "Docker & Kubernetes",
                        "AI Engineering"
                }
        );
    }

}
