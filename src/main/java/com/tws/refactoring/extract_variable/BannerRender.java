package com.tws.refactoring.extract_variable;

public class BannerRender {

    void renderBanner(String platform, String browser) {
        boolean platformIsMAC = platform.toUpperCase().indexOf("MAC") > -1;
        boolean browserIsIE = browser.toUpperCase().indexOf("IE") > -1;
        if ((platformIsMAC) && (browserIsIE)) {
            // do something
        }
    }
}
