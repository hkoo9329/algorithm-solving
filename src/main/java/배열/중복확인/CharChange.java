package 배열.중복확인;

public class CharChange {
    //StringBuilder 사용
    public String chage(String str){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                stringBuilder.append("%20");
            }else
                stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }
    //문자 배열 사용
    public String replaceSpaces(char[] str, int trueLength){
        int spaceCount = 0, index, i =0;
        for(i=0;i<trueLength;i++){
            if(str[i] == ' '){
                spaceCount++;
            }
        }
        index = trueLength + spaceCount*2;
        if(trueLength <str.length){
            str[trueLength] = '\0';
        }
        for (i=trueLength-1;i>=0;i--){
            if (str[i] == ' '){
                str[index-1] ='0';
                str[index-2] ='2';
                str[index-3] = '%';
                index = index-3;
            }else{
                str[index-1] = str[i];
                index--;
            }
        }
        return str.toString();
    }
}
