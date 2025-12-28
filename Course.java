package CourseSystem;

public abstract class Course extends BaseFunctionalities implements CourseInterface{
    public int  enroll(int weeks){
        int enroll= weeks*500;
        setFee(enroll);
        return getFee();
    }


}