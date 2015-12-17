package com.webnono.web.service.impl;

import com.webnono.core.generic.GenericDao;
import com.webnono.core.generic.GenericServiceImpl;
import com.webnono.web.dao.ResourceMapper;
import com.webnono.web.model.Resource;
import com.webnono.web.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2015/12/17.
 */
@Service
public class ResourceServiceImpl extends GenericServiceImpl<Resource,Long> implements ResourceService{

    @Autowired
    ResourceMapper resourceMapper;
    @Override
    public GenericDao<Resource, Long> getDao() {
        return resourceMapper;
    }
}
