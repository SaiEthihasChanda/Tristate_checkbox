package com.example.threestatecheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {

    private CheckBox triStateCheckbox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        triStateCheckbox = findViewById(R.id.tristate);
        Drawable drawable = triStateCheckbox.getButtonDrawable();

        triStateCheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    triStateCheckbox.setChecked(true);
                    drawable.setColorFilter(0xFF00FF00, PorterDuff.Mode.SRC_IN);

                } else {
                    triStateCheckbox.setChecked(false);
                    drawable.setColorFilter(0xFF00FF00, PorterDuff.Mode.SRC_IN);

                }
            }
        });

        triStateCheckbox.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                triStateCheckbox.setChecked(true);
                drawable.setColorFilter(0xFFFF0000, PorterDuff.Mode.SRC_IN);

                return true;
            }
        });
    }
}
