package com.tpe;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// java tabanlı web uygu. web.xml dosyası ile config edilir.
//abstrac.. clasının metodlarını override ederek DispatcherServletın configure edilmesini ve
// başlatılmasını kolaylaştırılır.

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    /* dispatcher:
        Servlet WebAppContext --> controller-viewresolver-handlermapping
        Root WebAppContext --> dataya erişim : services-repos

     */
    @Override
    protected Class<?>[] getRootConfigClasses() { // dataya erişim (hibernate)
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {// controller-viewresolver-handlermapping
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
        return new String[0];
    }
}
