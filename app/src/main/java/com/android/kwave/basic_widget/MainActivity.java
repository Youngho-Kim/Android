package com.android.kwave.basic_widget;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, RadioGroup.OnCheckedChangeListener {

    // 1. 위젯 변수를 선언
    Button btnDog, btnPig, btnHorse;
    ToggleButton toggleButton;
    RadioGroup radioGroup;
    SeekBar seekBar;
    SeekBar seekBar1;
    TextView seekCount;
    TextView seekCount1;
    EditText name;
    EditText password;
    EditText number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//    2. 위젯변수를 화면과 연결
        btnDog = (Button) findViewById(R.id.btnDog);
        btnPig = (Button) findViewById(R.id.btnPig);
        btnHorse = (Button) findViewById(R.id.btnHorse);

        toggleButton = (ToggleButton) findViewById(R.id.toggleButton);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        seekBar = (SeekBar) findViewById(R.id.seekBar);
        seekBar1 = (SeekBar) findViewById(R.id.seekBar1);

        seekCount = (TextView) findViewById(R.id.seekCount);
        seekCount1 = (TextView) findViewById(R.id.seekCount1);

        name = (EditText) findViewById(R.id.name);
        password = (EditText) findViewById(R.id.password);
        number = (EditText) findViewById(R.id.number);

//        3. 클릭리스터 연결
                btnDog.setOnClickListener(this);    // 리스너에 this(뭔가)를 넘겨주면
                btnPig.setOnClickListener(this);    // 해당 이벤트가 발생시 this(뭔가)를 호출해준다.
                btnHorse.setOnClickListener(this);

                toggleButton.setOnCheckedChangeListener(this);      // 체크드 체인지 리스너O =>  클릭 리스너가 아님

                radioGroup.setOnCheckedChangeListener(this);

                seekBar.setOnSeekBarChangeListener(listener) ;

                seekBar1.setOnSeekBarChangeListener(listener1) ;

                name.setOnClickListener(this);
                password.setOnClickListener(this);
                number.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){        // 시스템의 이벤트 리스너를 통해 호출된다
        switch(v.getId()){
            case R.id.btnDog :
                Toast.makeText(this, "멍멍", Toast.LENGTH_SHORT ).show();     // makeText(실행이 되는 액티비티, 띄울 문구, 띄울 시간)  show() : makeText 보이기
                break;
            case R.id.btnPig :
                Toast.makeText(this, "꿀꿀", Toast.LENGTH_SHORT ).show();     // makeText(실행이 되는 액티비티, 띄울 문구, 띄울 시간)  show() : makeText 보이기
                break;
            case R.id.btnHorse :
                Toast.makeText(this, "이힝~", Toast.LENGTH_SHORT ).show();     // makeText(실행이 되는 액티비티, 띄울 문구, 띄울 시간)  show() : makeText 보이기
                break;
            case R.id.name :
                Toast.makeText(this, "이름을 입력하세요", Toast.LENGTH_SHORT ).show();     // makeText(실행이 되는 액티비티, 띄울 문구, 띄울 시간)  show() : makeText 보이기
                break;
            case R.id.password :
                Toast.makeText(this, "비밀번호를 입력하세요", Toast.LENGTH_SHORT ).show();     // makeText(실행이 되는 액티비티, 띄울 문구, 띄울 시간)  show() : makeText 보이기

                break;
            case R.id.number :
                Toast.makeText(this, "번호를 입력하세요", Toast.LENGTH_SHORT ).show();     // makeText(실행이 되는 액티비티, 띄울 문구, 띄울 시간)  show() : makeText 보이기
                break;

        }
    }



    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()){
            case R.id.toggleButton :
                if(isChecked) {

                    Toast.makeText(this, "스위치가 켜졌습니다", Toast.LENGTH_SHORT).show();     // makeText(실행이 되는 액티비티, 띄울 문구, 띄울 시간)  show() : makeText 보이기
                }
                else{
                    Toast.makeText(this, "스위치가 꺼졌습니다", Toast.LENGTH_SHORT ).show();     // makeText(실행이 되는 액티비티, 띄울 문구, 띄울 시간)  show() : makeText 보이기
                }
                break;
        }
    }

    @Override
    public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
        if(radioGroup.getId() == R.id.radioGroup){
                    switch (checkedId){
                        case R.id.radio_red :
                        Toast.makeText(this, "빨간불이 켜졌습니다", Toast.LENGTH_SHORT ).show();
                        break;
                        case R.id.radio_green :
                        Toast.makeText(this, "초록불이 켜졌습니다", Toast.LENGTH_SHORT ).show();
                        break;
                        case R.id.radio_blue :
                        Toast.makeText(this, "파란불이 켜졌습니다", Toast.LENGTH_SHORT ).show();
                        break;
                    }
        }
    }
    SeekBar.OnSeekBarChangeListener listener = new SeekBar.OnSeekBarChangeListener(){
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seekCount.setText(progress + "");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        };
    SeekBar.OnSeekBarChangeListener listener1 = new SeekBar.OnSeekBarChangeListener(){
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            seekCount1.setText(progress+"");
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    };
}
