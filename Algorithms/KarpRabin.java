package Algorithms;
import java.util.*;
// Karp Rabin STring Matching Algo - Hashmap
public class KarpRabin {
    public static void main(String[] args) {
        
    }
    private final int PRIME = 101;
    private  long calculateHash(String str){
        long hash = 0;
        for(int i = 0; i < str.length();i++){
            hash =  (hash + str.charAt(i) * Math.pow(PRIME,i));
            
        }
    }
    private long updateHash(long preHash,char oldChar,char newChar,int patternLength){
        long newHash = (preHash - oldChar) / PRIME;
        newHash = newHash + newChar*Math.pow(PRIME,patternLength);
return newHash;

    }
}
