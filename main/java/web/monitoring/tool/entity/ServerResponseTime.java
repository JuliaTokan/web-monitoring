package web.monitoring.tool.entity;

import javax.persistence.*;

@Entity
@Table(name = "server_response_time")
public class ServerResponseTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", insertable = false, updatable = false, nullable = false)
    private Long id;
    @Column(name = "ok", nullable = false)
    private int ok;
    @Column(name = "warning", nullable = false)
    private int warning;
    @Column(name = "critical", nullable = false)
    private int critical;

    public ServerResponseTime() {
    }

    public ServerResponseTime(int ok, int warning, int critical) {
        this.ok = ok;
        this.warning = warning;
        this.critical = critical;
    }
}
