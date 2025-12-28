package CourseSystem;

public abstract class BaseFunctionalities implements BaseFunctionalityInterface{
    private int courseId, fee;

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
    public void dropout(){
        System.out.println("Dropout Processed");
    }
}
