
package rup_lab_project;

import com.musicg.fingerprint.FingerprintSimilarity;
import com.musicg.wave.Wave;

import com.musicg.fingerprint.FingerprintSimilarity;
import com.musicg.wave.Wave;

public class try2 {
    public static void main(String[] args) {
    FingerprintSimilarity similarity;
     Wave w1 = new Wave("E:/Test/pass1.wav");
    Wave w2 = new Wave("E:/Test/pass2.wav");
    similarity = w1.getFingerprintSimilarity(w2);
    System.out.println("clip is found at "
				+ similarity.getsetMostSimilarTimePosition() + "similarity score " + similarity.getSimilarity());
    
    }
    
}
