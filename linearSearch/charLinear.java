public class charLinear {
    public static int  charFound(String name,char target){
        for(int i=0;i<=name.length()-1;i++){
            if(target==name.charAt(i)){
                return i;
            }
        }
        return-1;
    }
    public static void main(String[] args) {
        String name = "Aymaan";
        char target = 'm';
        System.out.println(charFound(name, target));

    }
}
