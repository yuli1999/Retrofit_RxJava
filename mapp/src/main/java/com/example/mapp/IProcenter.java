package com.example.mapp;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class IProcenter {
    private IView iView;
    private  IModel iModel;

    public IProcenter(IView iView) {
        this.iView = iView;
        iModel=new IModel();
    }

    public void getListener(String anme,String page){
        iModel.getListener(anme,page)
                //
                .subscribeOn(Schedulers.io())
                //
                .observeOn(AndroidSchedulers.mainThread())
                //
                .subscribe(new Observer<Bean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Bean bean) {
                         iView.onSuccess(bean);
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
