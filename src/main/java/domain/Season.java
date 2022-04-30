package domain;

public class Season {
    public int id;
    public String startDate;
    public String endDate;
    public int currentMatchDate;
    public Object winner;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getCurrentMatchDate() {
        return currentMatchDate;
    }

    public void setCurrentMatchDate(int currentMatchDate) {
        this.currentMatchDate = currentMatchDate;
    }

    public Object getWinner() {
        return winner;
    }

    public void setWinner(Object winner) {
        this.winner = winner;
    }

    @Override
    public String toString() {
        return "Season{" +
                "id=" + id +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", currentMatchDate=" + currentMatchDate +
                ", winner=" + winner +
                '}';
    }
}
