public class richestsum {
    public static int findRichest(int[][] accounts){
        int max = Integer.MIN_VALUE;
        for(int personAccount = 0;personAccount<accounts.length;personAccount++){
            int sum = 0;
            for(int person= 0;person<accounts[personAccount].length;person++){
                sum = sum+= accounts[personAccount][person];
            }
            if(max<sum){
                max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] accounts = {
            {4,5,7},
            {1,1,1},
        };
        System.out.println(findRichest(accounts));
    }
}
