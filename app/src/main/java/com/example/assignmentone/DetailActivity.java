package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // 接收 MainActivity 传过来的数字
        Intent intent = getIntent();
        int itemIndex = intent.getIntExtra("ITEM_INDEX", -1);

        // 测试一下有没有收到（Part G 验证）
        Toast.makeText(this, "Received item index: " + itemIndex, Toast.LENGTH_SHORT).show();
    }
}