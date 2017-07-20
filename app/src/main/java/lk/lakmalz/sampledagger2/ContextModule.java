package lk.lakmalz.sampledagger2;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by A Lakmal Weerasekara (Lakmalz) on 20/7/17.
 * alrweerasekara@gmail.com
 */
@Module
public class ContextModule {

    private final Context mContext;

    public ContextModule(Context context) {
        mContext = context.getApplicationContext();
    }

    @Provides
    @GithubApplicationScope
    @ApplicationContext
    public Context context() {
        return mContext;
    }
}
