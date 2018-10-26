package com.simon.cloud.word.api.framework.kits;

import org.springframework.security.web.savedrequest.SavedRequest;

import javax.servlet.http.HttpServletRequest;

/**
 * 
 * @author vladimir.stankovic
 *
 * Aug 3, 2016
 */
public class WebUtil {

    private static final String XML_HTTP_REQUEST = "XMLHttpRequest";
    private static final String X_REQUESTED_WITH = "X-Requested-With";

    private static final String CONTENT_TYPE = "Content-type";
    private static final String CONTENT_TYPE_JSON = "application/json";

    public static boolean isAjax(HttpServletRequest request) {
        return XML_HTTP_REQUEST.equals(request.getHeader(X_REQUESTED_WITH));
    }

    public static boolean isAjax(SavedRequest request) {
        return request.getHeaderValues(X_REQUESTED_WITH).contains(XML_HTTP_REQUEST);
    }

    public static boolean isContentTypeJson(HttpServletRequest request) {
        return CONTENT_TYPE_JSON.equals(request.getHeader(CONTENT_TYPE));
    }

}