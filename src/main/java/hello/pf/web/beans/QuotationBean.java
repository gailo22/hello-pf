package hello.pf.web.beans;

import hello.pf.domain.Quotation;
import hello.pf.web.search.ApprovableBean;
import hello.pf.web.search.EditableBean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.context.RequestContext;

@ManagedBean
@ViewScoped
public class QuotationBean implements ApprovableBean<Quotation>, EditableBean<Quotation>, Serializable {

    private static final long serialVersionUID = -1473868872541090990L;

    @Override
    public void edit(Quotation quotation) {
        
    }

    @Override
    public boolean approve(Quotation t) {
        return false;
    }
    
    
    public void viewDialog(String dialogName) {
        System.out.println("open dialog...");
        
        Map<String,Object> options = new HashMap<String, Object>();
        options.put("modal", true);
        options.put("draggable", false);
        options.put("resizable", false);
        options.put("contentHeight", 320);
        RequestContext.getCurrentInstance().openDialog(dialogName, options, null);
    }

}
