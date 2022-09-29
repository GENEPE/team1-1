package team.domain;

import java.util.*;
import lombok.*;
import team.domain.*;
import team.infra.AbstractEvent;

@Data
@ToString
public class Paid extends AbstractEvent {

    private Long id;
    private Long totalPrice;
    private Long productId;
    private String cancelYn;
    private Long orderId;

    public Paid(PaymentHistory aggregate) {
        super(aggregate);
    }

    public Paid() {
        super();
    }
}
