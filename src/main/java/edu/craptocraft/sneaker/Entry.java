package edu.craptocraft.sneaker;


import java.util.Objects;

public class Entry
{
    private String email;
    private String userName;
    private String address;
    private Double total;
    private String payment;
    private Sizes size;



    public Entry(){}

    public Entry(String email)
    {
        this.email = email;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPayment()
    {
        return payment;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void setTotal(Double total)
    {
        this.total = total;
    }

    public void setSize(Sizes size)
    {
        this.size = size;
    }

    public void payment(String payment)
    {
        this.payment = payment;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n").append("email: ").append(email)
                .append("\n")
                .append("Size: ").append(size)
                .append("\n")
                .append("Address: ").append(address)
                .append("\n")
                .append("Payment: ").append(payment)
                .append("\n")
                .append("Total: ").append(total)
                .append("\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entry entry = (Entry) o;
        return Objects.equals(email, entry.email) || Objects.equals(payment, entry.payment);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(email, payment);
    }
}
