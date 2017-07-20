package lk.lakmalz.sampledagger2;

import com.squareup.picasso.Picasso;

import dagger.Component;
import lk.lakmalz.sampledagger2.network.GithubService;

/**
 * Created by A Lakmal Weerasekara (Lakmalz) on 19/7/17.
 * alrweerasekara@gmail.com
 */
@GithubApplicationScope
@Component(modules = {GithubServiceModule.class, PicassoModule.class, ActivityModule.class})
public interface GithubApplicationComponent {

    Picasso getPicasso();

    GithubService getGithubSerice();
}
