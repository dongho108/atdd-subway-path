package wooteco.subway.admin.dto;

import java.time.LocalTime;

public class LineRequest {
    private String name;
    private LocalTime startTime;
    private LocalTime endTime;
    private int intervalTime;

    public LineRequest() {
    }

    public String getName() {
        return name;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public int getIntervalTime() {
        return intervalTime;
    }
}
