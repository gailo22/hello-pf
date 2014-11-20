package hello.pf.web.beans;

import hello.pf.domain.QuotationLine;
import hello.pf.web.search.SearchableBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class QuotationLineSearchBean implements SearchableBean<QuotationLine> {

    @Override
    public QuotationLine search(String id) {
        return null;
    }

}
