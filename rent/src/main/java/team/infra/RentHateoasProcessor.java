package team.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import team.domain.*;

@Component
public class RentHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Rent>> {

    @Override
    public EntityModel<Rent> process(EntityModel<Rent> model) {
        return model;
    }
}
