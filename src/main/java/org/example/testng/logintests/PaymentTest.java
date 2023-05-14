package org.example.testng.logintests;

import org.testng.annotations.Test;

public class PaymentTest {

    @Test
    public void paymentInDollar(){
        System.out.println("Payment in Dollar");
    }
    @Test
    public void paymentInNis(){
        System.out.println("Payment in New Israeli Shekel");
    }
}
