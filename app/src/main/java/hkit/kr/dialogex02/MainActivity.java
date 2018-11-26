package hkit.kr.dialogex02;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView idTextView;
    TextView pwTextView;
    TextView emailTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idTextView = findViewById(R.id.idTextView);
        pwTextView = findViewById(R.id.pwTextView);
        emailTextView = findViewById(R.id.emailTextView);


        Button modifyButton = findViewById(R.id.modifyButton);
        modifyButton.setOnClickListener(modifyListener);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        String id = data.getStringExtra("id");
        String pw = data.getStringExtra("pw");
        String email = data.getStringExtra("email");

        idTextView.setText(id);
        pwTextView.setText(pw);
        emailTextView.setText(email);
    }

    View.OnClickListener modifyListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            String id = idTextView.getText().toString();
            String pw = pwTextView.getText().toString();
            String email = emailTextView.getText().toString();

            Intent intent = new Intent(getBaseContext(),ModifyActivity.class);
            intent.putExtra("id","gdhong");
            intent.putExtra("pw","12345");
            intent.putExtra("email","a@a.com");
            startActivityForResult(intent, 10);
        }
    };
}
