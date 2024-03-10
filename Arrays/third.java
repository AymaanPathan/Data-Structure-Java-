

public class third {
    public static void UpdatedMarks(int marks[]){
        for(int i=0;i<marks.length;i++){
           marks[i] = marks[i] +1; 
        }
    }
    public static void main(String[] args) {
        int[] marks = {97,98,99};
        UpdatedMarks(marks);

        for(int i=0;i<marks.length;i++){
            System.out.println("Updated Mrks: "+marks[i]);
        }
    }
}
