package cse213.group7.papermillfinal.meher;

public class Goal2 {
    private String materials , status , eta , delayed ;
    private int deliveryId , deliveryDate;

    public Goal2(String materials, String status, String eta, int deliveryId, String delayed, int deliveryDate) {
        this.materials = materials;
        this.status = status;
        this.eta = eta;
        this.deliveryId = deliveryId;
        this.delayed = delayed;
        this.deliveryDate = deliveryDate;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEta() {
        return eta;
    }

    public void setEta(String eta) {
        this.eta = eta;
    }

    public String getDelayed() {
        return delayed;
    }

    public void setDelayed(String delayed) {
        this.delayed = delayed;
    }

    public int getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(int deliveryId) {
        this.deliveryId = deliveryId;
    }

    public int getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(int deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String toString() {
        return "Goal2{" +
                "materials='" + materials + '\'' +
                ", status='" + status + '\'' +
                ", eta='" + eta + '\'' +
                ", delayed='" + delayed + '\'' +
                ", deliveryId=" + deliveryId +
                ", deliveryDate=" + deliveryDate +
                '}';
    }
}
