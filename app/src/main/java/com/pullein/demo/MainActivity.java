package com.pullein.demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toSignature(View view) {
        startActivity(new Intent(this, SignatureActivity.class));
    }

    public void toIndicator(View view) {
        startActivity(new Intent(this, IndicatorActivity.class));
    }

    public void toJsonParse(View view) {
        startActivity(new Intent(this, JsonActivity.class));
    }

    public void toDensityAndString(View view) {
        startActivity(new Intent(this, DensityActivity.class));
    }
}
