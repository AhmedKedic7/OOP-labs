package lab11.ThirdTask;

public class CamelCaseFormatter implements TextFormatter{
    @Override
    public String formatText(String text) {
        StringBuilder res= new StringBuilder();
        boolean capitalizeNext = true;
        for (char c : text.toCharArray()){
            if (Character.isWhitespace(c)){
                capitalizeNext=true;
            }else if(capitalizeNext){
                res.append(Character.toUpperCase(c));
                capitalizeNext= false;
            }
            else{
                res.append(Character.toLowerCase(c));
            }


        }

        return res.toString();
    }
}
