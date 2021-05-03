package sg.edu.np.mad.week2_thursday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = "Main Activity";
    User user1 = new User("Ryan", "YEOLO", 1, false);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TAG, "Create");

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user1.isFollowed() == false)
                {
                    button.setText("Unfollow");
                    user1.setFollowed(true);
                }
                else
                {
                    button.setText("Follow");
                    user1.setFollowed(false);
                }
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.v(TAG,"Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG, "Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG, "Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG, "Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "Destroy");
    }


}