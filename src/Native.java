public class Native {
    private int cohortId;
    private int scvId;


    public int getCohortId() {
        return cohortId;
    }

    public void setCohortId(int cohortId) {
        if (cohortId == 12) {
            this.cohortId = cohortId;
        }
    }

    public int getScvId() {
        return scvId;
    }

    public void setScvId(int scvId) {
        this.scvId = scvId;
    }
}
