package team.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import team.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "managements",
    path = "managements"
)
public interface ManagementRepository
    extends PagingAndSortingRepository<Management, Long> {}
