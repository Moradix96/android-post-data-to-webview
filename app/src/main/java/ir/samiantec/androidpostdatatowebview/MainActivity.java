package ir.samiantec.androidpostdatatowebview;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final WebView webView = findViewById(R.id.webView);

        final String url = "https://httpbin.org/post"; // Echos every post request
        try {
            final String postData = "key1=" + URLEncoder.encode("value1", "UTF-8") + "&key2=" + URLEncoder.encode("value2", "UTF-8");
            webView.postUrl(url, postData.getBytes());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}