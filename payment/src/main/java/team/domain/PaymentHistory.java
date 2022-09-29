package team.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import team.PaymentApplication;
import team.domain.Paid;

@Entity
@Table(name = "PaymentHistory_table")
@Data
public class PaymentHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long totalPrice;

    private Long productId;

    private String cancelYn;

    private Long orderId;

    @PostPersist
    public void onPostPersist() {
        Paid paid = new Paid(this);
        paid.publishAfterCommit();
    }

    public static PaymentHistoryRepository repository() {
        PaymentHistoryRepository paymentHistoryRepository = PaymentApplication.applicationContext.getBean(
            PaymentHistoryRepository.class
        );
        return paymentHistoryRepository;
    }

    public static void cancelRequest(RentalCanceled rentalCanceled) {
        /** Example 1:  new item 
        PaymentHistory paymentHistory = new PaymentHistory();
        repository().save(paymentHistory);

        */

        /** Example 2:  finding and process
        
        repository().findById(rentalCanceled.get???()).ifPresent(paymentHistory->{
            
            paymentHistory // do something
            repository().save(paymentHistory);


         });
        */

    }

    public static void payment(BikeRented bikeRented) {
        /** Example 1:  new item 
        PaymentHistory paymentHistory = new PaymentHistory();
        repository().save(paymentHistory);

        */

        /** Example 2:  finding and process
        
        repository().findById(bikeRented.get???()).ifPresent(paymentHistory->{
            
            paymentHistory // do something
            repository().save(paymentHistory);


         });
        */

    }
@Table(name="PaymentHistory_table")
public class PaymentHistory  {
    
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void onPostPersist(){
    public static PaymentHistoryRepository repository(){
        PaymentHistoryRepository paymentHistoryRepository = PaymentApplication.applicationContext.getBean(PaymentHistoryRepository.class);
    public static void cancelRequest(RentalCanceled rentalCanceled){
    public static void payment(BikeRented bikeRented){
}
