package web.monitoring.tool.dao;

import web.monitoring.tool.entity.Website;
import org.hibernate.Session;
import org.hibernate.Transaction;
import web.monitoring.tool.utils.HibernateSessionFactoryUtil;

public class WebsiteDAOImpl implements WebsiteDAO{
    public void save(Website website) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(website);
        transaction.commit();
        session.close();
    }

    public void update(Website website) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(website);
        transaction.commit();
        session.close();
    }
}
