import java.util.*;

public class JavaCollections {
    public static void main(String[] args) {
        
        // 1. List - Store student names in order
        List<String> studentList = new ArrayList<>();
        studentList.add("Amit");
        studentList.add("Neha");
        studentList.add("Ravi");
        System.out.println("Student List (List): " + studentList);

        // 2. Set - Store unique subjects
        Set<String> subjectSet = new HashSet<>();
        subjectSet.add("Math");
        subjectSet.add("Science");
        subjectSet.add("English");
        subjectSet.add("Math"); // Duplicate, won't be added
        System.out.println("Subjects Offered (Set): " + subjectSet);

        // 3. Queue - Store admission requests (FIFO)
        Queue<String> admissionQueue = new LinkedList<>();
        admissionQueue.add("Rahul");
        admissionQueue.add("Pooja");
        admissionQueue.add("Karan");
        System.out.println("Admission Queue (Queue):");
        while (!admissionQueue.isEmpty()) {
            System.out.println("Processing Admission of: " + admissionQueue.poll());
        }

        // 4. Map - Roll number to student name
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Amit");
        studentMap.put(102, "Neha");
        studentMap.put(103, "Ravi");

        System.out.println("Student Roll No - Name Mapping (Map):");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
