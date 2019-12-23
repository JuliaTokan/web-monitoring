package web.monitoring.tool.services;

import web.monitoring.tool.dao.ServerResponseTimeDao;
import web.monitoring.tool.entity.ServerResponseTime;

public class ServerResponseTimeService {
    ServerResponseTimeDao serverResponseTimeDao = new ServerResponseTimeDao();

    public void saveServerResponseTime(ServerResponseTime serverResponseTime) {
        serverResponseTimeDao.save(serverResponseTime);
    }
}
