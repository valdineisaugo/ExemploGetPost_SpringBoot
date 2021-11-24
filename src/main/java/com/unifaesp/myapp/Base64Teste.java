package com.unifaesp.myapp;

import org.apache.tomcat.util.codec.binary.Base64;

public class Base64Teste {
    public static void main(String[] args) {
        String nome = "Unifaesp centro universitário";
        String enconded = Base64.encodeBase64String(nome.getBytes());
        System.out.println(enconded);
    }

}
