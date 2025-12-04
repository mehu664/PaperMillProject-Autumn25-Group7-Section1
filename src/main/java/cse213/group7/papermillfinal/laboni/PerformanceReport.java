package cse213.group7.papermillfinal.laboni;

public class PerformanceReport {
    private String metric;
    private String score;
    private String rating;
    private String comments;

    public PerformanceReport(String metric, String score, String rating, String comments) {
        this.metric = metric;
        this.score = score;
        this.rating = rating;
        this.comments = comments;
    }

    public String getMetric() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "PerformanceReport{" +
                "metric='" + metric + '\'' +
                ", score='" + score + '\'' +
                ", rating='" + rating + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}
