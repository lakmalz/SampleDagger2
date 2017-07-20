package lk.lakmalz.sampledagger2.screens;

import com.squareup.picasso.Picasso;

import dagger.Module;
import dagger.Provides;
import lk.lakmalz.sampledagger2.scopes.HomeActivityScope;

/**
 * Created by A Lakmal Weerasekara (Lakmalz) on 20/7/17.
 * alrweerasekara@gmail.com
 */

@Module
public class HomeActivityModule {

    private final HomeActivity activity;

    public HomeActivityModule(HomeActivity activity) {
        this.activity = activity;
    }

    @Provides
    @HomeActivityScope
    public AdapterRepo adapterRepo(Picasso picasso) {
        return new AdapterRepo(activity, picasso);
    }
}
