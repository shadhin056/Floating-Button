package com.example.floatingbutton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.os.Bundle;
import android.view.View;

import com.example.floatingbutton.floating_button.FloatingTextButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final CoordinatorLayout container = (CoordinatorLayout) findViewById(R.id.container);
        FloatingTextButton callButton = (FloatingTextButton) findViewById(R.id.call_button);

        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(container, "Call button clicked", Snackbar.LENGTH_SHORT).show();
            }
        });
    }
}
