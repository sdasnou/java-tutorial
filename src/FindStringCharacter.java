public class FindStringCharacter {
    public static void main(String[] args) {
        String mainString = "baannnnaaanna";
        char searchString = 'a';
        int count = 0 , maxCount = 0;
        for (int i = 0; i <mainString.length(); i++){
            char ch = mainString.charAt(i);
            if (ch == searchString ){
                count ++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    count =0;
                }
            }
        }

        if (count > maxCount) {
            maxCount = count;
        }

        System.out.println(maxCount);
    }
}
