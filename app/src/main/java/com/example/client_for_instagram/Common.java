package com.example.client_for_instagram;

import android.view.View;

import com.google.android.material.snackbar.Snackbar;

public class Common {
    public static Snackbar getSnackbar (View view, String message){
        Snackbar snackbar = Snackbar.make(view, message, Snackbar.LENGTH_LONG);
        View mSnackbarView = snackbar.getView();
        return snackbar;
    }
}
