package com.example.example_collection.Basic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.example_collection.R;

public class ButtonActivity extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        text = findViewById(R.id.text_button);

        /**
         * 1. 匿名内部类方法
         */
        Button btn1 = findViewById(R.id.btn_button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("第一个按钮被按了！");

            }
        });


        /**
         * 2. 用Activity实现OnClickListener接口
         */
        Button btn2 = findViewById(R.id.btn_button2);
        btn2.setOnClickListener(this::onClick);
        Button btn2_2 = findViewById(R.id.btn_button2_2);
        btn2_2.setOnClickListener(this::onClick);
        Button btn2_3 = findViewById(R.id.btn_button2_3);
        btn2_3.setOnClickListener(this::onClick);


    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.btn_button2:
                text.setText("第二1个按钮被按了！");
                break;
            case R.id.btn_button2_2:
                text.setText("第二2个按钮被按了！");
                break;
            case R.id.btn_button2_3:
                text.setText("第二3个按钮被按了！");
                break;
        }
    }

    /**
     *  3. 指定Button的onClick的属性：
     * @param view
     */
    public void clickButton3(View view) {
        switch (view.getId()){
            case R.id.btn_button3:
                text.setText("第三1个按钮被按了！");
                break;
            case R.id.btn_button3_2:
                text.setText("第三2个按钮被按了！");
                break;
            case R.id.btn_button3_3:
                text.setText("第三3个按钮被按了！");
                break;
            default:
                break;
        }
    }
}