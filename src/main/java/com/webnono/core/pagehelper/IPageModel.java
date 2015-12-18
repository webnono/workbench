package com.webnono.core.pagehelper;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2015/12/18.
 */
public interface IPageModel<T> extends Serializable {

    List<T> getDataList();

    int getTotalRecord();

    IPageQueryModel getPageQueryModel();
}
