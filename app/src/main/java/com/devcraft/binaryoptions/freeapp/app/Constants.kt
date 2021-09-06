package com.devcraft.binaryoptions.freeapp.app

import com.devcraft.binaryoptions.freeapp.R
import com.devcraft.binaryoptions.freeapp.presentation.ui.currency.Currencies
import com.devcraft.binaryoptions.freeapp.presentation.ui.educationOfBOTrading.EducationOfBOTrading
import com.devcraft.binaryoptions.freeapp.presentation.ui.golossary.Golossary

object Constants {
    val currenciesPair: MutableList<String> = mutableListOf(
        "GBPUSD",
        "AUDUSD",
        "EURUSD",
        "USDCAD",
        "USDJPY",
        "CADJPY",
        "CADAUD",
        "GBPCAD",
        "GBPJPY",
        "EURJPY"
    )

    val currencies: MutableList<Currencies> = mutableListOf(
        Currencies(
            R.drawable.ic_gbp,
            "GBP"
        ),
        Currencies(
            R.drawable.ic_aud,
            "AUD"
        ),
        Currencies(
            R.drawable.ic_eur,
            "EUR"
        ),
        Currencies(
            R.drawable.ic_usd,
            "USD"
        ),
        Currencies(
            R.drawable.ic_jpy,
            "JPY"
        ),
        Currencies(
            R.drawable.ic_cad,
            "CAD"
        )
    )

    val dataGolossary: ArrayList<Golossary> = arrayListOf(
        Golossary(
            "Asset",
            "The instrument on which the trade is based. Binary options are traded based on currency pairs, stocks, commodities and indices.",),
        Golossary(
            "At The Money",
            "The instrument on which the trade is based. Binary options are traded based on currency pairs, stocks, commodities and indices."),
        Golossary(
            "Boundary or Range Option",
            "Instead of the usual call option or put option, you speculate that the price of the underlying asset will remain within a predetermined bandwidth."),
        Golossary(
            "Call Option",
            "With a call option you speculate that the value of the underlying asset will increase.",
        ),
        Golossary(
            "Commodities",
            "Commodities are raw materials used in the production of goods. Well-known commodities are gold, silver, palladium, oil, copper, grain, cocoa etc.",
            ),
        Golossary(
            "Digital Option",
            "A digital option is another term for a binary option."
        ),
        Golossary(
            "Early Closure",
            "Early Closure is a possibility that some binary options brokers offer. With early closure you have the option to close your binary option before the original expiration time. Thus, you can decide to take a lower guaranteed profit or to reduce your loss."
            ),
        Golossary(
            "Exotic Options",
            "Exotic options are simply more complex versions of binary options. These are used by major merchants before being made available to the public."
            ),
        Golossary(
            "Expiry Price",
            "The expiry price is the value of the underlying asset when the option expires."
        ),
        Golossary(
            "Expiry Time or Expiration",
            "This is the date and time when a binary option expires. These can vary widely but the most common expiration times of binary options are often end of day, one hour, 45m, 30m 15m, 10m, 5m and even 60 seconds."
            ),
        Golossary(
            "Forex",
            "Forex is just an abbreviated term for Foreign Exchange. The Foreign Exchange market is the second largest in the world and involves all global currencies."
            ),
        Golossary(
            "Fundamental Analysis",
            "Fundamental Analysis is used by many traders to estimate whether the rate of an asset will rise or fall. Examples of fundamental analysis are the analysis of macroeconomic figures, central bank and government decisions, growth rates, inflation figures, even the weather."
            ),
        Golossary(
            "Futures",
            "Futures are basically the same as options but often with longer contract duration and more flexibility when it comes to interim sales."
            ),
        Golossary(
            "Hedging/Fencing",
            "Hedging means buying an asset or option with the aim of reducing the risk of another investment. Binary options are considered an ideal hedging product as the risk and payment are already known in advance."
            ),
        Golossary(
            "High/Low Option",
            "This is the most common form of binary options specifying whether the price of the underlying asset will rise or decrease within a predetermined time limit."
            ),
        Golossary(
            "Index/Indices",
            "An index is a grouping of stocks."
        ),
        Golossary(
            "In-the-money",
            "In-the-money is a term used to describe when an investor achieves a profit."
            ),
        Golossary(
            "Instrument",
            "An instrument is another term used for an asset. Examples of assets are commodities, stocks, indices and currency pairs."
            ),
        Golossary(
            "Low",
            "The term “low” refers to a trade or an option that a trader feels will expire at a price lower than the target price."
            ),
        Golossary(
            "Market Price",
            "The market price is the price that reflects the current value of an underlying asset."
            ),
        Golossary(
            "No Touch",
            "With a No Touch option, you speculate that the price of the underlying asset will not reach or exceed a predetermined price level during the term of the option."
            ),
        Golossary(
            "Out-of-the-money",
            "If a trader is out-of-the-money, it means they have experienced a loss."
            ),
        Golossary(
            "One Touch",
            "With a One Touch option, one speculates whether the asset value will reach a predetermined price level before the option expires."
            ),
        Golossary(
            "Outbound Option",
            "This term is an option on a Boundary/Range Instrument and refers to when the underlying asset expires outside the higher and lower limits of the target prices."
            ),
        Golossary(
            "Payout",
            "The payout is the profit made when an option expires as expected and is in-the-money."
            ),
        Golossary(
            "Put Option",
            "Traders use a put option if they believe that the value of the underlying asset will expire at a lower price."
            ),
        Golossary(
            "Range Option",
            "Instead of the usual call option or put option, you speculate that the price of the underlying asset will remain within a predetermined bandwidth."
            ),
        Golossary(
            "Refund",
            "The refund is how much money is returned to the investor if an option expires at-the-money. How much the refund is depends on binary options broker."
            ),
        Golossary(
            "Return",
            "A return is how much money is given to the investor if an option expires in-the-money."
            ),
        Golossary(
            "Target Price",
            "This is the same as the strike price, so the price against which the binary options broker is willing to sell the option."
            ),
        Golossary(
            "Technical Analysis",
            "Technical Analysis involves studying patterns of market prices."
            ),
        Golossary(
            "Touch Option",
            "With a Touch option, you speculate that the price of the underlying asset will reach a predetermined price level within the term of the option."
            ),
        Golossary(
            "Underlying Asset",
            "The instrument on which the trade is based. Binary options are traded based on currency pairs, stocks, commodities and indices."
        )
    )

    val dataEducationOfBOTrading: ArrayList<EducationOfBOTrading> = arrayListOf(
        EducationOfBOTrading(
            R.drawable.preview_1,
            "Strategy – Going along with trends",
            EducationOfBOTrading.Article(
                R.drawable.article_img1,
                "Strategy – Going along with trends",
                R.drawable.article_chart1,
                "Regardless of what market you’re in or what asset you’re trading, one of the best ways to make money is to go along with a trend. It’s arguably the best strategy a beginner can apply.\n" +
                        "\n" +
                        "Asset prices typically move in accordance with trends. The price will rise or fall along with associated assets since the market is constantly speculating and in real-time.\n" +
                        "\n" +
                        "You must remember that a trend rarely has a straight line up or down. You will typically see an asset’s price move in a zig-zag pattern in a general direction – up or down. Recognizing the pattern allows you to estimate whether an option’s price will be higher or lower at expiry.\n" +
                        "\n" +
                        "There are two ways of trading with trends: you can either trade with overall trends or trade with swings.\n" +
                        "\n" +
                        "See the example of a trend:\n",
                "\n" + "The safer way to go about trading with trends is to focus on the trend’s overall direction. Most traders make a profit by looking at the general direction and setting an end-of-day or end-of-week expiry. This strategy doesn’t work well with short-term trades.\n" +
                        "\n" +
                        "Alternatively, you can trade with every swing in the trend. As mentioned earlier, trends typically move in a zig-zag fashion. Betting during the up or downswing can make you more money in a short period, but it is also significantly riskier.\n" +
                        "\n" +
                        "How to apply\n" +
                        "You must examine the chart and look at the trend lines. If the line is flat, find another option to trade. However, if you see that the line is going up, the price will likely go higher. The same is true if you see that the line is going down.\n" +
                        "\n" +
                        "Once you find the right asset and trend, you can use a Binary Options and make money if your speculations are correct."
            )
        ),
        EducationOfBOTrading(
            R.drawable.preview_2,
            "Strategy – Following news events",
            EducationOfBOTrading.Article(
                R.drawable.article_img2,
                "Strategy – Following news events",
                0,
                "While following the news is one of the most basic strategies, it can make you good profits. It is easier than performing technical analysis, but it requires you to read the news and stay in the loop all day, every day.\n" +
                        "\n" +
                        "Online news is only the start. You must pick up newspapers, tune into news stations, and leverage as many other sources of information as you can. The idea here is to understand the asset as deeply as possible before evaluating whether its price will rise or fall. We recommend using the “economic calendar” where are daily news and events published.\n" +
                        "\n" +
                        "You also need to reflect upon human behavior. A piece of news you find positive may not be seen as great news by the rest of the market.\n" +
                        "\n" +
                        "One of the drawbacks of using the news to make trading decisions is that you cannot tell how far up or down the price will go and how long the price movement will last because of a particular event.\n" +
                        "\n" +
                        "That being said, there are some things you can do to increase your chances of making a profit:\n" +
                        "\n" +
                        "Leverage the breakout: A breakout is a short window between the news release and its impact on the market. It can last for a few seconds or go on for a few minutes. In this strategy, you want to bet big since there are significant price movements after a breakout. Using high/low options is the right way to go.\n" +
                        "Employ boundary options: If you’re sure that an asset’s price will move but don’t know in which direction, estimate how far up or down the price could go, and use a boundary option. This way, regardless of if the news is positive or negative, you will make a profit.\n" +
                        "\n" +
                        "How to apply\n" +
                        "One of the best ways of using the news to make a profit is to follow tech companies and find out when they’re making their next announcement.\n" +
                        "\n" +
                        "If you find out they will be unveiling a new product, you can buy options and wait for your profits to roll in when everyone loves the new product.",
                ""
            )
        ),
        EducationOfBOTrading(
            R.drawable.preview_3,
            "Strategy – The Straddle Strategy",
            EducationOfBOTrading.Article(
                R.drawable.article_img3,
                "Strategy – The Straddle Strategy",
                0,
                "This strategy must be used in conjunction with the news strategy. Straddle trades must be made right before an important announcement.\n" +
                        "\n" +
                        "The asset’s value may increase for a short period after an announcement, but you must buy an option estimating that the price will come back down again.\n" +
                        "\n" +
                        "When the price starts to drop, you can call another option expecting the price to rise again.\n" +
                        "\n" +
                        "The strategy leverages the swings of a trend. You will make some money regardless of if the price goes up or down. The straddle strategy is known among traders as one of the most consistent ways to make profits – even in a volatile market.\n" +
                        "\n" +
                        "But bear in mind, pulling it off requires good analytical skills and experience in the market.\n" +
                        "\n" +
                        "How to apply\n" +
                        "Let’s assume there has been a gold mine explosion that will significantly impact the market. The price of gold will fluctuate frantically since investors don’t understand whether the price will go up or down.\n" +
                        "\n" +
                        "In this scenario, the affected companies will scramble to find a solution to continue production.\n" +
                        "\n" +
                        "Using the straddle strategy and leveraging the waxing and waning of the market in scenarios like these is an excellent way to make profits using binary options. You will benefit from the market regardless of what happens in the long run.",
                ""
            )
        ),
        EducationOfBOTrading(
            R.drawable.preview_4,
            "Strategy – The Pinocchio Strategy",
            EducationOfBOTrading.Article(
                R.drawable.article_img4,
                "Strategy – The Pinocchio Strategy",
                R.drawable.article_chart4,
                "The Pinocchio strategy is similar to the straddle strategy – it calls for deliberately betting against the current trend.\n" +
                        "\n" +
                        "In a nutshell, if an asset is experiencing an upward trend, you must place an option expecting the price to fall. By the same token, you must use an option expecting an asset’s price to rise if the asset is experiencing a downward trend.",
                "While beginners with no knowledge can apply the strategy, a deep understanding of the asset is essential to making this strategy work. Only if you understand how the asset works will you make accurate predictions and make profits.\n" +
                        "\n" +
                        "How to apply\n" +
                        "You must first look at the candlestick chart of the asset you’re looking to trade. When the candle is white or dark, it indicates that the market is bearing or bullish, respectively.\n" +
                        "\n" +
                        "If the wick of the candle points downwards, place a call option. If the wick points upwards, place a put option."
            )
        ),
        EducationOfBOTrading(
            R.drawable.preview_5,
            "Candlestick Formation Patterns Strategy",
            EducationOfBOTrading.Article(
                R.drawable.article_img5,
                "Candlestick Formation Patterns Strategy",
                R.drawable.article_chart5,
                "If you know how to read asset charts, you can try out this strategy. Candlesticks show you a lot of information about how the asset behaves over time. The candlestick’s bottom is the lowest price it hit, and its top indicates its highest price.\n" +
                        "\n" +
                        "You can also see the asset’s opening and closing price between the top and the bottom of the candlestick. In this strategy, you must observe the asset’s price over time.\n" +
                        "\n" +
                        "You will start to see formations that repeat over time, which will reveal the potential movement of the price in the future. Typically, you will see long candlesticks on the ends of the asset chart (“mountains”) and a collection of short candlesticks in between them (“valley”).",
                "How to apply\n" +
                        "If you see that the candlesticks of an asset are taller and the price is experiencing a peak, you can expect the price to fall soon. On the other hand, if you see a trough of candlesticks, you can expect the price to rise.\n" +
                        "\n" +
                        "These mountains and valleys often appear over months. You can set expiry times by looking at the frequency of a mountain and valley appearing to make a profit."
            )
        ),
        EducationOfBOTrading(
            R.drawable.preview_6,
            "The Momentum Strategy",
            EducationOfBOTrading.Article(
                R.drawable.article_img6,
                "The Momentum Strategy",
                R.drawable.article_chart6,
                "Using the momentum indicator is an excellent way to determine how fast the asset’s price is moving upwards or downwards.\n" +
                        "\n" +
                        "Learning to use the indicator can help binary options traders estimate an asset’s price in the future and make profitable trades. It is also a great method of picking the right type of Binary Option.\n" +
                        "\n" +
                        "The momentum of an asset can be analyzed in different ways:\n" + "  " +
                        "Process-oriented analysis: The momentum is analyzed by considering every period and calculating the distance it has moved on average. Many indicators calculate this value differently, but the most popular indicator of process-oriented analysis is the Average True Range.\n" + "  " +
                        "Relative analysis: A few indicators of momentum compare the price’s current movement to the asset’s historical average momentum. These indicators enable you to understand if it’s the right time to use a binary option and attempt to make profits. If there are strong movements in the asset’s price, you will be able to make super profitable trades if you can manage the high risk. You can also choose to trade assets with smaller movements and low risk to make smaller profits.\n" + "  " +
                        "Absolute analysis: These indicators compare the current price to the asset’s price in the past while ignoring everything in between. The momentum indicator is the most popular tool for absolute analysis and compares the last period’s closing price to the asset’s closing price 14 weeks ago.",
                "You will see the result of these indicators’ calculations as a percentage value with the baseline being 100.\n" +
                        "\n" +
                        "Using boundary options is one of the best ways to leverage the momentum and win trades. In fact, they are the only option type that will let you win a trade based only on the momentum.\n" +
                        "\n" +
                        "Since the two target prices in boundary options are equally far away from the current market price, you don’t have to worry about the direction in which the price is going.\n" +
                        "\n" +
                        "As long as the price is moving fast enough, you will make money."
            )
        )
    )
}