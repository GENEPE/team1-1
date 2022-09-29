package team.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import team.domain.*;

@RepositoryRestResource(collectionResourceRel = "rents", path = "rents")
public interface RentRepository
    extends PagingAndSortingRepository<Rent, Long> {}
