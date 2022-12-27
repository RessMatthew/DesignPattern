package e2.q14;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * @Description
 * @Date 2022/12/6 20:18
 * @Author RessMatthew
 * @Version 1.0
 **/

public class XMLUtil {
    public static Object getLevelMessage(){
        return getMyClass("levelMessage");
    }
    public static Object getSendMethod(){
        return getMyClass("sendMethod");
    }
    private static Object getMyClass(String className){
        try{
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("src//main//java//e2.q14//config.xml"));

            //获取包含类型的文本结点
            NodeList nl = doc.getElementsByTagName(className);
            Node classNode = nl.item(0).getFirstChild();
            String imagerReaderName = classNode.getNodeValue().trim();

            //通过类名生成实例对象
            Class c = Class.forName(imagerReaderName);
            Object obj = c.newInstance();
            return obj;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
