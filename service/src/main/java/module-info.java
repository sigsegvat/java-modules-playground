import at.segv.test.dao.interfaces.MyDao;
import at.segv.test.service.impl.MyDaoServiceImpl;
import at.segv.test.service.interfaces.MyDaoService;

module service {

    exports at.segv.test.service.interfaces;

    uses MyDao;

    provides MyDaoService with MyDaoServiceImpl;

    requires dao;
}