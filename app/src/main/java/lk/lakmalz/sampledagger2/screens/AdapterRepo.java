package lk.lakmalz.sampledagger2.screens;

import android.app.Activity;

import com.squareup.picasso.Picasso;

import lk.lakmalz.sampledagger2.ActivityModule;

/**
 * Created by A Lakmal Weerasekara (Lakmalz) on 20/7/17.
 * alrweerasekara@gmail.com
 */

public class AdapterRepo {

    private Activity context;
    private Picasso picassso;

    public AdapterRepo(Activity context, Picasso picassso) {
        this.context = context;
        this.picassso = picassso;
    }
}
