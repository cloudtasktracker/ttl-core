package com.tasktracker.libraries.core.security;

import org.jasypt.util.text.BasicTextEncryptor;

public class Crypter {

    private static String securityKey = "allworkandnoplaymakesJackadullboy";

    public static String encrypt(String plainText) {
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPassword(securityKey+new StringBuffer(securityKey).reverse().toString());
        return textEncryptor.encrypt(plainText);
    }

    public static String decrypt(String encryptedText){
        BasicTextEncryptor textDecryptor = new BasicTextEncryptor();
        textDecryptor.setPassword(securityKey+new StringBuffer(securityKey).reverse().toString());
        return textDecryptor.decrypt(encryptedText);
    }
}
