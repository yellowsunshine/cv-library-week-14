package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "criteria")
    public Object[][] getData(){
        Object[][] data = new Object[][]{
                {"Tester","Harrow","up to 5 miles","30000","500000","Per annum","Permanent","Permanent Tester jobs in Harrow on the Hill"},
                {"Tester","Edgware","up to 1 mile","2000","5000","Per month","Contract","Contract Tester jobs in Edgware"},
                {"Tester","Wembley","up to 10 miles","100","550","Per day","Part Time","Part Time Tester jobs in Wembley"},
                {"Tester","Stanmore","up to 2 miles","35","200","Per hour","Temporary","Temporary Tester jobs in Stanmore"},
                {"Tester","Pinner","up to 25 miles","25000","100000","Per annum","Apprenticeship","Apprenticeship Tester jobs in Pinner"},
                {"Tester","Ruislip","up to 7 miles","55000","65000","Per annum","Permanent","Permanent Tester jobs in Ruislip"},
                {"Tester","Alperton","up to 750 miles","27000","70000","Per annum","Temporary","Temporary Tester jobs in Alperton"},


        };
        return data;
    }
}
