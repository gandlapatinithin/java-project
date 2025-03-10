package com.javatechie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsIntegrationApplication {

    @GetMapping
    public String message() {
        return "Welcome to our DevOps Project !!\n" +
               "This project is created by Nithin Reddy for DevOps practices.\n" +
               "Tools Used: Simple Java Code, Docker, Kubernetes, Jenkins (CI/CD), Terraform, Maven, Trivy, Ansible.";
    }

    public static void main(String[] args) {
        SpringApplication.run(DevopsIntegrationApplication.class, args);
    }
}
