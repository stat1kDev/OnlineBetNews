
package ru.onlinebet.onlinebetnews;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;

public class NewsFragment extends Fragment {

    private WebView webView;
    private RelativeLayout onLoadingView;

    public NewsFragment() {
    }

    public static NewsFragment newInstance() {
        return new NewsFragment();
    }

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news, container, false);
        getActivity().setTitle("Новости");
        webView = view.findViewById(R.id.webView1);

        onLoadingView = view.findViewById(R.id.onLoadingView);

        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.getSettings().setSupportMultipleWindows(true);
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                onLoadingView.setVisibility(View.VISIBLE);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                view.loadUrl("javascript:(function() { \n" +
                        "                    var header = document.getElementsByTagName('header')[0].style.display='none'; \n" +
                        "                    var navbar = document.getElementsByClassName('bg-white bg-d-none b-t-g b-t-d-none b-b-g b-b-d-none')[0]; \n" +
                        "\t\t    if(navbar) navbar.style.display='none'; \n" +
                        "                var ar1 = document.getElementsByClassName('col-12 col-d-4')[0]; \n" +
                        "\t\tif(ar1) ar1.style.display='none'; \n" +
                        "\t\tvar ar2 = document.getElementsByClassName('col-d-12')[0]; \n" +
                        "\t\tif(ar2) ar2.style.display='none'; \n" +
                        "\t\tvar ar3 = document.getElementsByClassName('row slider-margin-fix m-r-d-m30')[0]; \n" +
                        "\t\tif(ar3) ar3.style.display='none'; \n" +
                        "\t\tvar ar4 = document.getElementsByClassName('bx-wrapper')[0]; \n" +
                        "\t\tif(ar4) ar4.style.display='none'; \n" +
                        "\t\tvar ar5 = document.getElementsByClassName('p-l-d-15')[0]; \n" +
                        "\t\tif(ar5) ar5.style.display='none'; \n" +
                        "\n" +
                        "\t\tvar ar6 = document.getElementsByClassName('row m-r-d-m30')[0]; \n" +
                        "\t\tif(ar6) ar6.style.display='none'; \n" +
                        "\t\t\n" +
                        "                    var footer = document.getElementsByTagName('footer')[0].style.display='none';})()");
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        onLoadingView.setVisibility(View.GONE);
                    }
                },700);

            }

            @TargetApi(Build.VERSION_CODES.N)
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });

        webView.loadUrl("https://xn----7sbbg4aidkrdg4an.xn--p1ai/news");

        webView.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if (keyEvent.getAction() == android.view.KeyEvent.ACTION_DOWN) {
                    if ((keyCode == android.view.KeyEvent.KEYCODE_BACK)) {
                        if (webView != null) {
                            if (webView.canGoBack()) {
                                webView.goBack();
                            }
                        }
                    }
                }
                return true;
            }
        });

        return view;
    }


}

