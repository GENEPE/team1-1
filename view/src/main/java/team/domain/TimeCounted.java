package team.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "TimeCounted_table")
@Data
public class TimeCounted {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
}
