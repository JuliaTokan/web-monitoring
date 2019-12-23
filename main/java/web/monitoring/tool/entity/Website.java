package web.monitoring.tool.entity;

import javax.persistence.*;

@Entity
@Table(name = "website")
public class Website {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", insertable = false, updatable = false, nullable = false)
    private Long id;

    @Column(name = "url", nullable = false)
    private String url;

    @Column(name = "monitoring_period", nullable = false)
    private int monitoringPeriod;

    @Column(name = "server_response_time_ok", nullable = false)
    private int serverResponseTimeOK;

    @Column(name = "server_response_time_warning", nullable = false)
    private int serverResponseTimeWarning;

    @Column(name = "server_response_time_critical", nullable = false)
    private int serverResponseTimeCritical;

    @Column(name = "HTTP_response_code", nullable = false)
    private int HTTPResponseCode;

    @Column(name = "response_size_min", nullable = false)
    private int responseSizeMin;

    @Column(name = "response_size_max", nullable = false)
    private int responseSizeMax;

    public Website() {
    }

    public Website(String url, int monitoringPeriod, int serverResponseTimeOK, int serverResponseTimeWarning, int serverResponseTimeCritical, int HTTPResponseCode, int responseSizeMin, int responseSizeMax) {
        this.url = url;
        this.monitoringPeriod = monitoringPeriod;
        this.serverResponseTimeOK = serverResponseTimeOK;
        this.serverResponseTimeWarning = serverResponseTimeWarning;
        this.serverResponseTimeCritical = serverResponseTimeCritical;
        this.HTTPResponseCode = HTTPResponseCode;
        this.responseSizeMin = responseSizeMin;
        this.responseSizeMax = responseSizeMax;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getMonitoringPeriod() {
        return monitoringPeriod;
    }

    public void setMonitoringPeriod(int monitoringPeriod) {
        this.monitoringPeriod = monitoringPeriod;
    }

    public int getServerResponseTimeOK() {
        return serverResponseTimeOK;
    }

    public void setServerResponseTimeOK(int serverResponseTimeOK) {
        this.serverResponseTimeOK = serverResponseTimeOK;
    }

    public int getServerResponseTimeWarning() {
        return serverResponseTimeWarning;
    }

    public void setServerResponseTimeWarning(int serverResponseTimeWarning) {
        this.serverResponseTimeWarning = serverResponseTimeWarning;
    }

    public int getServerResponseTimeCritical() {
        return serverResponseTimeCritical;
    }

    public void setServerResponseTimeCritical(int serverResponseTimeCritical) {
        this.serverResponseTimeCritical = serverResponseTimeCritical;
    }

    public int getHTTPResponseCode() {
        return HTTPResponseCode;
    }

    public void setHTTPResponseCode(int HTTPResponseCode) {
        this.HTTPResponseCode = HTTPResponseCode;
    }

    public int getResponseSizeMin() {
        return responseSizeMin;
    }

    public void setResponseSizeMin(int responseSizeMin) {
        this.responseSizeMin = responseSizeMin;
    }

    public int getResponseSizeMax() {
        return responseSizeMax;
    }

    public void setResponseSizeMax(int responseSizeMax) {
        this.responseSizeMax = responseSizeMax;
    }
}
