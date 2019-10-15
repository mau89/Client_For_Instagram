package com.example.client_for_instagram;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.google.android.material.snackbar.Snackbar;

public class StartActivity extends AppCompatActivity {
    private Button button;
    private EditText editText;
    private Snackbar snackbar;
    private CoordinatorLayout coordinatorLayout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_layout);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
        coordinatorLayout = findViewById(R.id.coordinatorLayout);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().isEmpty()) {
                    snackbar = Common.getSnackbar(coordinatorLayout, "Snackbar");
                    snackbar.show();
                }
            }
        });
    }

}
