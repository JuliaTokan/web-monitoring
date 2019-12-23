package web.monitoring.tool;

import web.monitoring.tool.entity.ResponseSize;
import web.monitoring.tool.entity.ServerResponseTime;
import web.monitoring.tool.entity.Website;
import web.monitoring.tool.services.ResponseSizeService;
import web.monitoring.tool.services.ServerResponseTimeService;
import web.monitoring.tool.services.WebsiteService;

import javax.imageio.spi.RegisterableService;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        WebsiteService websiteService = new WebsiteService();
        /*ServerResponseTimeService serverResponseTimeService = new ServerResponseTimeService();
        ResponseSizeService responseSizeService = new ResponseSizeService();

        ResponseSize responseSize = new ResponseSize(10,100);
        responseSizeService.saveResponseSize(responseSize);
        ServerResponseTime serverResponseTime = new ServerResponseTime(10,20,30);
        serverResponseTimeService.saveServerResponseTime(serverResponseTime);*/
        Website website1 = new Website("dfsdfdfgfdgsfgsdfsdgsdgfsdfg", 1000, 10,20,30, 200, 10,100);
        websiteService.saveWebsite(website1);
        Website website2 = new Website("dfsdfdfgfdgsfgsdfsdgsdgfsdfg", 1000, 10,20,30, 200, 10,100);
        websiteService.saveWebsite(website2);
        Website website3 = new Website("dfsdfdfgfdgsfgsdfsdgsdgfsdfg", 1000, 10,20,30, 200, 10,100);
        websiteService.saveWebsite(website3);
    }
}
