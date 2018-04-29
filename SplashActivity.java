package yourPackageName;
import android.content.Intent;
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
              startActivity(new Intent(getApplicationContext(), YourMainActivity.class));
              finish();
              }
        }
