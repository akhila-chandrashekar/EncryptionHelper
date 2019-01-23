package com.example.akhilac.encryption;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EncryptionHelper encryptionHelper = new EncryptionHelper();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView encrpytedString = (TextView)findViewById(R.id.encrypt);
        TextView decryptedString = (TextView)findViewById(R.id.decrypt);
        String arr[] = {"Encrypt_this_string"};
        for(int i=0; i<arr.length;i++) {
            String encrypt = encryptionHelper.encrypt(arr[i]);
            Log.d("ENCRYPT>>>>>", encrypt);
            encrpytedString.setText(encrypt);
            String decrypt = encryptionHelper.decrypt(encrypt);
            Log.d("DECRYPT>>>>>>>.", decrypt);
            decryptedString.setText(decrypt);
        }
    }
}
