package CourseSystem;

public interface OfflineInterface {
    public int getCourseId();
    public void setCourseId(int courseId);
    public int getFee();
    public void setFee(int fee);
    public int  enroll(int weeks);
    public void getLabAccess();
    void dropout();
}
