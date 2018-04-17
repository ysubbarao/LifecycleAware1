package cast.broad.com.lifecycleaware;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


/*
Note: We are using the latest support lib v26.1.0 , which now has AppCompatActivity implementing LifecycleOwner interface
from Architecture Components. More about this, later in the post. For now just know you need support lib v26.1.0
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Init
       // ActivitylifecycleawareMain.getInstance().init();
        // Add Lifecycle Observer
        getLifecycle().addObserver(ActivitylifecycleawareMain.getInstance());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
       // ActivitylifecycleawareMain.getInstance().cleanup();
        getLifecycle().removeObserver(ActivitylifecycleawareMain.getInstance());
    }
}
