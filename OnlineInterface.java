package CourseSystem;

public interface OnlineInterface {
    public int getCourseId();
    public void setCourseId(int courseId);
    public int getFee();
    public void setFee(int fee);
    public void dropout();
    public void downloadMaterials();
}
