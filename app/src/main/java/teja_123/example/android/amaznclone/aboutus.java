package teja_123.example.android.amaznclone;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class aboutus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);




        WebView myweb1=(WebView) findViewById(R.id.mywebview1);
        myweb1.getSettings().setJavaScriptEnabled(true);
        myweb1.loadUrl("https://ezerka.org/");
        myweb1.setWebViewClient(new WebViewClient());
        myweb1.loadUrl("https://ezerka.org/");

    }
}
