package com.weianlai.design.pattern.structural.composite;

/**
 * @author: weianlai
 * @motto: In doing we learn
 */
public abstract class CatalogComponent {

    public void add(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持add操作");
    }

    public void remove(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持remove操作");
    }

    public String getName(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持getName操作");
    }

    public double getPrice(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持getPrice操作");
    }

    public void print() {
        throw new UnsupportedOperationException("不支持print操作");
    }

}
