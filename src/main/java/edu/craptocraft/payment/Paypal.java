package edu.craptocraft.payment;

import edu.craptocraft.payment.Payment;

import java.util.HashMap;
import java.util.Map;

public class Paypal implements Payment
{
    Map<String, Double> mUsers = new HashMap<>();

    public Paypal() {
        String[] emails = {"summer@paypal.com", "birdman@paypal.com", "morty@paypal.com", "summer@paypal.com"};

        for (String email: emails) {
            mUsers.put(email, 200d);
        }
    }

    @Override
    public boolean autentication(String auth)
    {
        return mUsers.containsKey(auth);
    }

    @Override
    public boolean pay(String email, Double price)
    {
        if (this.autentication(email)){
            Double userCredit = mUsers.get(email);

            if (userCredit >= price) {
                userCredit -= price;

                mUsers.put(email, userCredit);

                return true;
            }
        }

        return false;
    }

    @Override
    public Double credit(String credit)
    {
        return mUsers.get(credit);
    }
}
