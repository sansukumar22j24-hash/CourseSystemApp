package CourseSystem;

public class Main {
    public static void main(String[] args) {
        // create the student object datatype variable and constructor
        //now fill the all values using the setmethods for courseid,fee,durationweek;
        Student student1= new Student();
        student1.setCourseId(123);
        student1.setFee(2000);
        student1.setCourseType("ONLINE");
        student1.setDurationWeek(4);
        //checking wheater coursetype is  equals to ONLINE
        //OnlineCourse object is creating here for get the data from the user and setting to the onlinecourse
        {
            OnlineCourse onlineCourse = new OnlineCourse();
            if (student1.getCourseType() == "ONLINE") {
                System.out.println("===== STUDENT 1: ONLINE =====");
                System.out.println("Enrollment Successful");
                onlineCourse.setFee(student1.getFee());
                System.out.print("Fee: ");
                int a = onlineCourse.enroll(student1.getDurationWeek());
                System.out.println(a);
                onlineCourse.downloadMaterials();

            }
            else{
                System.out.println("===== STUDENT 1: ONLINE =====");
                System.out.println("Enrollment Successful");
                onlineCourse.setFee(student1.getFee());
                System.out.print("Fee: ");
                int a = onlineCourse.enroll(student1.getDurationWeek());
                System.out.println(a);
                onlineCourse.downloadMaterials();
                onlineCourse.dropout();


            }

        }
        System.out.println();


        Student student2= new Student();
        student2.setCourseId(123);
        student2.setFee(2000);
        student2.setCourseType("OFFLINE");
        student2.setDurationWeek(4);


        {
            OfflineCourse offlineCourse = new OfflineCourse();
            if (student2.getCourseType() == "OFFLINE") {
                System.out.println("===== STUDENT 2: OFFLINE =====");
                System.out.println("Enrollment Successful");
                offlineCourse.setFee(student2.getFee());
                System.out.print("Fee: ");
                int a = offlineCourse.enroll(student2.getDurationWeek());
                System.out.println(a);
                offlineCourse.getLabAccess();


            }
            else{
                System.out.println("===== STUDENT 2: OFFLINE =====");
                System.out.println("Enrollment Successful");
                offlineCourse.setFee(student2.getFee());
                System.out.print("Fee: ");
                int a = offlineCourse.enroll(student2.getDurationWeek());
                System.out.println(a);
                offlineCourse.getLabAccess();
                offlineCourse.dropout();



            }

        }

    }
}