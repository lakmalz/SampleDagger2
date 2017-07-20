package lk.lakmalz.sampledagger2;

import android.app.Activity;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by A Lakmal Weerasekara (Lakmalz) on 20/7/17.
 * alrweerasekara@gmail.com
 */
@Module
public class ActivityModule {

    private final Activity mContext;

    public ActivityModule(Activity context) {
        mContext = context;
    }

    @Provides
    @GithubApplicationScope
    public Activity context() {
        return mContext;
    }
}
