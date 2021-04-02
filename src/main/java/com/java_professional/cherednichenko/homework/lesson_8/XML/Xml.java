package com.java_professional.cherednichenko.homework.lesson_8.XML;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.FileOutputStream;

@AllArgsConstructor
@Getter
@Setter
public class Xml {
    private File file;
    private Vehicle vehicle;

    public void toXml() {
        try {
            JAXBContext context = JAXBContext.newInstance(Vehicle.class, Car.class, Bike.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(this.vehicle, new FileOutputStream(this.file));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fromXml() {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            DefaultHandler handler = new DefaultHandler() {
                boolean name = false;

                @Override
                public void startElement(String uri, String localName, String secondName, Attributes attributes) {
                    if (secondName.equalsIgnoreCase("car")) {
                        System.out.println("Car:");
                    }
                    if (secondName.equalsIgnoreCase("bike")) {
                        System.out.println("Bike:");
                    }
                    if (secondName.equalsIgnoreCase("brand")) {
                        System.out.print("Brand: ");
                        name = true;
                    }
                    if (secondName.equalsIgnoreCase("speed")) {
                        System.out.print("Speed: ");
                        name = true;
                    }
                }

                @Override
                public void characters(char[] chars, int start, int length) {
                    if (name) {
                        System.out.println(new String(chars, start, length));
                        name = false;
                    }
                }
            };
            saxParser.parse(this.file, handler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
