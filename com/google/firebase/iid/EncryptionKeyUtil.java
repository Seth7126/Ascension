package com.google.firebase.iid;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.ECGenParameterSpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class EncryptionKeyUtil {
    public static KeyPair generateEcP256KeyPair() {
        return EncryptionKeyUtil.getEcKeyGen().generateKeyPair();
    }

    public static KeyPair generateRSA2048KeyPair() {
        try {
            KeyPairGenerator keyPairGenerator0 = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator0.initialize(0x800);
            return keyPairGenerator0.generateKeyPair();
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            throw new AssertionError(noSuchAlgorithmException0);
        }
    }

    private static KeyPairGenerator getEcKeyGen() {
        KeyPairGenerator keyPairGenerator0;
        try {
            keyPairGenerator0 = KeyPairGenerator.getInstance("EC");
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            throw new RuntimeException(noSuchAlgorithmException0);
        }
        try {
            keyPairGenerator0.initialize(new ECGenParameterSpec("prime256v1"));
            return keyPairGenerator0;
        }
        catch(InvalidAlgorithmParameterException unused_ex) {
            try {
                keyPairGenerator0.initialize(new ECGenParameterSpec("secp256r1"));
                return keyPairGenerator0;
            }
            catch(InvalidAlgorithmParameterException unused_ex) {
                throw new RuntimeException("Unable to find the NIST P-256 curve");
            }
        }
    }

    public static boolean isEcP256Supported() {
        try {
            EncryptionKeyUtil.getEcKeyGen();
            return false;
        }
        catch(Exception unused_ex) {
            return true;
        }
    }

    public static SecretKey parseAESKey(byte[] arr_b) {
        return new SecretKeySpec(arr_b, "AES");
    }
}

