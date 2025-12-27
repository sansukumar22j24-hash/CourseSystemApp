package CourseSystem;

public class OfflineCourse {
    private int courseId;
    private int  fee;

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
    public int  enroll(int weeks){
        int enroll= weeks*1000;
        this.fee=enroll;
        return this.fee;
    }
    public void getLabAccess(){
        System.out.println("Lab Access Granted");
    }
    void dropout(){
        System.out.println("Dropout Processed");
    }
}
