package hello.pf.domain;

import java.util.List;

public class Quotation {
    
    private Long id;
    
    private String name;
    
    private List<QuotationLine> quotationLines;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<QuotationLine> getQuotationLines() {
        return quotationLines;
    }

    public void setQuotationLines(List<QuotationLine> quotationLines) {
        this.quotationLines = quotationLines;
    }

}
