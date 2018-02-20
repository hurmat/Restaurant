package com.tes.restaurant;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by hurmat on 20/02/2018.
 */

class Tab extends LinearLayout {
    public Tab(Context c, int drawable, String label) {
        super(c);

        setOrientation(LinearLayout.VERTICAL);

        if (drawable != 0) {
            ImageView iv = new ImageView(c);
            iv.setImageResource(drawable);
            addView(iv);
        }

    }
}
