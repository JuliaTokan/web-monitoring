package web.monitoring.tool.services;

import web.monitoring.tool.dao.WebsiteDAOImpl;
import web.monitoring.tool.entity.Website;

public class WebsiteService {
    WebsiteDAOImpl websiteDao = new WebsiteDAOImpl();

    public void saveWebsite(Website website) {
        websiteDao.save(website);
    }

    public void updateWebsite(Website website) {
        websiteDao.update(website);
    }

}
