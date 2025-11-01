package ch04.sec06.impl;

import ch04.sec06.Cipher;

public class AESCipherFactory {
    public static Cipher provider() { return new AESCipher(); }
}
