package CourseSystem;

public class Student implements StudentInterface{
    private int courseId;
    private int   fee;
    private String courseType;
    private int durationWeek;


    public int getCourseId() {
        return courseId;
    }
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public int getDurationWeek() {
        return durationWeek;
    }

    public void setDurationWeek(int durationWeek) {
        this.durationWeek = durationWeek;
    }





}