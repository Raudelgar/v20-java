package com.oanda.v20.transaction;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.account.AccountID;
import com.oanda.v20.order.OrderID;
import com.oanda.v20.order.OrderPositionFill;
import com.oanda.v20.order.OrderTriggerCondition;
import com.oanda.v20.order.TimeInForce;
import com.oanda.v20.pricing.PriceValue;
import com.oanda.v20.primitives.DateTime;
import com.oanda.v20.primitives.DecimalNumber;
import com.oanda.v20.primitives.InstrumentName;

/**
 * A MarketIfTouchedOrderRejectTransaction represents the rejection of the
 * creation of a MarketIfTouched Order.
 * <p>
 * Reject MIT Order ({reason}): {units} of {instrument} @ {price}
 */
public class MarketIfTouchedOrderRejectTransaction implements Transaction {

    /**
     * Default constructor.
     */
    public MarketIfTouchedOrderRejectTransaction() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the MarketIfTouchedOrderRejectTransaction to copy
     */
    public MarketIfTouchedOrderRejectTransaction(MarketIfTouchedOrderRejectTransaction other) {
        this.id = other.id;
        this.time = other.time;
        if (other.userID != null)
        {
            this.userID = new Integer(other.userID);
        }
        this.accountID = other.accountID;
        this.batchID = other.batchID;
        this.requestID = other.requestID;
        this.type = other.type;
        this.instrument = other.instrument;
        this.units = other.units;
        this.price = other.price;
        this.priceBound = other.priceBound;
        this.timeInForce = other.timeInForce;
        this.gtdTime = other.gtdTime;
        this.positionFill = other.positionFill;
        this.triggerCondition = other.triggerCondition;
        this.reason = other.reason;
        if (other.clientExtensions != null)
        {
            this.clientExtensions = new ClientExtensions(other.clientExtensions);
        }
        if (other.takeProfitOnFill != null)
        {
            this.takeProfitOnFill = new TakeProfitDetails(other.takeProfitOnFill);
        }
        if (other.stopLossOnFill != null)
        {
            this.stopLossOnFill = new StopLossDetails(other.stopLossOnFill);
        }
        if (other.trailingStopLossOnFill != null)
        {
            this.trailingStopLossOnFill = new TrailingStopLossDetails(other.trailingStopLossOnFill);
        }
        if (other.tradeClientExtensions != null)
        {
            this.tradeClientExtensions = new ClientExtensions(other.tradeClientExtensions);
        }
        this.intendedReplacesOrderID = other.intendedReplacesOrderID;
        this.rejectReason = other.rejectReason;
    }

    @SerializedName("id") private TransactionID id;

    /**
     * Get the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @return the Transaction ID
     * @see TransactionID
     */
    public TransactionID getId() {
        return this.id;
    }

    /**
     * Set the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @param id the Transaction ID as a TransactionID
     * @return {@link MarketIfTouchedOrderRejectTransaction
     * MarketIfTouchedOrderRejectTransaction}
     * @see TransactionID
     */
    public MarketIfTouchedOrderRejectTransaction setId(TransactionID id) {
        this.id = id;
        return this;
    }
    /**
     * Set the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @param id the Transaction ID as a String
     * @return {@link MarketIfTouchedOrderRejectTransaction
     * MarketIfTouchedOrderRejectTransaction}
     * @see TransactionID
     */
    public MarketIfTouchedOrderRejectTransaction setId(String id) {
        this.id = new TransactionID(id);
        return this;
    }

    @SerializedName("time") private DateTime time;

    /**
     * Get the Time
     * <p>
     * The date/time when the Transaction was created.
     * <p>
     * @return the Time
     * @see DateTime
     */
    public DateTime getTime() {
        return this.time;
    }

    /**
     * Set the Time
     * <p>
     * The date/time when the Transaction was created.
     * <p>
     * @param time the Time as a DateTime
     * @return {@link MarketIfTouchedOrderRejectTransaction
     * MarketIfTouchedOrderRejectTransaction}
     * @see DateTime
     */
    public MarketIfTouchedOrderRejectTransaction setTime(DateTime time) {
        this.time = time;
        return this;
    }
    /**
     * Set the Time
     * <p>
     * The date/time when the Transaction was created.
     * <p>
     * @param time the Time as a String
     * @return {@link MarketIfTouchedOrderRejectTransaction
     * MarketIfTouchedOrderRejectTransaction}
     * @see DateTime
     */
    public MarketIfTouchedOrderRejectTransaction setTime(String time) {
        this.time = new DateTime(time);
        return this;
    }

    @SerializedName("userID") private Integer userID;

    /**
     * Get the User ID
     * <p>
     * The ID of the user that initiated the creation of the Transaction.
     * <p>
     * @return the User ID
     */
    public Integer getUserID() {
        return this.userID;
    }

    /**
     * Set the User ID
     * <p>
     * The ID of the user that initiated the creation of the Transaction.
     * <p>
     * @param userID the User ID as an Integer
     * @return {@link MarketIfTouchedOrderRejectTransaction
     * MarketIfTouchedOrderRejectTransaction}
     */
    public MarketIfTouchedOrderRejectTransaction setUserID(Integer userID) {
        this.userID = userID;
        return this;
    }

    @SerializedName("accountID") private AccountID accountID;

    /**
     * Get the Account ID
     * <p>
     * The ID of the Account the Transaction was created for.
     * <p>
     * @return the Account ID
     * @see AccountID
     */
    public AccountID getAccountID() {
        return this.accountID;
    }

    /**
     * Set the Account ID
     * <p>
     * The ID of the Account the Transaction was created for.
     * <p>
     * @param accountID the Account ID as an AccountID
     * @return {@link MarketIfTouchedOrderRejectTransaction
     * MarketIfTouchedOrderRejectTransaction}
     * @see AccountID
     */
    public MarketIfTouchedOrderRejectTransaction setAccountID(AccountID accountID) {
        this.accountID = accountID;
        return this;
    }
    /**
     * Set the Account ID
     * <p>
     * The ID of the Account the Transaction was created for.
     * <p>
     * @param accountID the Account ID as a String
     * @return {@link MarketIfTouchedOrderRejectTransaction
     * MarketIfTouchedOrderRejectTransaction}
     * @see AccountID
     */
    public MarketIfTouchedOrderRejectTransaction setAccountID(String accountID) {
        this.accountID = new AccountID(accountID);
        return this;
    }

    @SerializedName("batchID") private TransactionID batchID;

    /**
     * Get the Transaction Batch ID
     * <p>
     * The ID of the "batch" that the Transaction belongs to. Transactions in
     * the same batch are applied to the Account simultaneously.
     * <p>
     * @return the Transaction Batch ID
     * @see TransactionID
     */
    public TransactionID getBatchID() {
        return this.batchID;
    }

    /**
     * Set the Transaction Batch ID
     * <p>
     * The ID of the "batch" that the Transaction belongs to. Transactions in
     * the same batch are applied to the Account simultaneously.
     * <p>
     * @param batchID the Transaction Batch ID as a TransactionID
     * @return {@link MarketIfTouchedOrderRejectTransaction
     * MarketIfTouchedOrderRejectTransaction}
     * @see TransactionID
     */
    public MarketIfTouchedOrderRejectTransaction setBatchID(TransactionID batchID) {
        this.batchID = batchID;
        return this;
    }
    /**
     * Set the Transaction Batch ID
     * <p>
     * The ID of the "batch" that the Transaction belongs to. Transactions in
     * the same batch are applied to the Account simultaneously.
     * <p>
     * @param batchID the Transaction Batch ID as a String
     * @return {@link MarketIfTouchedOrderRejectTransaction
     * MarketIfTouchedOrderRejectTransaction}
     * @see TransactionID
     */
    public MarketIfTouchedOrderRejectTransaction setBatchID(String batchID) {
        this.batchID = new TransactionID(batchID);
        return this;
    }

    @SerializedName("requestID") private RequestID requestID;

    /**
     * Get the Request ID
     * <p>
     * The Request ID of the request which generated the transaction.
     * <p>
     * @return the Request ID
     * @see RequestID
     */
    public RequestID getRequestID() {
        return this.requestID;
    }

    /**
     * Set the Request ID
     * <p>
     * The Request ID of the request which generated the transaction.
     * <p>
     * @param requestID the Request ID as a RequestID
     * @return {@link MarketIfTouchedOrderRejectTransaction
     * MarketIfTouchedOrderRejectTransaction}
     * @see RequestID
     */
    public MarketIfTouchedOrderRejectTransaction setRequestID(RequestID requestID) {
        this.requestID = requestID;
        return this;
    }
    /**
     * Set the Request ID
     * <p>
     * The Request ID of the request which generated the transaction.
     * <p>
     * @param requestID the Request ID as a String
     * @return {@link MarketIfTouchedOrderRejectTransaction
     * MarketIfTouchedOrderRejectTransaction}
     * @see RequestID
     */
    public MarketIfTouchedOrderRejectTransaction setRequestID(String requestID) {
        this.requestID = new RequestID(requestID);
        return this;
    }

    @SerializedName("type") private TransactionType type = TransactionType.MARKET_IF_TOUCHED_ORDER_REJECT;

    /**
     * Get the Type
     * <p>
     * The Type of the Transaction. Always set to
     * "MARKET_IF_TOUCHED_ORDER_REJECT" in a
     * MarketIfTouchedOrderRejectTransaction.
     * <p>
     * @return the Type
     * @see TransactionType
     */
    public TransactionType getType() {
        return this.type;
    }

    /**
     * Set the Type
     * <p>
     * The Type of the Transaction. Always set to
     * "MARKET_IF_TOUCHED_ORDER_REJECT" in a
     * MarketIfTouchedOrderRejectTransaction.
     * <p>
     * @param type the Type as a TransactionType
     * @return {@link MarketIfTouchedOrderRejectTransaction
     * MarketIfTouchedOrderRejectTransaction}
     * @see TransactionType
     */
    public MarketIfTouchedOrderRejectTransaction setType(TransactionType type) {
        this.type = type;
        return this;
    }

    @SerializedName("instrument") private InstrumentName instrument;

    /**
     * Get the Instrument
     * <p>
     * The MarketIfTouched Order's Instrument.
     * <p>
     * @return the Instrument
     * @see InstrumentName
     */
    public InstrumentName getInstrument() {
        return this.instrument;
    }

    /**
     * Set the Instrument
     * <p>
     * The MarketIfTouched Order's Instrument.
     * <p>
     * @param instrument the Instrument as an InstrumentName
     * @return {@link MarketIfTouchedOrderRejectTransaction
     * MarketIfTouchedOrderRejectTransaction}
     * @see InstrumentName
     */
    public MarketIfTouchedOrderRejectTransaction setInstrument(InstrumentName instrument) {
        this.instrument = instrument;
        return this;
    }
    /**
     * Set the Instrument
     * <p>
     * The MarketIfTouched Order's Instrument.
     * <p>
     * @param instrument the Instrument as a String
     * @return {@link MarketIfTouchedOrderRejectTransaction
     * MarketIfTouchedOrderRejectTransaction}
     * @see InstrumentName
     */
    public MarketIfTouchedOrderRejectTransaction setInstrument(String instrument) {
        this.instrument = new InstrumentName(instrument);
        return this;
    }

    @SerializedName("units") private DecimalNumber units;

    /**
     * Get the Amount
     * <p>
     * The quantity requested to be filled by the MarketIfTouched Order. A
     * posititive number of units results in a long Order, and a negative
     * number of units results in a short Order.
     * <p>
     * @return the Amount
     * @see DecimalNumber
     */
    public DecimalNumber getUnits() {
        return this.units;
    }

    /**
     * Set the Amount
     * <p>
     * The quantity requested to be filled by the MarketIfTouched Order. A
     * posititive number of units results in a long Order, and a negative
     * number of units results in a short Order.
     * <p>
     * @param units the Amount as a DecimalNumber
     * @return {@link MarketIfTouchedOrderRejectTransaction
     * MarketIfTouchedOrderRejectTransaction}
     * @see DecimalNumber
     */
    public MarketIfTouchedOrderRejectTransaction setUnits(DecimalNumber units) {
        this.units = units;
        return this;
    }
    /**
     * Set the Amount
     * <p>
     * The quantity requested to be filled by the MarketIfTouched Order. A
     * posititive number of units results in a long Order, and a negative
     * number of units results in a short Order.
     * <p>
     * @param units the Amount as a String
     * @return {@link MarketIfTouchedOrderRejectTransaction
     * MarketIfTouchedOrderRejectTransaction}
     * @see DecimalNumber
     */
    public MarketIfTouchedOrderRejectTransaction setUnits(String units) {
        this.units = new DecimalNumber(units);
        return this;
    }
    /**
     * Set the Amount
     * <p>
     * The quantity requested to be filled by the MarketIfTouched Order. A
     * posititive number of units results in a long Order, and a negative
     * number of units results in a short Order.
     * <p>
     * @param units the Amount as a double
     * @return {@link MarketIfTouchedOrderRejectTransaction
     * MarketIfTouchedOrderRejectTransaction}
     * @see DecimalNumber
     */
    public MarketIfTouchedOrderRejectTransaction setUnits(double units) {
        this.units = new DecimalNumber(units);
        return this;
    }
    /**
     * Set the Amount
     * <p>
     * The quantity requested to be filled by the MarketIfTouched Order. A
     * posititive number of units results in a long Order, and a negative
     * number of units results in a short Order.
     * <p>
     * @param units the Amount as a BigDecimal
     * @return {@link MarketIfTouchedOrderRejectTransaction
     * MarketIfTouchedOrderRejectTransaction}
     * @see DecimalNumber
     */
    public MarketIfTouchedOrderRejectTransaction setUnits(BigDecimal units) {
        this.units = new DecimalNumber(units);
        return this;
    }

    @SerializedName("price") private PriceValue price;

    /**
     * Get the Price
     * <p>
     * The price threshold specified for the MarketIfTouched Order. The
     * MarketIfTouched Order will only be filled by a market price that crosses
     * this price from the direction of the market price at the time when the
     * Order was created (the initialMarketPrice). Depending on the value of
     * the Order's price and initialMarketPrice, the MarketIfTouchedOrder will
     * behave like a Limit or a Stop Order.
     * <p>
     * @return the Price
     * @see PriceValue
     */
    public PriceValue getPrice() {
        return this.price;
    }

    /**
     * Set the Price
     * <p>
     * The price threshold specified for the MarketIfTouched Order. The
     * MarketIfTouched Order will only be filled by a market price that crosses
     * this price from the direction of the market price at the time when the
     * Order was created (the initialMarketPrice). Depending on the value of
     * the Order's price and initialMarketPrice, the MarketIfTouchedOrder will
     * behave like a Limit or a Stop Order.
     * <p>
     * @param price the Price as a PriceValue
     * @return {@link MarketIfTouchedOrderRejectTransaction
     * MarketIfTouchedOrderRejectTransaction}
     * @see PriceValue
     */
    public MarketIfTouchedOrderRejectTransaction setPrice(PriceValue price) {
        this.price = price;
        return this;
    }
    /**
     * Set the Price
     * <p>
     * The price threshold specified for the MarketIfTouched Order. The
     * MarketIfTouched Order will only be filled by a market price that crosses
     * this price from the direction of the market price at the time when the
     * Order was created (the initialMarketPrice). Depending on the value of
     * the Order's price and initialMarketPrice, the MarketIfTouchedOrder will
     * behave like a Limit or a Stop Order.
     * <p>
     * @param price the Price as a String
     * @return {@link MarketIfTouchedOrderRejectTransaction
     * MarketIfTouchedOrderRejectTransaction}
     * @see PriceValue
     */
    public MarketIfTouchedOrderRejectTransaction setPrice(String price) {
        this.price = new PriceValue(price);
        return this;
    }
    /**
     * Set the Price
     * <p>
     * The price threshold specified for the MarketIfTouched Order. The
     * MarketIfTouched Order will only be filled by a market price that crosses
     * this price from the direction of the market price at the time when the
     * Order was created (the initialMarketPrice). Depending on the value of
     * the Order's price and initialMarketPrice, the MarketIfTouchedOrder will
     * behave like a Limit or a Stop Order.
     * <p>
     * @param price the Price as a double
     * @return {@link MarketIfTouchedOrderRejectTransaction
     * MarketIfTouchedOrderRejectTransaction}
     * @see PriceValue
     */
    public MarketIfTouchedOrderRejectTransaction setPrice(double price) {
        this.price = new PriceValue(price);
        return this;
    }
    /**
     * Set the Price
     * <p>
     * The price threshold specified for the MarketIfTouched Order. The
     * MarketIfTouched Order will only be filled by a market price that crosses
     * this price from the direction of the market price at the time when the
     * Order was created (the initialMarketPrice). Depending on the value of
     * the Order's price and initialMarketPrice, the MarketIfTouchedOrder will
     * behave like a Limit or a Stop Order.
     * <p>
     * @param price the Price as a BigDecimal
     * @return {@link MarketIfTouchedOrderRejectTransaction
     * MarketIfTouchedOrderRejectTransaction}
     * @see PriceValue
     */
    public MarketIfTouchedOrderRejectTransaction setPrice(BigDecimal price) {
        this.price = new PriceValue(price);
        return this;
    }

    @SerializedName("priceBound") private PriceValue priceBound;

    /**
     * Get the Price Value
     * <p>
     * The worst market price that may be used to fill this MarketIfTouched
     * Order.
     * <p>
     * @return the Price Value
     * @see PriceValue
     */
    public PriceValue getPriceBound() {
        return this.priceBound;
    }

    /**
     * Set the Price Value
     * <p>
     * The worst market price that may be used to fill this MarketIfTouched
     * Order.
     * <p>
     * @param priceBound the Price Value as a PriceValue
     * @return {@link MarketIfTouchedOrderRejectTransaction
     * MarketIfTouchedOrderRejectTransaction}
     * @see PriceValue
     */
    public MarketIfTouchedOrderRejectTransaction setPriceBound(PriceValue priceBound) {
        this.priceBound = priceBound;
        return this;
    }
    /**
     * Set the Price Value
     * <p>
     * The worst market price that may be used to fill this MarketIfTouched
     * Order.
     * <p>
     * @param priceBound the Price Value as a String
     * @return {@link MarketIfTouchedOrderRejectTransaction
     * MarketIfTouchedOrderRejectTransaction}
     * @see PriceValue
     */
    public MarketIfTouchedOrderRejectTransaction setPriceBound(String priceBound) {
        this.priceBound = new PriceValue(priceBound);
        return this;
    }
    /**
     * Set the Price Value
     * <p>
     * The worst market price that may be used to fill this MarketIfTouched
     * Order.
     * <p>
     * @param priceBound the Price Value as a double
     * @return {@link MarketIfTouchedOrderRejectTransaction
     * MarketIfTouchedOrderRejectTransaction}
     * @see PriceValue
     */
    public MarketIfTouchedOrderRejectTransaction setPriceBound(double priceBound) {
        this.priceBound = new PriceValue(priceBound);
        return this;
    }
    /**
     * Set the Price Value
     * <p>
     * The worst market price that may be used to fill this MarketIfTouched
     * Order.
     * <p>
     * @param priceBound the Price Value as a BigDecimal
     * @return {@link MarketIfTouchedOrderRejectTransaction
     * MarketIfTouchedOrderRejectTransaction}
     * @see PriceValue
     */
    public MarketIfTouchedOrderRejectTransaction setPriceBound(BigDecimal priceBound) {
        this.priceBound = new PriceValue(priceBound);
        return this;
    }

    @SerializedName("timeInForce") private TimeInForce timeInForce = TimeInForce.GTC;

    /**
     * Get the Time In Force
     * <p>
     * The time-in-force requested for the MarketIfTouched Order. Restricted to
     * "GTC", "GFD" and "GTD" for MarketIfTouched Orders.
     * <p>
     * @return the Time In Force
     * @see TimeInForce
     */
    public TimeInForce getTimeInForce() {
        return this.timeInForce;
    }

    /**
     * Set the Time In Force
     * <p>
     * The time-in-force requested for the MarketIfTouched Order. Restricted to
     * "GTC", "GFD" and "GTD" for MarketIfTouched Orders.
     * <p>
     * @param timeInForce the Time In Force as a TimeInForce
     * @return {@link MarketIfTouchedOrderRejectTransaction
     * MarketIfTouchedOrderRejectTransaction}
     * @see TimeInForce
     */
    public MarketIfTouchedOrderRejectTransaction setTimeInForce(TimeInForce timeInForce) {
        this.timeInForce = timeInForce;
        return this;
    }

    @SerializedName("gtdTime") private DateTime gtdTime;

    /**
     * Get the GTD Time
     * <p>
     * The date/time when the MarketIfTouched Order will be cancelled if its
     * timeInForce is "GTD".
     * <p>
     * @return the GTD Time
     * @see DateTime
     */
    public DateTime getGtdTime() {
        return this.gtdTime;
    }

    /**
     * Set the GTD Time
     * <p>
     * The date/time when the MarketIfTouched Order will be cancelled if its
     * timeInForce is "GTD".
     * <p>
     * @param gtdTime the GTD Time as a DateTime
     * @return {@link MarketIfTouchedOrderRejectTransaction
     * MarketIfTouchedOrderRejectTransaction}
     * @see DateTime
     */
    public MarketIfTouchedOrderRejectTransaction setGtdTime(DateTime gtdTime) {
        this.gtdTime = gtdTime;
        return this;
    }
    /**
     * Set the GTD Time
     * <p>
     * The date/time when the MarketIfTouched Order will be cancelled if its
     * timeInForce is "GTD".
     * <p>
     * @param gtdTime the GTD Time as a String
     * @return {@link MarketIfTouchedOrderRejectTransaction
     * MarketIfTouchedOrderRejectTransaction}
     * @see DateTime
     */
    public MarketIfTouchedOrderRejectTransaction setGtdTime(String gtdTime) {
        this.gtdTime = new DateTime(gtdTime);
        return this;
    }

    @SerializedName("positionFill") private OrderPositionFill positionFill = OrderPositionFill.DEFAULT;

    /**
     * Get the Position Fill
     * <p>
     * Specification of how Positions in the Account are modified when the
     * Order is filled.
     * <p>
     * @return the Position Fill
     * @see OrderPositionFill
     */
    public OrderPositionFill getPositionFill() {
        return this.positionFill;
    }

    /**
     * Set the Position Fill
     * <p>
     * Specification of how Positions in the Account are modified when the
     * Order is filled.
     * <p>
     * @param positionFill the Position Fill as an OrderPositionFill
     * @return {@link MarketIfTouchedOrderRejectTransaction
     * MarketIfTouchedOrderRejectTransaction}
     * @see OrderPositionFill
     */
    public MarketIfTouchedOrderRejectTransaction setPositionFill(OrderPositionFill positionFill) {
        this.positionFill = positionFill;
        return this;
    }

    @SerializedName("triggerCondition") private OrderTriggerCondition triggerCondition = OrderTriggerCondition.DEFAULT;

    /**
     * Get the Trigger Condition
     * <p>
     * Specification of what component of a price should be used for comparison
     * when determining if the Order should be filled.
     * <p>
     * @return the Trigger Condition
     * @see OrderTriggerCondition
     */
    public OrderTriggerCondition getTriggerCondition() {
        return this.triggerCondition;
    }

    /**
     * Set the Trigger Condition
     * <p>
     * Specification of what component of a price should be used for comparison
     * when determining if the Order should be filled.
     * <p>
     * @param triggerCondition the Trigger Condition as an
     * OrderTriggerCondition
     * @return {@link MarketIfTouchedOrderRejectTransaction
     * MarketIfTouchedOrderRejectTransaction}
     * @see OrderTriggerCondition
     */
    public MarketIfTouchedOrderRejectTransaction setTriggerCondition(OrderTriggerCondition triggerCondition) {
        this.triggerCondition = triggerCondition;
        return this;
    }

    @SerializedName("reason") private MarketIfTouchedOrderReason reason;

    /**
     * Get the Reason
     * <p>
     * The reason that the Market-if-touched Order was initiated
     * <p>
     * @return the Reason
     * @see MarketIfTouchedOrderReason
     */
    public MarketIfTouchedOrderReason getReason() {
        return this.reason;
    }

    /**
     * Set the Reason
     * <p>
     * The reason that the Market-if-touched Order was initiated
     * <p>
     * @param reason the Reason as a MarketIfTouchedOrderReason
     * @return {@link MarketIfTouchedOrderRejectTransaction
     * MarketIfTouchedOrderRejectTransaction}
     * @see MarketIfTouchedOrderReason
     */
    public MarketIfTouchedOrderRejectTransaction setReason(MarketIfTouchedOrderReason reason) {
        this.reason = reason;
        return this;
    }

    @SerializedName("clientExtensions") private ClientExtensions clientExtensions;

    /**
     * Get the Order Client Extensions
     * <p>
     * Client Extensions to add to the Order (only provided if the Order is
     * being created with client extensions).
     * <p>
     * @return the Order Client Extensions
     * @see ClientExtensions
     */
    public ClientExtensions getClientExtensions() {
        return this.clientExtensions;
    }

    /**
     * Set the Order Client Extensions
     * <p>
     * Client Extensions to add to the Order (only provided if the Order is
     * being created with client extensions).
     * <p>
     * @param clientExtensions the Order Client Extensions as a
     * ClientExtensions
     * @return {@link MarketIfTouchedOrderRejectTransaction
     * MarketIfTouchedOrderRejectTransaction}
     * @see ClientExtensions
     */
    public MarketIfTouchedOrderRejectTransaction setClientExtensions(ClientExtensions clientExtensions) {
        this.clientExtensions = clientExtensions;
        return this;
    }

    @SerializedName("takeProfitOnFill") private TakeProfitDetails takeProfitOnFill;

    /**
     * Get the Take Profit On Fill
     * <p>
     * The specification of the Take Profit Order that should be created for a
     * Trade opened when the Order is filled (if such a Trade is created).
     * <p>
     * @return the Take Profit On Fill
     * @see TakeProfitDetails
     */
    public TakeProfitDetails getTakeProfitOnFill() {
        return this.takeProfitOnFill;
    }

    /**
     * Set the Take Profit On Fill
     * <p>
     * The specification of the Take Profit Order that should be created for a
     * Trade opened when the Order is filled (if such a Trade is created).
     * <p>
     * @param takeProfitOnFill the Take Profit On Fill as a TakeProfitDetails
     * @return {@link MarketIfTouchedOrderRejectTransaction
     * MarketIfTouchedOrderRejectTransaction}
     * @see TakeProfitDetails
     */
    public MarketIfTouchedOrderRejectTransaction setTakeProfitOnFill(TakeProfitDetails takeProfitOnFill) {
        this.takeProfitOnFill = takeProfitOnFill;
        return this;
    }

    @SerializedName("stopLossOnFill") private StopLossDetails stopLossOnFill;

    /**
     * Get the Stop Loss On Fill
     * <p>
     * The specification of the Stop Loss Order that should be created for a
     * Trade opened when the Order is filled (if such a Trade is created).
     * <p>
     * @return the Stop Loss On Fill
     * @see StopLossDetails
     */
    public StopLossDetails getStopLossOnFill() {
        return this.stopLossOnFill;
    }

    /**
     * Set the Stop Loss On Fill
     * <p>
     * The specification of the Stop Loss Order that should be created for a
     * Trade opened when the Order is filled (if such a Trade is created).
     * <p>
     * @param stopLossOnFill the Stop Loss On Fill as a StopLossDetails
     * @return {@link MarketIfTouchedOrderRejectTransaction
     * MarketIfTouchedOrderRejectTransaction}
     * @see StopLossDetails
     */
    public MarketIfTouchedOrderRejectTransaction setStopLossOnFill(StopLossDetails stopLossOnFill) {
        this.stopLossOnFill = stopLossOnFill;
        return this;
    }

    @SerializedName("trailingStopLossOnFill") private TrailingStopLossDetails trailingStopLossOnFill;

    /**
     * Get the Trailing Stop Loss On Fill
     * <p>
     * The specification of the Trailing Stop Loss Order that should be created
     * for a Trade that is opened when the Order is filled (if such a Trade is
     * created).
     * <p>
     * @return the Trailing Stop Loss On Fill
     * @see TrailingStopLossDetails
     */
    public TrailingStopLossDetails getTrailingStopLossOnFill() {
        return this.trailingStopLossOnFill;
    }

    /**
     * Set the Trailing Stop Loss On Fill
     * <p>
     * The specification of the Trailing Stop Loss Order that should be created
     * for a Trade that is opened when the Order is filled (if such a Trade is
     * created).
     * <p>
     * @param trailingStopLossOnFill the Trailing Stop Loss On Fill as a
     * TrailingStopLossDetails
     * @return {@link MarketIfTouchedOrderRejectTransaction
     * MarketIfTouchedOrderRejectTransaction}
     * @see TrailingStopLossDetails
     */
    public MarketIfTouchedOrderRejectTransaction setTrailingStopLossOnFill(TrailingStopLossDetails trailingStopLossOnFill) {
        this.trailingStopLossOnFill = trailingStopLossOnFill;
        return this;
    }

    @SerializedName("tradeClientExtensions") private ClientExtensions tradeClientExtensions;

    /**
     * Get the Trade Client Extensions
     * <p>
     * Client Extensions to add to the Trade created when the Order is filled
     * (if such a Trade is created).  Do not set, modify, delete
     * tradeClientExtensions if your account is associated with MT4.
     * <p>
     * @return the Trade Client Extensions
     * @see ClientExtensions
     */
    public ClientExtensions getTradeClientExtensions() {
        return this.tradeClientExtensions;
    }

    /**
     * Set the Trade Client Extensions
     * <p>
     * Client Extensions to add to the Trade created when the Order is filled
     * (if such a Trade is created).  Do not set, modify, delete
     * tradeClientExtensions if your account is associated with MT4.
     * <p>
     * @param tradeClientExtensions the Trade Client Extensions as a
     * ClientExtensions
     * @return {@link MarketIfTouchedOrderRejectTransaction
     * MarketIfTouchedOrderRejectTransaction}
     * @see ClientExtensions
     */
    public MarketIfTouchedOrderRejectTransaction setTradeClientExtensions(ClientExtensions tradeClientExtensions) {
        this.tradeClientExtensions = tradeClientExtensions;
        return this;
    }

    @SerializedName("intendedReplacesOrderID") private OrderID intendedReplacesOrderID;

    /**
     * Get the Order ID to Replace
     * <p>
     * The ID of the Order that this Order was intended to replace (only
     * provided if this Order was intended to replace an existing Order).
     * <p>
     * @return the Order ID to Replace
     * @see OrderID
     */
    public OrderID getIntendedReplacesOrderID() {
        return this.intendedReplacesOrderID;
    }

    /**
     * Set the Order ID to Replace
     * <p>
     * The ID of the Order that this Order was intended to replace (only
     * provided if this Order was intended to replace an existing Order).
     * <p>
     * @param intendedReplacesOrderID the Order ID to Replace as an OrderID
     * @return {@link MarketIfTouchedOrderRejectTransaction
     * MarketIfTouchedOrderRejectTransaction}
     * @see OrderID
     */
    public MarketIfTouchedOrderRejectTransaction setIntendedReplacesOrderID(OrderID intendedReplacesOrderID) {
        this.intendedReplacesOrderID = intendedReplacesOrderID;
        return this;
    }
    /**
     * Set the Order ID to Replace
     * <p>
     * The ID of the Order that this Order was intended to replace (only
     * provided if this Order was intended to replace an existing Order).
     * <p>
     * @param intendedReplacesOrderID the Order ID to Replace as a String
     * @return {@link MarketIfTouchedOrderRejectTransaction
     * MarketIfTouchedOrderRejectTransaction}
     * @see OrderID
     */
    public MarketIfTouchedOrderRejectTransaction setIntendedReplacesOrderID(String intendedReplacesOrderID) {
        this.intendedReplacesOrderID = new OrderID(intendedReplacesOrderID);
        return this;
    }

    @SerializedName("rejectReason") private TransactionRejectReason rejectReason;

    /**
     * Get the Reject Reason
     * <p>
     * The reason that the Reject Transaction was created
     * <p>
     * @return the Reject Reason
     * @see TransactionRejectReason
     */
    public TransactionRejectReason getRejectReason() {
        return this.rejectReason;
    }

    /**
     * Set the Reject Reason
     * <p>
     * The reason that the Reject Transaction was created
     * <p>
     * @param rejectReason the Reject Reason as a TransactionRejectReason
     * @return {@link MarketIfTouchedOrderRejectTransaction
     * MarketIfTouchedOrderRejectTransaction}
     * @see TransactionRejectReason
     */
    public MarketIfTouchedOrderRejectTransaction setRejectReason(TransactionRejectReason rejectReason) {
        this.rejectReason = rejectReason;
        return this;
    }
}