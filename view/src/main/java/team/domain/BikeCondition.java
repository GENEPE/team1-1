package team.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "BikeCondition_table")
@Data
public class BikeCondition {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
}
