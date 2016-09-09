package com.demo.panguso.mvp_mode.mvp.presenter.impl;

import com.demo.panguso.mvp_mode.interactor.NewsInteractor;
import com.demo.panguso.mvp_mode.interactor.NewsInteractorImpl;
import com.demo.panguso.mvp_mode.mvp.presenter.NewsPresenter;
import com.demo.panguso.mvp_mode.mvp.view.NewsView;
import com.demo.panguso.mvp_mode.mvp.view.base.BaseView;

import java.util.List;

/**
 * Created by ${yangfang} on 2016/9/9.
 */
public class NewsPresenterImpl implements NewsPresenter, NewsInteractor.OnFinishedListener {
    private NewsView mNewsView;
    private NewsInteractor mNewsInteractor;

    public NewsPresenterImpl(NewsView newsFragment) {
        mNewsView = newsFragment;
        mNewsInteractor = new NewsInteractorImpl();
    }

    @Override
    public void onFabClicked() {

    }

    @Override
    public void onItemClicked(int position) {

    }

    @Override
    public void onCreateView() {
        if (mNewsView != null) {
            mNewsView.showProgress();
        }
        mNewsInteractor.loadNews(this);
    }

    @Override
    public void attachView(BaseView view) {

    }

    @Override
    public void onDestory() {

    }

    @Override
    public void onFinished(List<String> items) {
        if (mNewsView != null) {
            mNewsView.setItems(items);
            mNewsView.hideProgress();
        }
    }
}