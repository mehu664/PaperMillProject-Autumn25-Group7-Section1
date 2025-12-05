package cse213.group7.papermillfinal.laboni;

public class Survey {
    private String orderId;
    private String customer;
    private int rating;
    private String feedback;

    public Survey(String orderId, String customer, int rating, String feedback) {
        this.orderId = orderId;
        this.customer = customer;
        this.rating = rating;
        this.feedback = feedback;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @Override
    public String toString() {
        return "Survey{" +
                "orderId='" + orderId + '\'' +
                ", customer='" + customer + '\'' +
                ", rating=" + rating +
                ", feedback='" + feedback + '\'' +
                '}';
    }
}
