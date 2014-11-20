package hello.pf.web.beans;

import hello.pf.domain.Quotation;
import hello.pf.web.search.ApprovableBean;
import hello.pf.web.search.EditableBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class QuotationBean implements ApprovableBean<Quotation>, EditableBean<Quotation> {

    @Override
    public void edit(Quotation quotation) {
        
    }

    @Override
    public boolean approve(Quotation t) {
        return false;
    }

}
