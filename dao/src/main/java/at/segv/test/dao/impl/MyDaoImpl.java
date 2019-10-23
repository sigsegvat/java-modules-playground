package at.segv.test.dao.impl;

import at.segv.test.dao.interfaces.MyDao;
import at.segv.test.dao.internal.Helper;
import org.springframework.stereotype.Service;

@Service
public class MyDaoImpl implements MyDao {

    @Override
    public String read() {
        return Helper.read();
    }
}
