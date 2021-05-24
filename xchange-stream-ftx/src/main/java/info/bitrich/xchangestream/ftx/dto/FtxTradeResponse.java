package info.bitrich.xchangestream.ftx.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;
import java.util.Objects;

public class FtxTradeResponse implements Serializable {

  @JsonProperty("time")
  private final Date time;
  
  @JsonProperty("id")
  @JsonIgnore
  private final Long id;

  @JsonProperty("price")
  @JsonIgnore
  private final BigDecimal price;

  @JsonProperty("size")
  @JsonIgnore
  private final BigDecimal size;

  @JsonProperty("side")
  @JsonIgnore
  private final String side;

  @JsonProperty("liquidation")
  @JsonIgnore
  private final Boolean liquidation;

  public FtxTradeResponse(
      @JsonProperty("time") Date time,
      @JsonProperty("id") Long id,
      @JsonProperty("price") BigDecimal price,
      @JsonProperty("size") BigDecimal size,
      @JsonProperty("side") String side,
      @JsonProperty("liquidation") Boolean liquidation) {
    this.time = time;
    this.id = id;
    this.price = price;
    this.size = size;
    this.side = side;
    this.liquidation = liquidation;
  }

  public Date getTime() {
    return time;
  }

  public Long getId() {
    return id;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public BigDecimal getSize() {
    return size;
  }

  public String getSide() {
    return side;
  }

  public Boolean isLiquidation() {
    return liquidation;
  }

  @Override
  public String toString() {
    return "FtxTickerResponse{"
        + "time="
        + time
        + ", id="
        + id
        + ", price="
        + price
        + ", size="
        + size
        + ", side="
        + side
        + ", liquidation="
        + liquidation
        + '}';
  }

}
