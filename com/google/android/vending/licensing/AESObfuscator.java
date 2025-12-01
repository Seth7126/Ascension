package com.google.android.vending.licensing;

import com.google.android.vending.licensing.util.Base64;
import com.google.android.vending.licensing.util.Base64DecoderException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public class AESObfuscator implements Obfuscator {
    private static final String CIPHER_ALGORITHM = "AES/CBC/PKCS5Padding";
    private static final byte[] IV = null;
    private static final String KEYGEN_ALGORITHM = "PBEWITHSHAAND256BITAES-CBC-BC";
    private static final String UTF8 = "UTF-8";
    private static final String header = "com.android.vending.licensing.AESObfuscator-1|";
    private Cipher mDecryptor;
    private Cipher mEncryptor;

    static {
        AESObfuscator.IV = new byte[]{16, 74, 71, -80, 0x20, 101, 0xFFFFFFD1, 72, 0x75, -14, 0, -29, 70, 65, -12, 74};
    }

    public AESObfuscator(byte[] arr_b, String s, String s1) {
        try {
            SecretKeySpec secretKeySpec0 = new SecretKeySpec(SecretKeyFactory.getInstance("PBEWITHSHAAND256BITAES-CBC-BC").generateSecret(new PBEKeySpec((s + s1).toCharArray(), arr_b, 0x400, 0x100)).getEncoded(), "AES");
            Cipher cipher0 = Cipher.getInstance("AES/CBC/PKCS5Padding");
            this.mEncryptor = cipher0;
            cipher0.init(1, secretKeySpec0, new IvParameterSpec(AESObfuscator.IV));
            Cipher cipher1 = Cipher.getInstance("AES/CBC/PKCS5Padding");
            this.mDecryptor = cipher1;
            cipher1.init(2, secretKeySpec0, new IvParameterSpec(AESObfuscator.IV));
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new RuntimeException("Invalid environment", generalSecurityException0);
        }
    }

    @Override  // com.google.android.vending.licensing.Obfuscator
    public String obfuscate(String s, String s1) {
        if(s == null) {
            return null;
        }
        try {
            return Base64.encode(this.mEncryptor.doFinal(("com.android.vending.licensing.AESObfuscator-1|" + s1 + s).getBytes("UTF-8")));
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new RuntimeException("Invalid environment", unsupportedEncodingException0);
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new RuntimeException("Invalid environment", generalSecurityException0);
        }
    }

    @Override  // com.google.android.vending.licensing.Obfuscator
    public String unobfuscate(String s, String s1) throws ValidationException {
        if(s == null) {
            return null;
        }
        try {
            String s2 = new String(this.mDecryptor.doFinal(Base64.decode(s)), "UTF-8");
            if(s2.indexOf("com.android.vending.licensing.AESObfuscator-1|" + s1) != 0) {
                throw new ValidationException("Header not found (invalid data or key):" + s);
            }
            return s2.substring(s1.length() + 46, s2.length());
        }
        catch(Base64DecoderException base64DecoderException0) {
            throw new ValidationException(base64DecoderException0.getMessage() + ":" + s);
        }
        catch(IllegalBlockSizeException illegalBlockSizeException0) {
            throw new ValidationException(illegalBlockSizeException0.getMessage() + ":" + s);
        }
        catch(BadPaddingException badPaddingException0) {
            throw new ValidationException(badPaddingException0.getMessage() + ":" + s);
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new RuntimeException("Invalid environment", unsupportedEncodingException0);
        }
    }
}

