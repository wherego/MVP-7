package com.demo.panguso.mvp_mode.inject.component;

import com.demo.panguso.mvp_mode.inject.module.NewsDetailModule;
import com.demo.panguso.mvp_mode.mvp.ui.activities.NewsDetailActivity;

import dagger.Component;

/**
 * Created by ${yangfang} on 2016/9/20.
 */
@Component(modules = {NewsDetailModule.class})
public interface NewsDetailComponent {
    void inject(NewsDetailActivity activity);
}