package teja_123.example.android.amaznclone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class aboutus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);

        WebView myweb1=(WebView) findViewById(R.id.mywebview1);
        myweb1.getSettings().setJavaScriptEnabled(true);
        myweb1.setWebViewClient(new WebViewClient());
        myweb1.loadUrl("https://ezerka.org/");
    }
}
