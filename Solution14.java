public class Solution {
    public String replaceSpace(StringBuffer str) {
        int count = 0;
    	for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ')
                count++;
        }
        int new_length = str.length() + count * 2;
        int old_index = str.length() - 1;
        int new_index = new_length - 1;
        str.setLength(new_length);
        
        while(old_index < new_index) {
            if(str.charAt(old_index) == ' ') {
                str.setCharAt(new_index--, '0');
                str.setCharAt(new_index--, '2');
                str.setCharAt(new_index--, '%');
                old_index--;
            } else {
                str.setCharAt(new_index, str.charAt(old_index));
                new_index--;
                old_index--;
            }
        }
        return str.toString();
    }
}