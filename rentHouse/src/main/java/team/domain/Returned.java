package team.domain;

import java.util.*;
import lombok.*;
import team.domain.*;
import team.infra.AbstractEvent;

@Data
@ToString
public class Returned extends AbstractEvent {

    private Long orderId;
    private Long productId;
    private Date startTime;
    private Date endTime;
    private Long rentHour;
    private Long totalPrice;
}
