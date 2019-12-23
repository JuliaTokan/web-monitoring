package web.monitoring.tool.dao;

import web.monitoring.tool.entity.Website;

public interface WebsiteDAO {
    void save(Website website);
    void update(Website website);
}
