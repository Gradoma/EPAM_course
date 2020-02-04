package part3.task2.logic;

import part3.task2.data.DataConverter;
import part3.task2.view.View;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Logic {

    public String parse (String fileAddress) throws Exception{
        DataConverter dataConverter = new DataConverter();
        String inputString = dataConverter.getStringData(fileAddress);

        View view = new View();

        Pattern tag = Pattern.compile("<(.+?)>([^<$]*)");            // is it correct?
        Matcher m = tag.matcher(inputString);

        while (m.find()){
            String elementType = analyzeElement(m.group(1));
            view.append(elementType, m.group(1));
            if (m.group(2).contains("\n") | m.group(2).length() == 0){  //doesn't works with equals(contains only). why?
                continue;
            }
            view.append(m.group(1), m.group(2));
        }
        return view.getResult();
    }

    private String analyzeElement (String element){
        if (element.contains("/")){
            Pattern endElement = Pattern.compile("^/.+");
            Matcher matcher = endElement.matcher(element);
            if (matcher.find()){
                return "End element";
            } else {
                return "Empty element";
            }
        } else {
            return "Start element";
        }
    }
}
