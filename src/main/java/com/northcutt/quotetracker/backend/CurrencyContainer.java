package com.northcutt.quotetracker.backend;

public class CurrencyContainer {
    private String id;
    private String name;
    private String symbol;
    private int rank;
    private float price_usd;
    private float price_btc;

    private float market_cap_usd;
    private float available_supply;
    private float total_supply;
    private float percent_change_1h;
    private float percent_change_24h;
    private float percent_change_7d;
    private long last_updated;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public float getPrice_usd() {
        return price_usd;
    }

    public void setPrice_usd(float price_usd) {
        this.price_usd = price_usd;
    }

    public float getPrice_btc() {
        return price_btc;
    }

    public void setPrice_btc(float price_btc) {
        this.price_btc = price_btc;
    }


    public float getMarket_cap_usd() {
        return market_cap_usd;
    }

    public void setMarket_cap_usd(float market_cap_usd) {
        this.market_cap_usd = market_cap_usd;
    }

    public float getAvailable_supply() {
        return available_supply;
    }

    public void setAvailable_supply(float available_supply) {
        this.available_supply = available_supply;
    }

    public float getTotal_supply() {
        return total_supply;
    }

    public void setTotal_supply(float total_supply) {
        this.total_supply = total_supply;
    }

    public float getPercent_change_1h() {
        return percent_change_1h;
    }

    public void setPercent_change_1h(float percent_change_1h) {
        this.percent_change_1h = percent_change_1h;
    }

    public float getPercent_change_24h() {
        return percent_change_24h;
    }

    public void setPercent_change_24h(float percent_change_24h) {
        this.percent_change_24h = percent_change_24h;
    }

    public float getPercent_change_7d() {
        return percent_change_7d;
    }

    public void setPercent_change_7d(float percent_change_7d) {
        this.percent_change_7d = percent_change_7d;
    }

    public long getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(long last_updated) {
        this.last_updated = last_updated;
    }

    @Override
    public String toString() {
        return "CurrencyContainer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", rank=" + rank +
                ", price_usd=" + price_usd +
                ", price_btc=" + price_btc +
                ", market_cap_usd=" + market_cap_usd +
                ", available_supply=" + available_supply +
                ", total_supply=" + total_supply +
                ", percent_change_1h=" + percent_change_1h +
                ", percent_change_24h=" + percent_change_24h +
                ", percent_change_7d=" + percent_change_7d +
                ", last_updated=" + last_updated +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CurrencyContainer)) return false;

        CurrencyContainer that = (CurrencyContainer) o;

        if (getRank() != that.getRank()) return false;
        if (Float.compare(that.getPrice_usd(), getPrice_usd()) != 0) return false;
        if (Float.compare(that.getPrice_btc(), getPrice_btc()) != 0) return false;
        if (Float.compare(that.getMarket_cap_usd(), getMarket_cap_usd()) != 0) return false;
        if (Float.compare(that.getAvailable_supply(), getAvailable_supply()) != 0) return false;
        if (Float.compare(that.getTotal_supply(), getTotal_supply()) != 0) return false;
        if (Float.compare(that.getPercent_change_1h(), getPercent_change_1h()) != 0) return false;
        if (Float.compare(that.getPercent_change_24h(), getPercent_change_24h()) != 0) return false;
        if (Float.compare(that.getPercent_change_7d(), getPercent_change_7d()) != 0) return false;
        if (getLast_updated() != that.getLast_updated()) return false;
        if (getId() != null ? !getId().equals(that.getId()) : that.getId() != null) return false;
        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) return false;
        return getSymbol() != null ? getSymbol().equals(that.getSymbol()) : that.getSymbol() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getSymbol() != null ? getSymbol().hashCode() : 0);
        result = 31 * result + getRank();
        result = 31 * result + (getPrice_usd() != +0.0f ? Float.floatToIntBits(getPrice_usd()) : 0);
        result = 31 * result + (getPrice_btc() != +0.0f ? Float.floatToIntBits(getPrice_btc()) : 0);
        result = 31 * result + (getMarket_cap_usd() != +0.0f ? Float.floatToIntBits(getMarket_cap_usd()) : 0);
        result = 31 * result + (getAvailable_supply() != +0.0f ? Float.floatToIntBits(getAvailable_supply()) : 0);
        result = 31 * result + (getTotal_supply() != +0.0f ? Float.floatToIntBits(getTotal_supply()) : 0);
        result = 31 * result + (getPercent_change_1h() != +0.0f ? Float.floatToIntBits(getPercent_change_1h()) : 0);
        result = 31 * result + (getPercent_change_24h() != +0.0f ? Float.floatToIntBits(getPercent_change_24h()) : 0);
        result = 31 * result + (getPercent_change_7d() != +0.0f ? Float.floatToIntBits(getPercent_change_7d()) : 0);
        result = 31 * result + (int) (getLast_updated() ^ (getLast_updated() >>> 32));
        return result;
    }
}

