package com.skyblock.skyblock.utilities.data;

import java.util.concurrent.ThreadLocalRandom;

public class ServerID {
    private static final char[] CHAR_POOL = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
    
    public static String generateRandomString(int length) {
        char[] result = new char[length];
        ThreadLocalRandom random = ThreadLocalRandom.current();
        for (int i = 0; i < length; i++) {
            result[i] = CHAR_POOL[random.nextInt(CHAR_POOL.length)];
        }
        return new String(result);
    }
    
     // example:   System.out.println(generateRandomString(4));
    
    public static String generateMiniServerID() {
    	return "mini" + generateRandomString(4);
	}
    
}
