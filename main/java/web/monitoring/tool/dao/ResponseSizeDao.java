package web.monitoring.tool.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import web.monitoring.tool.entity.ResponseSize;
import web.monitoring.tool.utils.HibernateSessionFactoryUtil;

public class ResponseSizeDao {
    public void save(ResponseSize responseSize) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(responseSize);
        transaction.commit();
        session.close();
    }
}
