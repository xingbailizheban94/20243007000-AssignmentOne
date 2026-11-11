package com.example.assignmentone;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. 找到四个按钮
        ImageButton btnFacilities = findViewById(R.id.btnFacilities);
        ImageButton btnEvents = findViewById(R.id.btnEvents);
        ImageButton btnClubs = findViewById(R.id.btnClubs);
        ImageButton btnSupport = findViewById(R.id.btnSupport);

        // 2. 给四个按钮设置点击事件（Part E 要求）
        btnFacilities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Facilities clicked", Toast.LENGTH_SHORT).show();
            }
        });

        btnEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Events clicked", Toast.LENGTH_SHORT).show();
            }
        });

        btnClubs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clubs clicked", Toast.LENGTH_SHORT).show();
            }
        });

        btnSupport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Support clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}