package hello.pf.web.beans;

import hello.pf.domain.Quotation;
import hello.pf.web.search.SearchableBean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class QuotationSearchBean implements SearchableBean<Quotation>, Serializable {

    private static final long serialVersionUID = -7755100060693351239L;

    @Override
    public Quotation search(String id) {
        return null;
    }

}
