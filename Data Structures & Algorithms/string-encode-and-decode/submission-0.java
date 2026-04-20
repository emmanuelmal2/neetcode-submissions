class Solution {

    private String separator = "#"; 

    public String encode(List<String> strs) {
        StringBuffer output = new StringBuffer();
        for(String str: strs){
            String length = String.valueOf(str.length());
            output.append(length + separator + str);
        }

        return output.toString();

    }

    public List<String> decode(String str) {
        List<String> output = new ArrayList<>();
        String length = " ";
        for(int i=0; i<str.length();i++){
            length = length + str.charAt(i);
            if(str.charAt(i) == '#'){
                length = length.substring(0, length.length() - 1).trim();
                output.add(str.substring(i+1, i+ Integer.valueOf(length)+1));
                i = i + Integer.valueOf(length);
                length = "";
            }
        }

        return output;

    }
}
