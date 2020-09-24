package quanlyks;

import java.util.ArrayList;
import java.util.List;

public class ListTax  {
    private double sumTaxDay = 0;
    private double sumTaxHour = 0;
    private List<Tax>  ls = new ArrayList<>();

    public void addCustormer(String type){
        if(type == HotelDefined.TAX_DAY){
            Tax taxDay = new TaxDay();
            taxDay.input();
            this.sumTaxDay += ((TaxDay) taxDay).getCashPay();
            this.ls.add(taxDay);
        }else if(type == HotelDefined.TAX_HOUR){
            Tax taxHour = new TaxHour();
            taxHour.input();
            this.sumTaxHour += ((TaxHour) taxHour).getCashPay();
        }else {
            System.out.println("Type wrong");
        }
    }

    public void display(){
        for(Tax tax:this.ls){
            System.out.println(tax.toString());
        }
    }

}
