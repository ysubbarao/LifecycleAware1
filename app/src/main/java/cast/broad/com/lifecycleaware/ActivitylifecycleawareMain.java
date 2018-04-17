package cast.broad.com.lifecycleaware;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.util.Log;

/**
 * Created by malsneha on 17/04/18.
 */

public class ActivitylifecycleawareMain  implements LifecycleObserver{

    static final ActivitylifecycleawareMain ourInstance = new ActivitylifecycleawareMain();

    public static ActivitylifecycleawareMain getInstance() {
        return ourInstance;
    }

    private ActivitylifecycleawareMain() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void init() {
        Log.d("tag","Called From ActivitylifecycleawareMain Class, ON_CREATE");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void LibOnStart() {
        Log.d("tag",
                "Called From ActivitylifecycleawareMain Class, called onStart() of Activity : ON_START");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void TimeForBusinesswhileOnPause() {
        Log.d("tag",
                "Called From ActivitylifecycleawareMain Class, called onPause() of Activity : ON_PAUSE");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void TimeForBusinesswhileOnStop() {
        Log.d("tag",
                "Called FromActivitylifecycleawareMain Class, called onStop() of Activity : ON_STOP");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void TimeForBusinesswhileOnResume() {
        Log.d("tag",
                "Called From ActivitylifecycleawareMain Class, called onResume() of Activity : ON_RESUME");
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void TimeForBusinesswhileOnDestroy() {
        Log.d("tag",
                "Called From ActivitylifecycleawareMain Class, called onDestroy() of Activity : ON_DESTROY");
    }



}
