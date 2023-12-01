package application;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.file.*;
import java.security.Key;
import java.util.Base64;

public class SecureDataStorage {
    private static final String ALGORITHM = "AES";
    private static final byte[] keyValue =
            new byte[] {'S', 'e', 'c', 'r', 'e', 't', 'K', 'e', 'y', '1', '2', '3', '4', '5', '6', '7'}; // your key here
    private String filePath = "data.txt";

    public void save(String data) {
        try {
            Key key = generateKey();
            Cipher c = Cipher.getInstance(ALGORITHM);
            c.init(Cipher.ENCRYPT_MODE, key);
            byte[] encValue = c.doFinal(data.getBytes());
            String encryptedValue = Base64.getEncoder().encodeToString(encValue);
            Files.write(Paths.get(filePath), encryptedValue.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String load() {
        try {
            byte[] encryptedData = Files.readAllBytes(Paths.get(filePath));
            Key key = generateKey();
            Cipher c = Cipher.getInstance(ALGORITHM);
            c.init(Cipher.DECRYPT_MODE, key);
            byte[] decordedValue = Base64.getDecoder().decode(new String(encryptedData));
            byte[] decValue = c.doFinal(decordedValue);
            return new String(decValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private Key generateKey() throws Exception {
        return new SecretKeySpec(keyValue, ALGORITHM);
    }
}



