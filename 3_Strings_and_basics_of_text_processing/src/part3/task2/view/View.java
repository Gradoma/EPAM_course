package part3.task2.view;

public class View {
    private String result = "";

    public void append (String head, String name){
        if (checkNameToSlash(name)){
            name = trimSlash(name);
        }
        result += head + " : " + name;
        result += "\n";
    }

    public String getResult (){
        return result;
    }

    private boolean checkNameToSlash (String name){
        return name.contains("/");
    }

    private String trimSlash (String name){
        int slashIndex = name.indexOf('/');
        if(slashIndex == 0){
            return name.substring(1);
        }
        return name.substring(0, slashIndex);
    }
}
