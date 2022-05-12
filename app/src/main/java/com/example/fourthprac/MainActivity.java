package com.example.fourthprac;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        msg();
        dialog.show();
    }

    private void msg() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            dialog = new Dialog(MainActivity.this);
            dialog.setTitle("Lorem ipsum");
            dialog.setContentView(R.layout.dialog_view);
            TextView textView = dialog.findViewById(R.id.textView);
            textView.setText("ТекстТекстТекстТекстТекстТекстТекст");
        }
    }
}