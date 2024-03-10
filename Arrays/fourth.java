
// Linear Search
public class fourth {

    public static int linear(int[] marks, int x) {
        for(int i=0;i<marks.length;i++){
            if(x==marks[i]) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] marks = {96,97,98,99,100};
        int x = 98; 

        int search = linear(marks, x);
        if(search==-1) {
            System.out.println("X Not Found! ");
        } else {
            System.out.println("X Found in Index: "+search);
        }
        
    }
}
    