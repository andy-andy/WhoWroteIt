package com.at.whowroteit;

import android.os.AsyncTask;
import android.widget.TextView;

import java.lang.ref.WeakReference;

public class FetchBookAsyncTask extends AsyncTask<String, Void, String> {

    private WeakReference<TextView> mTitleText;
    private WeakReference<TextView> mAuthorText;

    public FetchBookAsyncTask(TextView titleText, TextView authorText) {
        mTitleText = new WeakReference<>(titleText);
        mAuthorText = new WeakReference<>(authorText);
    }

    @Override
    protected String doInBackground(String... strings) {
        return NetworkUtils.getBookInfo(strings[0]);
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }
}
