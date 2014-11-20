package hello.pf.web.beans;

import hello.pf.domain.Quotation;
import hello.pf.web.search.SearchableBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class QuotationSearchBean implements SearchableBean<Quotation> {

    @Override
    public Quotation search(String id) {
        return null;
    }

}
