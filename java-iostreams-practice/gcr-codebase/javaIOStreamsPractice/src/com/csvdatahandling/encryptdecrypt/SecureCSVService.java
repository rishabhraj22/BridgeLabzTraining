package com.csvdatahandling.encryptdecrypt;
import java.io.*;

public class SecureCSVService {

    public void writeEncrypted(String path) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter(path));
        bw.write("Name,Email,Salary");
        bw.newLine();

        bw.write("Ravi," + CryptoUtil.encrypt("ravi@gmail.com") + "," +
                CryptoUtil.encrypt("60000"));
        bw.newLine();

        bw.close();
    }

    public void readDecrypted(String path) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(path));
        br.readLine();
        String line;

        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");
            System.out.println(
                    d[0] + " | " +
                    CryptoUtil.decrypt(d[1]) + " | " +
                    CryptoUtil.decrypt(d[2])
            );
        }
        br.close();
    }
}
