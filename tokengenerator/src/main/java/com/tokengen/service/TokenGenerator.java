package com.tokengen.service;

import java.security.SecureRandom;

public class TokenGenerator {


    public static void main(String[] args) {
        System.out.println("Some random text.");

        SecureRandom random = new SecureRandom();

        System.err.println(" This is some random number "+random.nextFloat());
    }
    
}
