package string.substring;

public class Cutter {

    public static final int PNG_FILE_EXTENSION = 3;
    public static final int ICON_NAME_BEGIN_INDEX = 0;

    public static void main(String[] args) {
//        String icon_type0 = "Die Telekom Deutschland GmbH bьndelt das Geschдft mit Privatkunden sowie kleinen und mittleren Geschдftskunden in Deutschland auf den Gebieten Mobilfunk, Festnetz, Internet und IPTV. Die T-Systems International GmbH verkauft Produkte und Dienstleistungen an mittlere bis sehr groЯe Geschдftskunden. Der Schwerpunkt liegt dabei auf der Vermarktung komplexer Dienstleistungen und Branchenlцsungen.Die T-Mobile US Inc. ist fьr das Mobilfunkgeschдft in den Vereinigten Staaten zustдndig.(:o:)png";
        String icon_type0 = "icon1png";
// "Die Telekom Deutschland GmbH bьndelt das Geschдft mit Privatkunden sowie kleinen und mittleren Geschдftskunden in Deutschland auf den Gebieten Mobilfunk, Festnetz, Internet und IPTV. Die T-Systems International GmbH verkauft Produkte und Dienstleistungen an mittlere bis sehr groЯe Geschдftskunden. Der Schwerpunkt liegt dabei auf der Vermarktung komplexer Dienstleistungen und Branchenlцsungen.Die T-Mobile US Inc. ist fьr das Mobilfunkgeschдft in den Vereinigten Staaten zustдndig.(:o:)png";
        Cutter c = new Cutter();
        String icon1png = c.transformIconnameToFilename("icon1png");
        System.out.println(icon1png);


    }


    private String transformIconnameToFilename(String icon) {
        return (icon == null) ? null :
                icon.substring(ICON_NAME_BEGIN_INDEX, icon.length() - PNG_FILE_EXTENSION) +
                        "." + icon.substring(icon.length() - PNG_FILE_EXTENSION);
    }

}
