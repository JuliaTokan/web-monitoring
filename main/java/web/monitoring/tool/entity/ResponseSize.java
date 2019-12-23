package web.monitoring.tool.entity;

import javax.persistence.*;

@Entity
@Table(name = "response_size")
public class ResponseSize {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", insertable = false, updatable = false, nullable = false)
    private Long id;
    @Column(name = "min", nullable = false)
    private int min;
    @Column(name = "max", nullable = false)
    private int max;

    public ResponseSize() {
    }

    public ResponseSize(int min, int max) {
        this.min = min;
        this.max = max;
    }
}
