package com.unity3d.player;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView text;
    Button button;
    EditText editText;
    LinearLayout layout;
    int n = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.title_greetings);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.ed);
        layout = findViewById(R.id.root);

        layout.setOnClickListener(this);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.root) {
            if (n == 0) {
                text.setText("Мы вам поможем! Отправляйтесь в город Инвест-сити. Вам нужно дойти до банка ВТБ и повысить свои навыки инвестиций.\nПо пути вы встретите сотрудников ВТБ - к ним можно обратиться за полезной информацией");
            }
            if (n == 1) {
                text.setText("Давайте знакомиться");
                editText.setVisibility(View.VISIBLE);
                button.setVisibility(View.VISIBLE);
            }
            n++;
        }
        else
            startActivity(new Intent(MainActivity.this, UnityPlayerActivity.class));
    }
}