package com.webnono.core.pagehelper;

import java.io.Serializable;

/**
 * Created by Administrator on 2015/12/18.
 */
public interface IPageQueryModel extends Serializable {

    int getStart();

    int getLimit();

    int getPageNo();
}
