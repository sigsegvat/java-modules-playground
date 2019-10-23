package at.segv.test.service.impl;

import at.segv.test.dao.interfaces.MyDao;
import at.segv.test.service.interfaces.MyDaoService;
import org.springframework.stereotype.Service;

@Service
public class MyDaoServiceImpl implements MyDaoService {

    private final MyDao dao;

    public MyDaoServiceImpl(MyDao dao) {
        this.dao = dao;
    }

    @Override
    public String read() {
        return "service: " + dao.read();
    }
}
