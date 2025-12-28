package CourseSystem;

public class OfflineCourse extends Course implements OfflineInterface {

    public void getLabAccess(){
        System.out.println("Lab Access Granted");
    }
//    public void enroll(int weeks) {
//        int value = weeks * 1000;
//        this.setFee(value);
//        System.out.println("Fee: " + this.getFee());
//        System.out.println("Offline enrollment successful");
//    }

    public void enroll(int weeks, int days) {
        int n = (7 - days);
        int value = weeks * 1000 * n;
        this.setFee(value);
        System.out.println("Fee");
        System.out.println(  this.getFee());
    }


}