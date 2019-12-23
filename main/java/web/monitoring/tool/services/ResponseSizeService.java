package web.monitoring.tool.services;

import web.monitoring.tool.dao.ResponseSizeDao;
import web.monitoring.tool.entity.ResponseSize;

public class ResponseSizeService {
    ResponseSizeDao responseSizeDao = new ResponseSizeDao();

    public void saveResponseSize(ResponseSize responseSize) {
        responseSizeDao.save(responseSize);
    }
}
