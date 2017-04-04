package com.blueicon.loading.tool;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;

import com.blueicon.loading.R;

/**
 * Created by developer on 04/04/17.
 */

public class Loading extends Activity{
    private Context context;
    private ProgressDialog progressDialog;

    public Loading(Context context) {
        this.context = context;
    }

    //messageDialog
    public void messageDialog(String titulo, String mensaje) {

        progressDialog = new ProgressDialog(context);
        progressDialog.setMessage(mensaje);
        progressDialog.setTitle(titulo);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        progressDialog.setCancelable(false);
        progressDialog.show();
        progressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        progressDialog.setContentView(R.layout.loading_layout);
    }

    // cerrar mensaje
    public void closeMessage() {
        progressDialog.dismiss();
    }


}
