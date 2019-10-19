package at.segv.test.service.impl;

import at.segv.test.dao.interfaces.MyDao;
import at.segv.test.service.interfaces.MyDaoService;

import java.util.ServiceLoader;

public class MyDaoServiceImpl implements MyDaoService {

    private final MyDao dao;

    public MyDaoServiceImpl() {
        dao = ServiceLoader.load(MyDao.class)
                .findFirst().orElseThrow();
    }

    public MyDaoServiceImpl(MyDao dao) {

        this.dao = dao;
    }

    @Override
    public String bufferedRead() {
        return dao.read();
    }
}
