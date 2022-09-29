package team.external;

import java.util.Date;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "rentHouse", url = "${api.url.rentHouse}")
public interface ManagementService {
    @RequestMapping(
        method = RequestMethod.GET,
        path = "/managements/{productId}"
    )
    public Management getManagement(@PathVariable("productId") Long productId);
}
