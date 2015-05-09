package io.github.mthli.Ninja.Browser;

import android.graphics.Bitmap;
import android.view.View;

public interface AlbumController {
    int getFlag();

    void setFlag(int flag);

    View getAlbumView();

    void setAlbumCover(Bitmap bitmap);

    void setAlbumTitle(String title);

    void activate();

    void deactivate();
}
