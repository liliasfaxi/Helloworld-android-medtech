package medtech.tn.a1_greeting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class GreetingActivity extends AppCompatActivity {

    TextView greetingText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);

        greetingText = (TextView) findViewById(R.id.greetingText);
        greetingText.setText("Hello "+getIntent().getStringExtra("name"));

    }
}
