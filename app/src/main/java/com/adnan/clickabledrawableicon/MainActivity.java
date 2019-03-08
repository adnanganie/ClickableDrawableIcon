package com.adnan.clickabledrawableicon;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.adnan.clickabledrawable.CustomTextInputEditText;

import org.jetbrains.annotations.NotNull;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomTextInputEditText textInputEditText = findViewById(R.id.textInputLayout);

        textInputEditText.setDrawableClickListener(new CustomTextInputEditText.DrawableClickListener() {
            @Override
            public void onClick(@NotNull DrawablePosition target) {
                /* switch (target) {
                    case TOP:
                        Toast.makeText(MainActivity.this, "You clicked on DrawableTop Icon", Toast.LENGTH_SHORT).show();
                        break;
                    case BOTTOM:
                        Toast.makeText(MainActivity.this, "You clicked on DrawableBottom Icon", Toast.LENGTH_SHORT).show();
                        break;
                    case RIGHT:
                        Toast.makeText(MainActivity.this, "You clicked on DrawableRight Icon", Toast.LENGTH_SHORT).show();
                        break;
                    case LEFT:
                        Toast.makeText(MainActivity.this, "You clicked on DrawableLeft Icon", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;

                }*/
            }
        });
    }
}
