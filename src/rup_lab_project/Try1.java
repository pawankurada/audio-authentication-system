
package rup_lab_project;
import com.musicg.fingerprint.FingerprintManager;
import com.musicg.fingerprint.FingerprintSimilarity;
import com.musicg.fingerprint.FingerprintSimilarityComputer;
import com.musicg.wave.Wave;


public class Try1 {
  public static void main(String[] args) {
    Wave w1 = new Wave("E:/Test/test.wav");
    Wave w2 = new Wave("E:/Test/pass2.wav");

    byte[] firstFingerPrint = new FingerprintManager().extractFingerprint(w1);
    byte[] secondFingerPrint = new FingerprintManager().extractFingerprint(w2);
    // Compare fingerprints
    FingerprintSimilarity fingerprintSimilarity = new FingerprintSimilarityComputer(firstFingerPrint, secondFingerPrint).getFingerprintsSimilarity();
    System.out.println("Similarity score = " + fingerprintSimilarity.getScore());
  }
}