package hkit.kr.dialogex02;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ModifyActivity extends AppCompatActivity {

    EditText idEditText;
    EditText pwEditText;
    EditText emailEditText;
    Button modify2Button;
    Button closeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modify);

        Intent intent = getIntent();
        String id = intent.getStringExtra("id");
        String pw = intent.getStringExtra("pw");
        String email = intent.getStringExtra("email");

        idEditText = findViewById(R.id.idEditText);
        pwEditText = findViewById(R.id.pwEditText);
        emailEditText = findViewById(R.id.emailEditText);
        modify2Button = findViewById(R.id.modify2Button);
        closeButton = findViewById(R.id.closeButton);

        idEditText.setText(id);
        pwEditText.setText(pw);
        emailEditText.setText(email);

        modify2Button.setOnClickListener(modify2Listener);
        closeButton.setOnClickListener(closeListener);
    }
    View.OnClickListener modify2Listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String id = idEditText.getText().toString();
            String pw = pwEditText.getText().toString();
            String email = emailEditText.getText().toString();

            Intent data = new Intent();
            data.putExtra("id",id);
            data.putExtra("pw",pw);
            data.putExtra("email",email);
            setResult(Activity.RESULT_OK,data);
            finish();
        }
    };
    View.OnClickListener closeListener =new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            finish();
        }
    };


}


