package e2.q3;

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
    public static String getEncryptorType(){
        try{
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("src//main//java//e2.q3//config.xml"));
            //获取包含类型的文本结点
            NodeList nl = doc.getElementsByTagName("encryptorType");
            Node classNode = nl.item(0).getFirstChild();
            String encryptorType = classNode.getNodeValue().trim();
            return encryptorType;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
