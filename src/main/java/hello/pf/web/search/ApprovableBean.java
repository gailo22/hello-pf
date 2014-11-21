package hello.pf.web.search;

public interface ApprovableBean<T, B> {
    
    B approve(T t);
    
    B cancel(T t);

}
