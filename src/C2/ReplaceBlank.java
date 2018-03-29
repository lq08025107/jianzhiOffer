package C2;

public class ReplaceBlank {
    /**
     * 目标：实现一个函数，把字符串中所有空格替换为 %20
     * 解题思路：java里只能创建新数组，c++里可以从后往前移，达到O（n）
     * @param s
     * @return
     */
    public static String replaceBlank(String s){
        int count = 0;
        char[] schar = s.toCharArray();
        for (int i = 0; i < schar.length; i++){
            if(schar[i] == ' ')
                count++;
        }
        int newLength = schar.length + 2 * count;
        char[] newchar = new char[newLength];
        int j = 0;
        for(int i = 0; i < schar.length; i++){
            if(schar[i] == ' '){
                newchar[j++] = '2';
                newchar[j++] = '0';
                newchar[j++] = '%';
            }
            else
                newchar[j++] = schar[i];
        }
        return String.valueOf(newchar);
    }
    public static void main(String[] args){
        String result = replaceBlank("I love you");
        System.out.println(result);

    }
}
