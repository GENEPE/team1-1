package team.external;

import java.util.Date;
import lombok.Data;

@Data
public class Management {

    private Long productId;
    private String productName;
    private Long rentUnitPrice;
    private Boolean rentAvailable;
}
