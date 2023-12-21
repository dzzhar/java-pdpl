package Internet;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
    private Internet internet = new RealInternet();
    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<String>();
        bannedSites.add("abc.com");
        bannedSites.add("def.com");
        bannedSites.add("ijk.com");
        bannedSites.add("lnm.com");
        bannedSites.add("facebook.com");
        bannedSites.add("instagram.com");
    }

    @Override
    public void connectTo(String serverhost) throws Exception {
        if (bannedSites.contains(serverhost.toLowerCase())) {
            throw new Exception("Access Denied");
        }
        internet.connectTo(serverhost);
    }
}

/**
 * TODO 1:
 * untuk menambahkan situs baru yang akan di ban
 * file yang akan terkena dampaknya adalah Client.java
 * 
 * TODO 2:
 * perbedaan antara proxy dan adapter
 * adapter harus menambahkan interface dan class baru
 * sedang, proxy tidak perlu menambahkan
 */
