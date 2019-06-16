package com.weianlai.design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: weianlai
 * @motto: In doing we learn
 */
public class CourseCatalog extends CatalogComponent {

    private List<CatalogComponent> items = new ArrayList<CatalogComponent>();
    private String name;

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    @Override
    public void print() {
        for (CatalogComponent catalogComponent1 : items) {
            catalogComponent1.print();
        }
    }
}
