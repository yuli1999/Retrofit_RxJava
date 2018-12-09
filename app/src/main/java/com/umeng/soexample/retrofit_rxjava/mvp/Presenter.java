package com.umeng.soexample.retrofit_rxjava.mvp;

import com.umeng.soexample.retrofit_rxjava.Bean;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * data:2018/12/9
 * author: HJL (磊)
 * function:
 */
public class Presenter {
    private View view;
    private Model model;

    public Presenter(View view) {
        this.view = view;
        model = new Model();
    }

    public void getListener() {
        model.getListener()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Bean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Bean bean) {
                        view.onSuccess(bean);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

}
