package team.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import team.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "timeCounteds",
    path = "timeCounteds"
)
public interface TimeCountedRepository
    extends PagingAndSortingRepository<TimeCounted, Long> {}
