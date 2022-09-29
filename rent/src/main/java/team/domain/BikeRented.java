package team.domain;

import java.util.*;
import lombok.*;
import team.domain.*;
import team.infra.AbstractEvent;

@Data
@ToString
public class BikeRented extends AbstractEvent {

    private Long orderId;
    private Long productId;
    private Date startTime;
    private Date endTime;
    private Long rentHour;
    private Long totalPrice;

    public BikeRented(Rent aggregate) {
        super(aggregate);
    }

    public BikeRented() {
        super();
    }
}
