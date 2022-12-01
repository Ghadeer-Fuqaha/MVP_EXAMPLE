package com.example.mvp_example.ui;

import com.example.mvp_example.pojo.Model;

public class ProductPresenter {

    ProductViewInterface productViewInterface;

    public ProductPresenter(ProductViewInterface productViewInterface) {
        this.productViewInterface = productViewInterface;
    }

    public Model getProductFromDatabase(){
        return new Model(1,"Milk","5$","Drink");
    }

    public void getProductName(){
        productViewInterface.onGetDataProductName(getProductFromDatabase().getName());
    }
}
