package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        int itemIndex = intent.getIntExtra("ITEM_INDEX", 0);

        ImageView ivDetailIcon = findViewById(R.id.ivDetailIcon);
        TextView tvDetailHeaderTitle = findViewById(R.id.tvDetailHeaderTitle);
        TextView tvDetailTitle = findViewById(R.id.tvDetailTitle);
        TextView tvDetailContent = findViewById(R.id.tvDetailContent);

        String[] titles = getResources().getStringArray(R.array.string_array_titles);
        String[] contents = getResources().getStringArray(R.array.string_array_content);
        String[] imageNames = getResources().getStringArray(R.array.string_array_images);

        String currentTitle = titles[itemIndex];
        String currentContent = contents[itemIndex];
        String currentImageName = imageNames[itemIndex];

        tvDetailHeaderTitle.setText(currentTitle);
        tvDetailTitle.setText(currentTitle);
        tvDetailContent.setText(currentContent);

        // 极其重要：加了 .trim() 防止数组里有空格导致找不到图片闪退！
        int resId = getResources().getIdentifier(currentImageName.trim(), "drawable", getPackageName());
        ivDetailIcon.setImageResource(resId);
    }
}