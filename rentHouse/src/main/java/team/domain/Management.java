package team.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import team.RentHouseApplication;
import team.domain.BicycleRepaired;
import team.domain.BikeArrivaled;

@Entity
@Table(name = "Management_table")
@Data
public class Management {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;

    private String productName;

    private Long rentUnitPrice;

    private Boolean rentAvailable;

    @PostPersist
    public void onPostPersist() {
        BikeArrivaled bikeArrivaled = new BikeArrivaled(this);
        bikeArrivaled.publishAfterCommit();

        BicycleRepaired bicycleRepaired = new BicycleRepaired(this);
        bicycleRepaired.publishAfterCommit();
    }

    public static ManagementRepository repository() {
        ManagementRepository managementRepository = RentHouseApplication.applicationContext.getBean(
            ManagementRepository.class
        );
        return managementRepository;
    }

    public static void bikeConditionChange(BikeArrivaled bikeArrivaled) {
        /** Example 1:  new item 
        Management management = new Management();
        repository().save(management);

        */

        /** Example 2:  finding and process
        
        repository().findById(bikeArrivaled.get???()).ifPresent(management->{
            
            management // do something
            repository().save(management);


         });
        */

    }

    public static void bikeConditionChange(BicycleRepaired bicycleRepaired) {
        /** Example 1:  new item 
        Management management = new Management();
        repository().save(management);

        */

        /** Example 2:  finding and process
        
        repository().findById(bicycleRepaired.get???()).ifPresent(management->{
            
            management // do something
            repository().save(management);


         });
        */

    }

    public static void bikeConditionChange(Paid paid) {
        /** Example 1:  new item 
        Management management = new Management();
        repository().save(management);

        */

        /** Example 2:  finding and process
        
        repository().findById(paid.get???()).ifPresent(management->{
            
            management // do something
            repository().save(management);


         });
        */

    }

    public static void bikeConditionChange(Returned returned) {
        /** Example 1:  new item 
        Management management = new Management();
        repository().save(management);

        */

        /** Example 2:  finding and process
        
        repository().findById(returned.get???()).ifPresent(management->{
            
            management // do something
            repository().save(management);


         });
        */

    }
@Table(name="Management_table")
public class Management  {
    
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void onPostPersist(){
    public static ManagementRepository repository(){
        ManagementRepository managementRepository = RentHouseApplication.applicationContext.getBean(ManagementRepository.class);
    public static void bikeConditionChange(BikeArrivaled bikeArrivaled){
    public static void bikeConditionChange(BicycleRepaired bicycleRepaired){
    public static void bikeConditionChange(Paid paid){
    public static void bikeConditionChange(Returned returned){
}
