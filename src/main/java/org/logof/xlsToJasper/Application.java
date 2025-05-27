package org.logof.xlsToJasper;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.logof.xlsToJasper.jasper.Creator;
import org.logof.xlsToJasper.jasper.report.JasperReport;
import org.logof.xlsToJasper.model.MetaData;
import org.logof.xlsToJasper.reader.ExcelReader;

public class Application {

  public static void main(String[] args) throws JAXBException, FileNotFoundException {
    ExcelReader excelReader = new ExcelReader("/home/user/EBS/input.xlsx");
    MetaData metaData = excelReader.parsing();

    Creator reportCreator = new Creator();
    JasperReport report = new JasperReport();
    report.setName("INPUT");

    reportCreator.createProperties(report);
    reportCreator.createFields(report, metaData);
    report.setDetail(reportCreator.createDetail(metaData));

    serializeToXml(report, "/home/user/EBS/input_1.jrxml");
  }

  private static void serializeToXml(JasperReport jasperReport,
                                     String xmlFilePath) throws JAXBException,
                                                                FileNotFoundException {
    JAXBContext context = JAXBContext.newInstance(JasperReport.class);
    Marshaller marshaller = context.createMarshaller();
    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
    marshaller.marshal(jasperReport, new FileOutputStream(xmlFilePath));
  }
}
