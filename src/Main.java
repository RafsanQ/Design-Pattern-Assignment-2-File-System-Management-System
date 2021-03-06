public class Main {
    public static void main(String[] args) {

        // File and folder creation
        File strategy = new File("Strategy Pattern", "ppt");
        File observer = new File("Observer Pattern", "pdf");
        File midSyllabus = new File("Mid Syllabus", "doc");
        File composite = new File("Composite Pattern","ppt");
        File finalSyllabus = new File("Final Syllabus","pdf");
        File assignment1 = new File("Assignment-1","pdf");
        File assignment2 = new File("Assignment-2","pdf");
        File readME = new File("readME","text");

        Folder midExam = new Folder("Mid Exam", "Folder");
        Folder finalExam = new Folder("Final Exam","Folder");
        Folder Lectures = new Folder("Lectures", "Folder");
        Folder assignments = new Folder("Assignments", "Folder");
        Folder DP= new Folder("Design Pattern", "Folder");


        // Adding the files and checking the output with single and double clicks.

        midExam.add(strategy);
        midExam.add(observer);

        midExam.singleClick();
        midExam.doubleClick();

        midExam.add(midSyllabus);
        finalExam.add(composite);
        finalExam.add(finalSyllabus);
        Lectures.add(midExam);
        Lectures.add(finalExam);
        assignments.add(assignment1);
        assignments.add(assignment2);
        DP.add(Lectures);
        DP.add(readME);
        DP.add(assignments);

        midExam.singleClick();
        midExam.doubleClick();


        midExam.add(midSyllabus);
        finalExam.add(composite);
        finalExam.add(finalSyllabus);
        Lectures.add(midExam);
        Lectures.add(finalExam);
        assignments.add(assignment1);
        assignments.add(assignment2);
        DP.add(Lectures);
        DP.add(readME);
        DP.add(assignments);

        DP.singleClick();
        DP.doubleClick();

        // Remove readme and check the contents again
        DP.remove(readME);

        DP.doubleClick();



    }
}
