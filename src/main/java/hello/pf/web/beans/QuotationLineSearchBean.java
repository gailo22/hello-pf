package hello.pf.web.beans;

import hello.pf.domain.QuotationLine;
import hello.pf.web.search.SearchableBean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class QuotationLineSearchBean implements SearchableBean<QuotationLine>, Serializable {

    private static final long serialVersionUID = -8293609968629103422L;

    @Override
    public QuotationLine search(String id) {
        return null;
    }

}
