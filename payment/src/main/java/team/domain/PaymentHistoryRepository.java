package team.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import team.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "paymentHistories",
    path = "paymentHistories"
)
public interface PaymentHistoryRepository
    extends PagingAndSortingRepository<PaymentHistory, Long> {}
