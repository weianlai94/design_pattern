package com.weianlai.design.pattern.proxy.staticproxy;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author: weianlai
 * @motto: In doing we learn
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDBType();
    }
}
