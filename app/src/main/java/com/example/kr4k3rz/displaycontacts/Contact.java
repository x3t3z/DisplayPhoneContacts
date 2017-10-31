package com.example.kr4k3rz.displaycontacts;

import android.graphics.Bitmap;

/**
 * Created by kr4k3rz on 10/31/17.
 */

public class Contact {
    String name;
    String phn;
    String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhn() {
        return phn;
    }

    public void setPhn(String phn) {
        this.phn = phn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Bitmap getBitmap_picture() {
        return bitmap_picture;
    }

    public void setBitmap_picture(Bitmap bitmap_picture) {
        this.bitmap_picture = bitmap_picture;
    }

    Bitmap bitmap_picture;
}
