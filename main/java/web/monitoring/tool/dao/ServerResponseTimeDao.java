package web.monitoring.tool.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import web.monitoring.tool.entity.ServerResponseTime;
import web.monitoring.tool.utils.HibernateSessionFactoryUtil;

public class ServerResponseTimeDao {
    public void save(ServerResponseTime serverResponseTime) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(serverResponseTime);
        transaction.commit();
        session.close();
    }
}
