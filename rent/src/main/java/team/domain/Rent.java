package team.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import team.RentApplication;
import team.domain.BikeRented;
import team.domain.RentalCanceled;
import team.domain.Returned;

@Entity
@Table(name = "Rent_table")
@Data
public class Rent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;

    private Long productId;

    private Date startTime;

    private Date endTime;

    private Long rentHour;

    private Long totalPrice;

    @PostPersist
    public void onPostPersist() {
        Returned returned = new Returned(this);
        returned.publishAfterCommit();

        RentalCanceled rentalCanceled = new RentalCanceled(this);
        rentalCanceled.publishAfterCommit();

        BikeRented bikeRented = new BikeRented(this);
        bikeRented.publishAfterCommit();
        // Get request from Management
        //team.external.Management management =
        //    Application.applicationContext.getBean(team.external.ManagementService.class)
        //    .getManagement(/** mapping value needed */);

    }

    public static RentRepository repository() {
        RentRepository rentRepository = RentApplication.applicationContext.getBean(
            RentRepository.class
        );
        return rentRepository;
    }
@Table(name="Rent_table")
public class Rent  {
    
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void onPostPersist(){
    public static RentRepository repository(){
        RentRepository rentRepository = RentApplication.applicationContext.getBean(RentRepository.class);
}
