package co.gistech.libs.countrieskit;

/**
 * Created by Ahmad R Musa <bzu.ahmad@gmail.com>.
 */

public class Country {

    protected int flagResId;
    protected String countryCode;
    protected String countryName;
    protected String flagUrl;

    public Country() {
        super();
    }

    public Country(int flagResId, String countryCode, String countryName, String flagUrl) {
        this.flagResId = flagResId;
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.flagUrl = flagUrl;
    }

    public Country(String countryCode, String countryName) {
        this.countryCode = countryCode;
        this.countryName = countryName;
    }

    public int getFlagResId() {
        return flagResId;
    }

    public void setFlagResId(int flagResId) {
        this.flagResId = flagResId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getFlagUrl() {
        return flagUrl;
    }

    public void setFlagUrl(String flagUrl) {
        this.flagUrl = flagUrl;
    }
}
