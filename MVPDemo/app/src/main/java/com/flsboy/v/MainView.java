package com.flsboy.v;

import com.flsboy.bean.UserBean;

/**
 *   @author:  flsboy
 *   MVP架构设计中View interface
 *   需要View(Activity)实现的接口，View通过View interface与Presenter进行交互，降低耦合，方便进行单元测试
 *   Presenter通过MainView接口类通知V层进行UI刷新
 */
public interface MainView {

    UserBean getUserBean();

    void showProgress();

}
