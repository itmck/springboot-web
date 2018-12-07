package com.itmck.springbootweb.dom4jcommons;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.File;
import java.util.List;

/**
 * Create by it_mck 2018/12/7 8:40
 *
 * @Description:
 * @Version: 1.0
 */
public class Dom4jDemo2 {


    /**
     * 已经知道属性名的情况下
     *
     * @throws DocumentException
     */
    @Test
    public void run1() throws DocumentException {

        //创建SAXReader的reader对象
        SAXReader saxReader = new SAXReader();
        //创建文件路径对象
        File file = new File("E:\\ideapro\\springboot-web\\src\\main\\java\\com\\itmck\\springbootweb\\dom4jcommons\\dom4j2.xml");
        //创建文档对象
        Document document = saxReader.read(file);
        //获取xml根节点
        Element rootElement = document.getRootElement();
        //获取根元素下面的子元素
        List<Element> elements = rootElement.elements();
        for (Element child : elements) {
            //已经知道属性名的情况下
            System.out.println("id:" + child.attributeValue("id"));
            System.out.println("title:" + child.elementText("title"));
            System.out.println("author:" + child.elementText("author"));
        }
    }

    /**
     * 未知属性名的情况下
     */
    @Test
    public void run2() throws DocumentException {

        //创建SAXReader的 reader对象
        SAXReader saxReader = new SAXReader();
        //创建路径对象
        File file = new File("E:\\ideapro\\springboot-web\\src\\main\\java\\com\\itmck\\springbootweb\\dom4jcommons\\dom4j2.xml");
        //创建文档对象
        Document document = saxReader.read(file);
        //获取xml根节点
        Element rootElement = document.getRootElement();
        //获取根节点下面的子节点
        List<Element> elements = rootElement.elements();
        for (Element child : elements) {

            //未知属性的情况下
            List<Attribute> attributes = child.attributes();
            for (Attribute attr : attributes) {
                System.out.println(attr.getName() + ":" + attr.getValue());
                List<Element> childElements = child.elements();
                for (Element ele : childElements) {
                    System.out.println(ele.getName() + ":" + ele.getText());
                }
            }
        }
    }
}
